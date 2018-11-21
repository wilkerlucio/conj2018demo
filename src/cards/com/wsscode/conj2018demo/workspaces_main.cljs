(ns com.wsscode.conj2018demo.workspaces-main
  (:require [com.wsscode.conj2018demo.parser :refer [parser]]
            [com.wsscode.pathom.viz.workspaces :as pvw]
            [nubank.workspaces.core :as ws]

            [com.wsscode.conj2018demo.traces]))

(ws/defcard parser-demo
  (pvw/pathom-card {::pvw/parser #'parser}))

(ws/mount)

