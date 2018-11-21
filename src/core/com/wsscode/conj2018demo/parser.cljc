;region header
(ns com.wsscode.conj2018demo.parser
  (:require [clojure.core.async :refer [go timeout <! #?(:clj <!!)]]
            [com.wsscode.pathom.connect :as pc]
            [com.wsscode.pathom.connect.graphql :as pcg]
            [com.wsscode.pathom.connect.spacex :as spacex]
            [com.wsscode.pathom.connect.youtube :as youtube]
            [com.wsscode.pathom.core :as p]
            [com.wsscode.pathom.diplomat.http :as p.http]
            #?(:clj  [com.wsscode.pathom.diplomat.http.clj-http :as p.http.clj]
               :cljs [com.wsscode.pathom.diplomat.http.fetch :as p.http.fetch])
            #?(:cljs [nubank.workspaces.lib.local-storage :as ls])))

(defonce gql-indexes (atom {}))

(def http-driver
  #?(:clj  p.http.clj/request
     :cljs p.http.fetch/request-async))

(def youtube-token
  #?(:clj  ""
     :cljs (ls/get :youtube/token)))
;endregion

;region 1
(pc/defresolver full-name-resolver
  [env {:keys [first-name last-name]}]
  {::pc/input  #{:first-name :last-name}
   ::pc/output [:full-name]}
  {:full-name (str first-name " " last-name)})

(comment
  (entity-parse {:first-name "Wilker" :last-name "Silva"}
    []))
;endregion

;region 2
(def email-db
  {"elaina.lind@gmail.com"      {:first-name "Elaina" :last-name "Lind"}
   "shanna.harber@yahoo.com"    {:first-name "Shanna" :last-name "Harber"}
   "sydni.considine@gmail.com"  {:first-name "Sydni" :last-name "Considine"}
   "margaret.brakus@gmail.com"  {:first-name "Margaret" :last-name "Brakus"}
   "delaney.wehner@hotmail.com" {:first-name "Delaney" :last-name "Wehner"}})

(pc/defresolver email->name
  [env {:keys [email]}]
  {::pc/input  #{:email}
   ::pc/output [:first-name :last-name]}
  (get email-db email {}))

(comment
  (entity-parse {:email "elaina.lind@gmail.com"}
    []))

(comment
  (pc/compute-paths (::pc/index-oir @indexes) #{:email} #{}
    :full-name))

(comment
  (entity-parse {}
    [{[:email "elaina.lind@gmail.com"]
      [:first-name]}]))
;endregion

;region 3
(pc/defresolver all-emails
  [env _]
  {::pc/output [{:all-emails [:email]}]}
  {:all-emails (->> email-db keys (mapv #(hash-map :email %)))})

(comment
  (entity-parse {} [:all-emails]))
;endregion

;region 4
(pc/defresolver the-answer [_ _]
  {::pc/output [:answer-of-everything]}
  {:answer-of-everything 42})

(comment
  (entity-parse {} [:answer-of-everything]))
;endregion

;region 5
(def host-by-domain
  {"gmail.com"   {:host/domain "gmail.com"
                  :host/name   "Google Email"}
   "hotmail.com" {:host/domain "hotmail.com"
                  :host/name   "Microsoft Hotmail"}
   "yahoo.com"   {:host/domain "yahoo.com"
                  :host/name   "Yahoo Mail"}})

(pc/defresolver email->domain [_ {:keys [email]}]
  {::pc/input  #{:email}
   ::pc/output [:host/domain]}
  (if-let [[_ domain] (re-find #"@(.+)" email)]
    {:host/domain domain}))

(comment
  (entity-parse {:email "elaina.lind@gmail.com"}
    [:host/domain]))

(pc/defresolver host [_ {:host/keys [domain]}]
  {::pc/input  #{:host/domain}
   ::pc/output [{:host
                 [:host/domain
                  :host/name]}]}
  {:host (get host-by-domain domain)})

(comment
  (entity-parse {:email "elaina.lind@gmail.com"}
    [:email]))
;endregion

;region parser
(def app-registry
  [full-name-resolver email->name all-emails the-answer
   email->domain host
   #_ (pc/alias-resolver :spacex.launch.links/video-link :youtube.video/url)
   #_ (pc/alias-resolver :conj-pathom.favorite-launch/flight-number :spacex.launch/flight-number)
   ])

(def indexes (atom @gql-indexes))

(def parser
  (p/parallel-parser
    {::p/env     {::p/reader               [p/map-reader
                                            pc/parallel-reader
                                            pc/open-ident-reader
                                            p/env-placeholder-reader]
                  ::p/placeholder-prefixes #{">"}
                  ::youtube/access-token   youtube-token
                  ::p.http/driver          http-driver}
     ::p/plugins [(pc/connect-plugin {::pc/register app-registry
                                      ::pc/indexes  indexes})
                  #_ (youtube/youtube-plugin)
                  #_ (spacex/spacex-plugin)
                  p/error-handler-plugin
                  p/trace-plugin]}))
;endregion

;region 6
(def graphql-config
  {::pcg/url       "https://api.graph.cool/simple/v1/cjo58bqvp7k070194uq8ff9g9"
   ::pcg/prefix    "conj-pathom"
   ::pcg/ident-map {}
   ::p.http/driver http-driver})

(comment
  (go
    (reset! gql-indexes (<! (pcg/load-index graphql-config)))
    (swap! indexes pc/merge-indexes @gql-indexes)))
;endregion

;region entity-parse
#?(:clj
   (defn entity-parse [entity query]
     (<!! (parser {::p/entity (atom entity)} query))))
;endregion

(comment
  [{:spacex/past-launches
    [:spacex.launch/flight-number]}
   {:spacex/latest-launch
    [:youtube.video.snippet/title
     :youtube.video/id
     {:youtube.video/related
      [:youtube.video.snippet/title]}
     {:youtube.channel/latest-videos
      [:youtube.video.snippet/title]}]}])
