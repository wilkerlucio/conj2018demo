(ns com.wsscode.conj2018demo.traces
  (:require [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [nubank.workspaces.card-types.react :as ct.react]
            [com.wsscode.pathom.viz.trace :as pv.trace]))

(def purchase-details-trace
  '{:start    0
    :path     []
    :duration 2024
    :details
              [{:event         "process-pending"
                :duration      0
                :start         2024
                :provides
                               #{[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]}
                :merge-result? true}
               {:event "flush-watchers-loop" :duration 0 :start 2024}
               {:event "trace-done" :duration 0 :start 2024}]
    :children
              [{:start    1
                :path
                          [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]]
                :duration 2023
                :details
                          [{:event "compute-plan" :duration 0 :start 1}
                           {:event    "call-read"
                            :duration 0
                            :start    1
                            :key      [:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]}
                           {:event    "async-return"
                            :duration 0
                            :start    1
                            :key      [:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]}
                           {:event         "process-pending"
                            :duration      0
                            :start         3
                            :provides      #{:abrams.api/shard}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 3}
                           {:event     "reset-loop"
                            :duration  0
                            :start     3
                            :loop-keys [:abrams.api/shard]}
                           {:event         "process-pending"
                            :duration      0
                            :start         8
                            :provides      #{:>/expire-confirmation}
                            :merge-result? true}
                           {:event "flush-watchers-loop" :duration 0 :start 8}
                           {:event         "process-pending"
                            :duration      0
                            :start         33
                            :provides      #{:purchase/chargebacks}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 33}
                           {:event "reset-loop" :duration 0 :start 33 :loop-keys []}
                           {:event         "process-pending"
                            :duration      0
                            :start         34
                            :provides
                                           #{:purchase/merchant-id :purchase/precise-amount-origin
                                             :purchase/precise-amount
                                             :purchase/stand-in?
                                             :card/id
                                             :purchase/currency-origin
                                             :purchase.capture-mode/entry-mode
                                             :purchase/approved-reasons
                                             :purchase/postcode
                                             :purchase/time
                                             :purchase/lon
                                             :purchase/recurring
                                             :purchase/expires-on
                                             :purchase/type
                                             :purchase/mcc
                                             :purchase/charges
                                             :purchase/secure-code
                                             :purchase/source
                                             :purchase.forex/amount-origin
                                             :purchase.forex/amount-usd
                                             :purchase/account
                                             :purchase/category
                                             :purchase/result-code
                                             :purchase/acquirer-id
                                             :purchase.forex/precise-amount-origin
                                             :purchase/id
                                             :purchase.capture-mode/pin-mode
                                             :purchase.forex/currency-origin
                                             :customer/id
                                             :purchase/original-merchant-name
                                             :purchase/status
                                             :purchase/lat
                                             :purchase/secure-code-version
                                             :purchase/auth-code
                                             :purchase/denied-reasons
                                             :purchase/merchant-name
                                             :purchase/time-wallclock
                                             :purchase/amount
                                             :purchase.forex/exchange-rate
                                             :purchase/event-type
                                             :purchase/country
                                             :purchase.forex/precise-amount-usd}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 34}
                           {:event     "reset-loop"
                            :duration  0
                            :start     34
                            :loop-keys [:purchase/charges :purchase/merchant-name]}
                           {:event         "process-pending"
                            :duration      0
                            :start         34
                            :provides      #{:chargeback/all-resolved-statuses}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 34}
                           {:event "reset-loop" :duration 0 :start 34 :loop-keys []}
                           {:event         "process-pending"
                            :duration      0
                            :start         35
                            :provides      #{:purchase/open-chargeback}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 35}
                           {:event "reset-loop" :duration 0 :start 35 :loop-keys []}
                           {:event         "process-pending"
                            :duration      0
                            :start         36
                            :provides      #{:purchase/can-expire?}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 36}
                           {:event     "reset-loop"
                            :duration  0
                            :start     36
                            :loop-keys [:purchase/can-expire?]}
                           {:event         "process-pending"
                            :duration      0
                            :start         36
                            :provides      #{:purchase/can-anticipate?}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 36}
                           {:event     "reset-loop"
                            :duration  0
                            :start     36
                            :loop-keys [:purchase/can-anticipate?]}
                           {:event         "process-pending"
                            :duration      0
                            :start         36
                            :provides      #{:purchase/can-create-chargeback?}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 36}
                           {:event     "reset-loop"
                            :duration  0
                            :start     36
                            :loop-keys [:purchase/can-create-chargeback?]}
                           {:event         "process-pending"
                            :duration      0
                            :start         2023
                            :provides
                                           #{:purchase.points/has-summary? :purchase.points/status
                                             :purchase.points/label
                                             :purchase.points/redeemed-at
                                             :purchase.points/version
                                             :purchase.points/points-display
                                             :purchase.points/amount
                                             :purchase/id
                                             :purchase.points/adjustment-points
                                             :purchase.points/points}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 2023}
                           {:event "reset-loop" :duration 0 :start 2023 :loop-keys []}
                           {:event         "process-pending"
                            :duration      0
                            :start         2023
                            :provides      #{:purchase/can-classify-rewards?}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 2023}
                           {:event     "reset-loop"
                            :duration  0
                            :start     2023
                            :loop-keys [:purchase/can-classify-rewards?]}
                           {:event         "process-pending"
                            :duration      0
                            :start         2023
                            :provides      #{:>/info}
                            :merge-result? true}
                           {:event "flush-watchers-loop" :duration 0 :start 2023}
                           {:event "merge-result" :duration 0 :start 2024}]
                :name
                          "[:purchase/id #uuid \"5bc5199d-435e-4c5c-b2cd-2f4cedd1b357\"]"
                :children
                          [{:start    1
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :purchase/can-anticipate?]
                            :duration 35
                            :details
                                      [{:event    "compute-plan"
                                        :duration 0
                                        :start    1
                                        :provides
                                                  #{:purchase/can-anticipate? :purchase/merchant-id
                                                    :purchase/precise-amount-origin
                                                    :purchase/precise-amount
                                                    :purchase/stand-in?
                                                    :card/id
                                                    :purchase/currency-origin
                                                    :purchase.capture-mode/entry-mode
                                                    :purchase/approved-reasons
                                                    :purchase/postcode
                                                    :purchase/time
                                                    :purchase/lon
                                                    :purchase/recurring
                                                    :purchase/expires-on
                                                    :purchase/type
                                                    :purchase/mcc
                                                    :purchase/charges
                                                    :purchase/secure-code
                                                    :purchase/source
                                                    :purchase.forex/amount-origin
                                                    :purchase.forex/amount-usd
                                                    :purchase/account
                                                    :purchase/category
                                                    :purchase/result-code
                                                    :purchase/acquirer-id
                                                    :purchase.forex/precise-amount-origin
                                                    :purchase/id
                                                    :purchase.capture-mode/pin-mode
                                                    :purchase.forex/currency-origin
                                                    :customer/id
                                                    :purchase/original-merchant-name
                                                    :purchase/status
                                                    :purchase/lat
                                                    :purchase/secure-code-version
                                                    :purchase/auth-code
                                                    :purchase/denied-reasons
                                                    :purchase/merchant-name
                                                    :purchase/time-wallclock
                                                    :purchase/amount
                                                    :purchase.forex/exchange-rate
                                                    :purchase/event-type
                                                    :purchase/country
                                                    :purchase.forex/precise-amount-usd}
                                        :plan
                                                  (([:purchase/status
                                                     abrams.controllers.graph.purchase/purchase-simple]
                                                     [:purchase/can-anticipate?
                                                      abrams.controllers.graph.purchase/purchase-anticipable?]))}
                                       {:event       "waiting-resolver"
                                        :duration    0
                                        :start       1
                                        :waiting-key :purchase/status
                                        :input-data
                                                     {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym         abrams.controllers.graph.purchase/purchase-simple
                                        :key         :purchase/can-anticipate?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    1
                                        :key      :purchase/can-anticipate?}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    35
                                        :input-data
                                                  {:purchase/source :purchase.source/upfront-foreign
                                                   :purchase/status :purchase.status/settled}
                                        :sym      abrams.controllers.graph.purchase/purchase-anticipable?
                                        :key      :purchase/can-anticipate?}
                                       {:event    "schedule-resolver"
                                        :duration 0
                                        :start    35
                                        :label    abrams.controllers.graph.purchase/purchase-anticipable?
                                        :input-data
                                                  {:purchase/source :purchase.source/upfront-foreign
                                                   :purchase/status :purchase.status/settled}
                                        :sym      abrams.controllers.graph.purchase/purchase-anticipable?
                                        :key      :purchase/can-anticipate?}
                                       {:event    "call-resolver"
                                        :duration 0
                                        :start    35
                                        :label    abrams.controllers.graph.purchase/purchase-anticipable?
                                        :input-data
                                                  {:purchase/source :purchase.source/upfront-foreign
                                                   :purchase/status :purchase.status/settled}
                                        :sym      abrams.controllers.graph.purchase/purchase-anticipable?
                                        :key      :purchase/can-anticipate?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    36
                                        :sym      abrams.controllers.graph.purchase/purchase-anticipable?
                                        :key      :purchase/can-anticipate?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    36
                                        :key      :purchase/can-anticipate?}
                                       {:event "value-return" :duration 0 :start 36}]
                            :name     ":purchase/can-anticipate?"}
                           {:start    3
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :>/expire-confirmation]
                            :duration 5
                            :details
                                      [{:event "compute-plan" :duration 0 :start 3}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    3
                                        :key      :>/expire-confirmation}
                                       {:event    "async-return"
                                        :duration 0
                                        :start    3
                                        :key      :>/expire-confirmation}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         4
                                        :provides      #{:abrams.api/shard}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 4}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     4
                                        :loop-keys [:abrams.api/shard]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         7
                                        :provides      #{:purchase/id}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 7}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     7
                                        :loop-keys [:purchase/id]}
                                       {:event "merge-result" :duration 0 :start 8}]
                            :name     ":>/expire-confirmation"
                            :children
                                      [{:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/expire-confirmation
                                                   :purchase/id]
                                        :duration 4
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/id}
                                                   {:event "call-read" :duration 0 :start 7 :key :purchase/id}
                                                   {:event "value-return" :duration 0 :start 7}]
                                        :name     ":purchase/id"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/expire-confirmation
                                                   :abrams.api/shard]
                                        :duration 1
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :abrams.api/shard}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    4
                                                    :key      :abrams.api/shard}
                                                   {:event "value-return" :duration 0 :start 4}]
                                        :name     ":abrams.api/shard"}]}
                           {:start    2
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :purchase/can-expire?]
                            :duration 34
                            :details
                                      [{:event    "compute-plan"
                                        :duration 0
                                        :start    2
                                        :provides
                                                  #{:purchase/merchant-id :purchase/precise-amount-origin
                                                    :purchase/precise-amount
                                                    :purchase/stand-in?
                                                    :card/id
                                                    :purchase/currency-origin
                                                    :purchase.capture-mode/entry-mode
                                                    :purchase/approved-reasons
                                                    :purchase/postcode
                                                    :purchase/time
                                                    :purchase/can-expire?
                                                    :purchase/lon
                                                    :purchase/recurring
                                                    :purchase/expires-on
                                                    :purchase/type
                                                    :purchase/mcc
                                                    :purchase/charges
                                                    :purchase/secure-code
                                                    :purchase/source
                                                    :purchase.forex/amount-origin
                                                    :purchase.forex/amount-usd
                                                    :purchase/account
                                                    :purchase/category
                                                    :purchase/result-code
                                                    :purchase/acquirer-id
                                                    :purchase.forex/precise-amount-origin
                                                    :purchase/id
                                                    :purchase.capture-mode/pin-mode
                                                    :purchase.forex/currency-origin
                                                    :customer/id
                                                    :purchase/original-merchant-name
                                                    :purchase/status
                                                    :purchase/lat
                                                    :purchase/secure-code-version
                                                    :purchase/auth-code
                                                    :purchase/denied-reasons
                                                    :purchase/merchant-name
                                                    :purchase/time-wallclock
                                                    :purchase/amount
                                                    :purchase.forex/exchange-rate
                                                    :purchase/event-type
                                                    :purchase/country
                                                    :purchase.forex/precise-amount-usd}
                                        :plan
                                                  (([:purchase/status
                                                     abrams.controllers.graph.purchase/purchase-simple]
                                                     [:purchase/can-expire?
                                                      abrams.controllers.graph.purchase/can-expire?]))}
                                       {:event       "waiting-resolver"
                                        :duration    0
                                        :start       2
                                        :waiting-key :purchase/status
                                        :input-data
                                                     {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym         abrams.controllers.graph.purchase/purchase-simple
                                        :key         :purchase/can-expire?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    2
                                        :key      :purchase/can-expire?}
                                       {:event      "call-resolver-with-cache"
                                        :duration   0
                                        :start      34
                                        :input-data {:purchase/status :purchase.status/settled}
                                        :sym        abrams.controllers.graph.purchase/can-expire?
                                        :key        :purchase/can-expire?}
                                       {:event      "schedule-resolver"
                                        :duration   0
                                        :start      35
                                        :label      abrams.controllers.graph.purchase/can-expire?
                                        :input-data {:purchase/status :purchase.status/settled}
                                        :sym        abrams.controllers.graph.purchase/can-expire?
                                        :key        :purchase/can-expire?}
                                       {:event      "call-resolver"
                                        :duration   0
                                        :start      35
                                        :label      abrams.controllers.graph.purchase/can-expire?
                                        :input-data {:purchase/status :purchase.status/settled}
                                        :sym        abrams.controllers.graph.purchase/can-expire?
                                        :key        :purchase/can-expire?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    36
                                        :sym      abrams.controllers.graph.purchase/can-expire?
                                        :key      :purchase/can-expire?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    36
                                        :key      :purchase/can-expire?}
                                       {:event "value-return" :duration 0 :start 36}]
                            :name     ":purchase/can-expire?"}
                           {:start    1
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :purchase/charges]
                            :duration 33
                            :details
                                      [{:event    "skip-wait-key"
                                        :duration 0
                                        :start    1
                                        :key      :purchase/charges}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    34
                                        :key      :purchase/charges}
                                       {:event "value-return" :duration 0 :start 34}]
                            :name     ":purchase/charges"}
                           {:start    2
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :abrams.api/shard]
                            :duration 1
                            :details
                                      [{:event    "compute-plan"
                                        :duration 0
                                        :start    2
                                        :provides #{:abrams.api/shard}
                                        :plan
                                                  (([:abrams.api/shard abrams.controllers.graph.api/api-shard]))}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    2
                                        :key      :abrams.api/shard}
                                       {:event      "schedule-resolver"
                                        :duration   0
                                        :start      3
                                        :label      abrams.controllers.graph.api/api-shard
                                        :input-data {}
                                        :sym        abrams.controllers.graph.api/api-shard
                                        :key        :abrams.api/shard}
                                       {:event      "call-resolver"
                                        :duration   0
                                        :start      3
                                        :label      abrams.controllers.graph.api/api-shard
                                        :input-data {}
                                        :sym        abrams.controllers.graph.api/api-shard
                                        :key        :abrams.api/shard}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    3
                                        :sym      abrams.controllers.graph.api/api-shard
                                        :key      :abrams.api/shard}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    3
                                        :key      :abrams.api/shard}
                                       {:event "value-return" :duration 0 :start 3}]
                            :name     ":abrams.api/shard"}
                           {:start    1
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :purchase/can-create-chargeback?]
                            :duration 35
                            :details
                                      [{:event    "compute-plan"
                                        :duration 0
                                        :start    1
                                        :provides
                                                  #{:purchase/merchant-id :purchase/precise-amount-origin
                                                    :purchase/precise-amount
                                                    :purchase/stand-in?
                                                    :card/id
                                                    :purchase/currency-origin
                                                    :purchase.capture-mode/entry-mode
                                                    :purchase/approved-reasons
                                                    :purchase/postcode
                                                    :purchase/time
                                                    :purchase/lon
                                                    :purchase/recurring
                                                    :purchase/expires-on
                                                    :purchase/type
                                                    :purchase/mcc
                                                    :purchase/charges
                                                    :purchase/secure-code
                                                    :purchase/source
                                                    :purchase.forex/amount-origin
                                                    :purchase.forex/amount-usd
                                                    :purchase/account
                                                    :purchase/can-create-chargeback?
                                                    :purchase/category
                                                    :purchase/result-code
                                                    :purchase/acquirer-id
                                                    :purchase.forex/precise-amount-origin
                                                    :purchase/id
                                                    :purchase.capture-mode/pin-mode
                                                    :purchase.forex/currency-origin
                                                    :customer/id
                                                    :purchase/original-merchant-name
                                                    :purchase/status
                                                    :purchase/lat
                                                    :purchase/secure-code-version
                                                    :purchase/auth-code
                                                    :purchase/chargebacks
                                                    :purchase/denied-reasons
                                                    :chargeback/all-resolved-statuses
                                                    :purchase/open-chargeback
                                                    :purchase/merchant-name
                                                    :purchase/time-wallclock
                                                    :purchase/amount
                                                    :purchase.forex/exchange-rate
                                                    :purchase/event-type
                                                    :purchase/country
                                                    :purchase.forex/precise-amount-usd}
                                        :plan
                                                  (([:purchase/chargebacks
                                                     abrams.controllers.graph.chargeback/purchase-chargebacks]
                                                     [:chargeback/all-resolved-statuses
                                                      abrams.controllers.graph.chargeback/chargeback-resolved-statuses]
                                                     [:purchase/open-chargeback
                                                      abrams.controllers.graph.chargeback/purchase-open-chargeback]
                                                     [:purchase/source
                                                      abrams.controllers.graph.purchase/purchase-simple]
                                                     [:purchase/can-create-chargeback?
                                                      abrams.controllers.graph.chargeback/purchase-can-create-chargeback]))}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    1
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym      abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    1
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "schedule-resolver"
                                        :duration 0
                                        :start    2
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym      abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver"
                                        :duration 31
                                        :start    2
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym      abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "api-call"
                                        :duration 31
                                        :start    2
                                        :label
                                                  "GET https://prod-s0-chargebacks.nubank.com.br/api/admin/purchases/5bc5199d-435e-4c5c-b2cd-2f4cedd1b357/chargebacks"
                                        :style    {:fill "#73abff"}
                                        :url
                                                  "https://prod-s0-chargebacks.nubank.com.br/api/admin/purchases/5bc5199d-435e-4c5c-b2cd-2f4cedd1b357/chargebacks"
                                        :method   :get}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    33
                                        :sym      abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :key      :purchase/can-create-chargeback?}
                                       {:event      "call-resolver-with-cache"
                                        :duration   0
                                        :start      33
                                        :input-data {}
                                        :sym
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :key        :purchase/can-create-chargeback?}
                                       {:event      "schedule-resolver"
                                        :duration   0
                                        :start      33
                                        :label
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :input-data {}
                                        :sym
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :key        :purchase/can-create-chargeback?}
                                       {:event      "call-resolver"
                                        :duration   1
                                        :start      33
                                        :label
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :input-data {}
                                        :sym
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :key        :purchase/can-create-chargeback?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    34
                                        :sym
                                                  abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    34
                                        :input-data
                                                  {:purchase/chargebacks []
                                                   :chargeback/all-resolved-statuses
                                                                         #{:chargeback.status/conductor-legacy
                                                                           :chargeback.status/canceled
                                                                           :chargeback.status/recovered
                                                                           :chargeback.status/aborted
                                                                           :chargeback.status/expired
                                                                           :chargeback.status/first-reversed
                                                                           :chargeback.status/writeoff
                                                                           :chargeback.status/archived
                                                                           :chargeback.status/reversed}}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "schedule-resolver"
                                        :duration 0
                                        :start    35
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :input-data
                                                  {:purchase/chargebacks []
                                                   :chargeback/all-resolved-statuses
                                                                         #{:chargeback.status/conductor-legacy
                                                                           :chargeback.status/canceled
                                                                           :chargeback.status/recovered
                                                                           :chargeback.status/aborted
                                                                           :chargeback.status/expired
                                                                           :chargeback.status/first-reversed
                                                                           :chargeback.status/writeoff
                                                                           :chargeback.status/archived
                                                                           :chargeback.status/reversed}}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver"
                                        :duration 0
                                        :start    35
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :input-data
                                                  {:purchase/chargebacks []
                                                   :chargeback/all-resolved-statuses
                                                                         #{:chargeback.status/conductor-legacy
                                                                           :chargeback.status/canceled
                                                                           :chargeback.status/recovered
                                                                           :chargeback.status/aborted
                                                                           :chargeback.status/expired
                                                                           :chargeback.status/first-reversed
                                                                           :chargeback.status/writeoff
                                                                           :chargeback.status/archived
                                                                           :chargeback.status/reversed}}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    35
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event       "waiting-resolver"
                                        :duration    0
                                        :start       35
                                        :waiting-key :purchase/source
                                        :input-data
                                                     {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym         abrams.controllers.graph.purchase/purchase-simple
                                        :key         :purchase/can-create-chargeback?}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    36
                                        :input-data
                                                  {:purchase/source          :purchase.source/upfront-foreign
                                                   :purchase/open-chargeback nil}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "schedule-resolver"
                                        :duration 0
                                        :start    36
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :input-data
                                                  {:purchase/source          :purchase.source/upfront-foreign
                                                   :purchase/open-chargeback nil}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver"
                                        :duration 0
                                        :start    36
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :input-data
                                                  {:purchase/source          :purchase.source/upfront-foreign
                                                   :purchase/open-chargeback nil}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    36
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    36
                                        :key      :purchase/can-create-chargeback?}
                                       {:event "value-return" :duration 0 :start 36}]
                            :name     ":purchase/can-create-chargeback?"}
                           {:start    1
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :purchase/id]
                            :duration 0
                            :details
                                      [{:event "call-read" :duration 0 :start 1 :key :purchase/id}
                                       {:event "value-return" :duration 0 :start 1}]
                            :name     ":purchase/id"}
                           {:start    2
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :purchase/can-classify-rewards?]
                            :duration 2021
                            :details
                                      [{:event    "compute-plan"
                                        :duration 0
                                        :start    2
                                        :provides
                                                  #{:purchase.points/has-summary? :purchase/merchant-id
                                                    :purchase/precise-amount-origin
                                                    :purchase/precise-amount
                                                    :purchase.points/status
                                                    :purchase.points/label
                                                    :purchase/stand-in?
                                                    :card/id
                                                    :purchase.points/redeemed-at
                                                    :purchase/currency-origin
                                                    :purchase.capture-mode/entry-mode
                                                    :purchase.points/version
                                                    :purchase/approved-reasons
                                                    :purchase/postcode
                                                    :purchase/time
                                                    :purchase/lon
                                                    :purchase/recurring
                                                    :purchase/expires-on
                                                    :purchase/type
                                                    :purchase.points/points-display
                                                    :purchase/mcc
                                                    :purchase/charges
                                                    :purchase/secure-code
                                                    :purchase/source
                                                    :purchase.forex/amount-origin
                                                    :purchase.forex/amount-usd
                                                    :purchase/account
                                                    :purchase.points/amount
                                                    :purchase/category
                                                    :purchase/result-code
                                                    :purchase/acquirer-id
                                                    :purchase.forex/precise-amount-origin
                                                    :purchase/id
                                                    :purchase/can-classify-rewards?
                                                    :purchase.capture-mode/pin-mode
                                                    :purchase.forex/currency-origin
                                                    :customer/id
                                                    :purchase/original-merchant-name
                                                    :purchase/status
                                                    :purchase/lat
                                                    :purchase/secure-code-version
                                                    :purchase/auth-code
                                                    :purchase/denied-reasons
                                                    :purchase/merchant-name
                                                    :purchase.points/adjustment-points
                                                    :purchase/time-wallclock
                                                    :purchase/amount
                                                    :purchase.points/points
                                                    :purchase.forex/exchange-rate
                                                    :purchase/event-type
                                                    :purchase/country
                                                    :purchase.forex/precise-amount-usd}
                                        :plan
                                                  (([:customer/id
                                                     abrams.controllers.graph.purchase/purchase-simple]
                                                     [:purchase.points/has-summary?
                                                      abrams.controllers.graph.rewards/purchase-points]
                                                     [:purchase/can-classify-rewards?
                                                      abrams.controllers.graph.rewards/can-classify-rewards?])
                                                    ([:card/id abrams.controllers.graph.purchase/purchase-simple]
                                                      [:customer/id
                                                       abrams.controllers.graph.logistic/card-tracking]
                                                      [:purchase.points/has-summary?
                                                       abrams.controllers.graph.rewards/purchase-points]
                                                      [:purchase/can-classify-rewards?
                                                       abrams.controllers.graph.rewards/can-classify-rewards?]))}
                                       {:event       "waiting-resolver"
                                        :duration    0
                                        :start       2
                                        :waiting-key :customer/id
                                        :input-data
                                                     {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym         abrams.controllers.graph.purchase/purchase-simple
                                        :key         :purchase/can-classify-rewards?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    2
                                        :key      :purchase/can-classify-rewards?}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    34
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"
                                                   :customer/id #uuid "569fea0b-55a2-4cd2-aecd-3abe28e63b98"}
                                        :sym      abrams.controllers.graph.rewards/purchase-points
                                        :key      :purchase/can-classify-rewards?}
                                       {:event    "schedule-resolver"
                                        :duration 2
                                        :start    35
                                        :label    abrams.controllers.graph.rewards/purchase-points
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"
                                                   :customer/id #uuid "569fea0b-55a2-4cd2-aecd-3abe28e63b98"}
                                        :sym      abrams.controllers.graph.rewards/purchase-points
                                        :key      :purchase/can-classify-rewards?}
                                       {:event    "call-resolver"
                                        :duration 1985
                                        :start    37
                                        :label    abrams.controllers.graph.rewards/purchase-points
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"
                                                   :customer/id #uuid "569fea0b-55a2-4cd2-aecd-3abe28e63b98"}
                                        :sym      abrams.controllers.graph.rewards/purchase-points
                                        :key      :purchase/can-classify-rewards?}
                                       {:event    "api-call"
                                        :duration 1985
                                        :start    37
                                        :label
                                                  "POST https://prod-s0-chateau.nubank.com.br/api/admin/customers/569fea0b-55a2-4cd2-aecd-3abe28e63b98/purchase-points-details"
                                        :style    {:fill "#73abff"}
                                        :url
                                                  "https://prod-s0-chateau.nubank.com.br/api/admin/customers/569fea0b-55a2-4cd2-aecd-3abe28e63b98/purchase-points-details"
                                        :method   :post}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    2023
                                        :sym      abrams.controllers.graph.rewards/purchase-points
                                        :key      :purchase/can-classify-rewards?}
                                       {:event      "call-resolver-with-cache"
                                        :duration   0
                                        :start      2023
                                        :input-data {:purchase.points/has-summary? true}
                                        :sym        abrams.controllers.graph.rewards/can-classify-rewards?
                                        :key        :purchase/can-classify-rewards?}
                                       {:event      "schedule-resolver"
                                        :duration   0
                                        :start      2023
                                        :label      abrams.controllers.graph.rewards/can-classify-rewards?
                                        :input-data {:purchase.points/has-summary? true}
                                        :sym        abrams.controllers.graph.rewards/can-classify-rewards?
                                        :key        :purchase/can-classify-rewards?}
                                       {:event      "call-resolver"
                                        :duration   0
                                        :start      2023
                                        :label      abrams.controllers.graph.rewards/can-classify-rewards?
                                        :input-data {:purchase.points/has-summary? true}
                                        :sym        abrams.controllers.graph.rewards/can-classify-rewards?
                                        :key        :purchase/can-classify-rewards?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    2023
                                        :sym      abrams.controllers.graph.rewards/can-classify-rewards?
                                        :key      :purchase/can-classify-rewards?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    2023
                                        :key      :purchase/can-classify-rewards?}
                                       {:event "value-return" :duration 0 :start 2023}]
                            :name     ":purchase/can-classify-rewards?"}
                           {:start    3
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :>/info]
                            :duration 2020
                            :details
                                      [{:event "compute-plan" :duration 0 :start 3}
                                       {:event "call-read" :duration 0 :start 3 :key :>/info}
                                       {:event "async-return" :duration 0 :start 3 :key :>/info}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         7
                                        :provides      #{:purchase/id}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 7}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     7
                                        :loop-keys [:purchase/id]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         7
                                        :provides      #{:purchase/id}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 7}
                                       {:event "reset-loop" :duration 0 :start 7 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         8
                                        :provides      #{:abrams.api/shard}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 8}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     8
                                        :loop-keys [:abrams.api/shard]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         34
                                        :provides      #{:purchase/precise-amount}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 34}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     34
                                        :loop-keys [:purchase/precise-amount]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         34
                                        :provides      #{:purchase/stand-in?}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 34}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     34
                                        :loop-keys [:purchase/stand-in?]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         34
                                        :provides      #{:purchase/lat}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 34}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     34
                                        :loop-keys [:purchase/lat]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         35
                                        :provides      #{:purchase/result-code}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 35}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     35
                                        :loop-keys [:purchase/result-code]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         35
                                        :provides      #{:purchase/source}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 35}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     35
                                        :loop-keys [:purchase/source]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         35
                                        :provides      #{:purchase.capture-mode/entry-mode}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 35}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     35
                                        :loop-keys [:purchase.capture-mode/entry-mode]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         35
                                        :provides      #{:purchase/auth-code}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 35}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     35
                                        :loop-keys [:purchase/auth-code]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         36
                                        :provides      #{:card/id}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 36}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     36
                                        :loop-keys [:card/id]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         36
                                        :provides      #{:purchase/time}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 36}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     36
                                        :loop-keys [:purchase/time]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         37
                                        :provides      #{:>/purchase-merchant}
                                        :merge-result? true}
                                       {:event "flush-watchers-loop" :duration 0 :start 37}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         37
                                        :provides      #{:purchase.forex/precise-amount-origin}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 37}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     37
                                        :loop-keys [:purchase.forex/precise-amount-origin]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         37
                                        :provides      #{:purchase/secure-code-version}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 37}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     37
                                        :loop-keys [:purchase/secure-code-version]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         37
                                        :provides      #{:purchase/recurring}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 37}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     37
                                        :loop-keys [:purchase/recurring]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         37
                                        :provides      #{:purchase.forex/exchange-rate}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 37}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     37
                                        :loop-keys [:purchase.forex/exchange-rate]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         38
                                        :provides      #{:purchase/status}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 38}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     38
                                        :loop-keys [:purchase/status]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         38
                                        :provides      #{:purchase.forex/currency-origin}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 38}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     38
                                        :loop-keys [:purchase.forex/currency-origin]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         38
                                        :provides      #{:purchase/charges}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 38}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     38
                                        :loop-keys [:purchase/charges]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         38
                                        :provides      #{:purchase/type}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 38}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     38
                                        :loop-keys [:purchase/type]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         38
                                        :provides      #{:purchase/denied-reasons}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 38}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     38
                                        :loop-keys [:purchase/denied-reasons]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         39
                                        :provides      #{:purchase.capture-mode/pin-mode}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 39}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     39
                                        :loop-keys [:purchase.capture-mode/pin-mode]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         39
                                        :provides      #{:purchase/category}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 39}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     39
                                        :loop-keys [:purchase/category]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         39
                                        :provides      #{:purchase/lon}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 39}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     39
                                        :loop-keys [:purchase/lon]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         39
                                        :provides      #{:purchase.forex/precise-amount-usd}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 39}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     39
                                        :loop-keys [:purchase.forex/precise-amount-usd]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         39
                                        :provides      #{:purchase/approved-reasons}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 39}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     40
                                        :loop-keys [:purchase/approved-reasons]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         40
                                        :provides      #{:purchase/expires-on}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 40}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     40
                                        :loop-keys [:purchase/expires-on]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         40
                                        :provides      #{:purchase/secure-code}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 40}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     40
                                        :loop-keys [:purchase/secure-code]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         64
                                        :provides
                                                       #{:card.pan/masked :card/status-detail :card/status
                                                         :card.product/id
                                                         :card/printed-name
                                                         :card/id
                                                         :card/authorizer
                                                         :card/card-number
                                                         :card.pan/id
                                                         :card/member-since
                                                         :card.pan/encrypted
                                                         :card.pan/hashed
                                                         :card/type
                                                         :card/good-through
                                                         :card/pin}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 64}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     64
                                        :loop-keys [:card/type]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         64
                                        :provides      #{:purchase/nsu}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 64}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     64
                                        :loop-keys [:purchase/nsu]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         115
                                        :provides
                                                       #{:purchase.forex/deltas-total-amount :purchase.forex/deltas
                                                         :purchase.forex/deltas-status}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 115}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     115
                                        :loop-keys [:purchase.forex/deltas]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         2023
                                        :provides      #{:purchase.points/label}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 2023}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     2023
                                        :loop-keys [:purchase.points/label]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         2023
                                        :provides      #{:purchase.points/redeemed-at}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 2023}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     2023
                                        :loop-keys [:purchase.points/redeemed-at]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         2023
                                        :provides      #{:purchase.points/points-display}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 2023}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     2023
                                        :loop-keys [:purchase.points/points-display]}
                                       {:event "merge-result" :duration 0 :start 2023}]
                            :name     ":>/info"
                            :children
                                      [{:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/precise-amount]
                                        :duration 31
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/precise-amount}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    34
                                                    :key      :purchase/precise-amount}
                                                   {:event "value-return" :duration 0 :start 34}]
                                        :name     ":purchase/precise-amount"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.points/label]
                                        :duration 2017
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase.points/label}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    2023
                                                    :key      :purchase.points/label}
                                                   {:event "value-return" :duration 0 :start 2023}]
                                        :name     ":purchase.points/label"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/stand-in?]
                                        :duration 28
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/stand-in?}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    34
                                                    :key      :purchase/stand-in?}
                                                   {:event "value-return" :duration 0 :start 34}]
                                        :name     ":purchase/stand-in?"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :card/id]
                                        :duration 30
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :card/id}
                                                   {:event "call-read" :duration 0 :start 36 :key :card/id}
                                                   {:event "value-return" :duration 0 :start 36}]
                                        :name     ":card/id"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.points/redeemed-at]
                                        :duration 2017
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase.points/redeemed-at}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    2023
                                                    :key      :purchase.points/redeemed-at}
                                                   {:event "value-return" :duration 0 :start 2023}]
                                        :name     ":purchase.points/redeemed-at"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.capture-mode/entry-mode]
                                        :duration 32
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.capture-mode/entry-mode}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    35
                                                    :key      :purchase.capture-mode/entry-mode}
                                                   {:event "value-return" :duration 0 :start 35}]
                                        :name     ":purchase.capture-mode/entry-mode"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :>/purchase-merchant]
                                        :duration 31
                                        :details
                                                  [{:event "compute-plan" :duration 0 :start 6}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    6
                                                    :key      :>/purchase-merchant}
                                                   {:event    "async-return"
                                                    :duration 0
                                                    :start    6
                                                    :key      :>/purchase-merchant}
                                                   {:event         "process-pending"
                                                    :duration      0
                                                    :start         11
                                                    :provides      #{:purchase/id}
                                                    :merge-result? false}
                                                   {:event "flush-watchers-loop" :duration 0 :start 11}
                                                   {:event     "reset-loop"
                                                    :duration  0
                                                    :start     11
                                                    :loop-keys [:purchase/id]}
                                                   {:event         "process-pending"
                                                    :duration      0
                                                    :start         34
                                                    :provides      #{:purchase/original-merchant-name}
                                                    :merge-result? false}
                                                   {:event "flush-watchers-loop" :duration 0 :start 34}
                                                   {:event     "reset-loop"
                                                    :duration  0
                                                    :start     34
                                                    :loop-keys [:purchase/original-merchant-name]}
                                                   {:event         "process-pending"
                                                    :duration      0
                                                    :start         35
                                                    :provides      #{:purchase/merchant-name}
                                                    :merge-result? false}
                                                   {:event "flush-watchers-loop" :duration 0 :start 35}
                                                   {:event     "reset-loop"
                                                    :duration  0
                                                    :start     35
                                                    :loop-keys [:purchase/merchant-name]}
                                                   {:event         "process-pending"
                                                    :duration      0
                                                    :start         36
                                                    :provides      #{:purchase/name-edited?}
                                                    :merge-result? false}
                                                   {:event "flush-watchers-loop" :duration 0 :start 36}
                                                   {:event     "reset-loop"
                                                    :duration  0
                                                    :start     36
                                                    :loop-keys [:purchase/name-edited?]}
                                                   {:event "merge-result" :duration 0 :start 37}]
                                        :name     ":>/purchase-merchant"
                                        :children
                                                  [{:start    7
                                                    :path
                                                              [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                               :>/info
                                                               :>/purchase-merchant
                                                               :purchase/id]
                                                    :duration 4
                                                    :details
                                                              [{:event    "external-wait-key"
                                                                :duration 0
                                                                :start    7
                                                                :key      :purchase/id}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    11
                                                                :key      :purchase/id}
                                                               {:event "value-return" :duration 0 :start 11}]
                                                    :name     ":purchase/id"}
                                                   {:start    7
                                                    :path
                                                              [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                               :>/info
                                                               :>/purchase-merchant
                                                               :purchase/merchant-name]
                                                    :duration 28
                                                    :details
                                                              [{:event    "external-wait-key"
                                                                :duration 0
                                                                :start    7
                                                                :key      :purchase/merchant-name}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    35
                                                                :key      :purchase/merchant-name}
                                                               {:event "value-return" :duration 0 :start 35}]
                                                    :name     ":purchase/merchant-name"}
                                                   {:start    7
                                                    :path
                                                              [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                               :>/info
                                                               :>/purchase-merchant
                                                               :purchase/original-merchant-name]
                                                    :duration 27
                                                    :details
                                                              [{:event    "external-wait-key"
                                                                :duration 0
                                                                :start    7
                                                                :key      :purchase/original-merchant-name}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    34
                                                                :key      :purchase/original-merchant-name}
                                                               {:event "value-return" :duration 0 :start 34}]
                                                    :name     ":purchase/original-merchant-name"}
                                                   {:start    7
                                                    :path
                                                              [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                               :>/info
                                                               :>/purchase-merchant
                                                               :purchase/name-edited?]
                                                    :duration 29
                                                    :details
                                                              [{:event    "compute-plan"
                                                                :duration 1
                                                                :start    7
                                                                :provides
                                                                          #{:purchase/merchant-id :purchase/precise-amount-origin
                                                                            :purchase/precise-amount
                                                                            :purchase/stand-in?
                                                                            :card/id
                                                                            :purchase/currency-origin
                                                                            :purchase.capture-mode/entry-mode
                                                                            :purchase/approved-reasons
                                                                            :purchase/postcode
                                                                            :purchase/time
                                                                            :purchase/lon
                                                                            :purchase/recurring
                                                                            :purchase/expires-on
                                                                            :purchase/type
                                                                            :purchase/mcc
                                                                            :purchase/charges
                                                                            :purchase/secure-code
                                                                            :purchase/source
                                                                            :purchase.forex/amount-origin
                                                                            :purchase.forex/amount-usd
                                                                            :purchase/account
                                                                            :purchase/category
                                                                            :purchase/name-edited?
                                                                            :purchase/result-code
                                                                            :purchase/acquirer-id
                                                                            :purchase.forex/precise-amount-origin
                                                                            :purchase/id
                                                                            :purchase.capture-mode/pin-mode
                                                                            :purchase.forex/currency-origin
                                                                            :customer/id
                                                                            :purchase/original-merchant-name
                                                                            :purchase/status
                                                                            :purchase/lat
                                                                            :purchase/secure-code-version
                                                                            :purchase/auth-code
                                                                            :purchase/denied-reasons
                                                                            :purchase/merchant-name
                                                                            :purchase/time-wallclock
                                                                            :purchase/amount
                                                                            :purchase.forex/exchange-rate
                                                                            :purchase/event-type
                                                                            :purchase/country
                                                                            :purchase.forex/precise-amount-usd}
                                                                :plan
                                                                          (([:purchase/original-merchant-name
                                                                             abrams.controllers.graph.purchase/purchase-simple]
                                                                             [:purchase/name-edited?
                                                                              abrams.controllers.graph.purchase/name-edited?]))}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    7
                                                                :key      :purchase/name-edited?}
                                                               {:event       "waiting-resolver"
                                                                :duration    0
                                                                :start       8
                                                                :waiting-key :purchase/original-merchant-name
                                                                :input-data
                                                                             {:purchase/id
                                                                              #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                                                :sym         abrams.controllers.graph.purchase/purchase-simple
                                                                :key         :purchase/name-edited?}
                                                               {:event    "call-resolver-with-cache"
                                                                :duration 0
                                                                :start    34
                                                                :input-data
                                                                          {:purchase/original-merchant-name "AMZN Mktp US*MT9LK7YW1"
                                                                           :purchase/merchant-name          "Amzn Mktp Us*Mt9lk7yw1"}
                                                                :sym      abrams.controllers.graph.purchase/name-edited?
                                                                :key      :purchase/name-edited?}
                                                               {:event    "schedule-resolver"
                                                                :duration 0
                                                                :start    35
                                                                :label    abrams.controllers.graph.purchase/name-edited?
                                                                :input-data
                                                                          {:purchase/original-merchant-name "AMZN Mktp US*MT9LK7YW1"
                                                                           :purchase/merchant-name          "Amzn Mktp Us*Mt9lk7yw1"}
                                                                :sym      abrams.controllers.graph.purchase/name-edited?
                                                                :key      :purchase/name-edited?}
                                                               {:event    "call-resolver"
                                                                :duration 0
                                                                :start    35
                                                                :label    abrams.controllers.graph.purchase/name-edited?
                                                                :input-data
                                                                          {:purchase/original-merchant-name "AMZN Mktp US*MT9LK7YW1"
                                                                           :purchase/merchant-name          "Amzn Mktp Us*Mt9lk7yw1"}
                                                                :sym      abrams.controllers.graph.purchase/name-edited?
                                                                :key      :purchase/name-edited?}
                                                               {:event    "merge-resolver-response"
                                                                :duration 0
                                                                :start    36
                                                                :sym      abrams.controllers.graph.purchase/name-edited?
                                                                :key      :purchase/name-edited?}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    36
                                                                :key      :purchase/name-edited?}
                                                               {:event "value-return" :duration 0 :start 36}]
                                                    :name     ":purchase/name-edited?"}]}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/approved-reasons]
                                        :duration 34
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/approved-reasons}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    40
                                                    :key      :purchase/approved-reasons}
                                                   {:event "value-return" :duration 0 :start 40}]
                                        :name     ":purchase/approved-reasons"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/time]
                                        :duration 34
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/time}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    36
                                                    :key      :purchase/time}
                                                   {:event "value-return" :duration 0 :start 37}]
                                        :name     ":purchase/time"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/lon]
                                        :duration 36
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/lon}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    39
                                                    :key      :purchase/lon}
                                                   {:event "value-return" :duration 0 :start 39}]
                                        :name     ":purchase/lon"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/recurring]
                                        :duration 31
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/recurring}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    37
                                                    :key      :purchase/recurring}
                                                   {:event "value-return" :duration 0 :start 37}]
                                        :name     ":purchase/recurring"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/expires-on]
                                        :duration 34
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/expires-on}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    40
                                                    :key      :purchase/expires-on}
                                                   {:event "value-return" :duration 0 :start 40}]
                                        :name     ":purchase/expires-on"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.forex/deltas]
                                        :duration 109
                                        :details
                                                  [{:event    "compute-plan"
                                                    :duration 0
                                                    :start    6
                                                    :provides
                                                              #{:purchase.forex/deltas-total-amount :purchase.forex/deltas
                                                                :purchase.forex/deltas-status}
                                                    :plan
                                                              (([:purchase.forex/deltas
                                                                 abrams.controllers.graph.purchase/purchase-forex]))}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "call-resolver-with-cache"
                                                    :duration 0
                                                    :start    7
                                                    :input-data
                                                              {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-forex
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "schedule-resolver"
                                                    :duration 0
                                                    :start    8
                                                    :label    abrams.controllers.graph.purchase/purchase-forex
                                                    :input-data
                                                              {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-forex
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "call-resolver"
                                                    :duration 107
                                                    :start    8
                                                    :label    abrams.controllers.graph.purchase/purchase-forex
                                                    :input-data
                                                              {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-forex
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "api-call"
                                                    :duration 106
                                                    :start    8
                                                    :label
                                                              "GET https://prod-s0-billing.nubank.com.br/api/transactions/5bc5199d-435e-4c5c-b2cd-2f4cedd1b357/forex-delta"
                                                    :style    {:fill "#73abff"}
                                                    :url
                                                              "https://prod-s0-billing.nubank.com.br/api/transactions/5bc5199d-435e-4c5c-b2cd-2f4cedd1b357/forex-delta"
                                                    :method   :get}
                                                   {:event    "merge-resolver-response"
                                                    :duration 0
                                                    :start    115
                                                    :sym      abrams.controllers.graph.purchase/purchase-forex
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    115
                                                    :key      :purchase.forex/deltas}
                                                   {:event "value-return" :duration 0 :start 115}]
                                        :name     ":purchase.forex/deltas"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/type]
                                        :duration 35
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/type}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    38
                                                    :key      :purchase/type}
                                                   {:event "value-return" :duration 0 :start 38}]
                                        :name     ":purchase/type"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.points/points-display]
                                        :duration 2017
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase.points/points-display}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    2023
                                                    :key      :purchase.points/points-display}
                                                   {:event "value-return" :duration 0 :start 2023}]
                                        :name     ":purchase.points/points-display"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/charges]
                                        :duration 35
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/charges}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    38
                                                    :key      :purchase/charges}
                                                   {:event "value-return" :duration 0 :start 38}]
                                        :name     ":purchase/charges"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/secure-code]
                                        :duration 34
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/secure-code}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    40
                                                    :key      :purchase/secure-code}
                                                   {:event "value-return" :duration 0 :start 40}]
                                        :name     ":purchase/secure-code"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/source]
                                        :duration 29
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/source}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    35
                                                    :key      :purchase/source}
                                                   {:event "value-return" :duration 0 :start 35}]
                                        :name     ":purchase/source"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :abrams.api/shard]
                                        :duration 2
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :abrams.api/shard}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    8
                                                    :key      :abrams.api/shard}
                                                   {:event "value-return" :duration 0 :start 8}]
                                        :name     ":abrams.api/shard"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/category]
                                        :duration 36
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/category}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    39
                                                    :key      :purchase/category}
                                                   {:event "value-return" :duration 0 :start 39}]
                                        :name     ":purchase/category"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/result-code]
                                        :duration 29
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/result-code}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    35
                                                    :key      :purchase/result-code}
                                                   {:event "value-return" :duration 0 :start 35}]
                                        :name     ":purchase/result-code"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.forex/precise-amount-origin]
                                        :duration 31
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase.forex/precise-amount-origin}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    37
                                                    :key      :purchase.forex/precise-amount-origin}
                                                   {:event "value-return" :duration 0 :start 37}]
                                        :name     ":purchase.forex/precise-amount-origin"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/id]
                                        :duration 4
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/id}
                                                   {:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/id}
                                                   {:event "call-read" :duration 0 :start 7 :key :purchase/id}
                                                   {:event "value-return" :duration 0 :start 7}]
                                        :name     ":purchase/id"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.capture-mode/pin-mode]
                                        :duration 36
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.capture-mode/pin-mode}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    39
                                                    :key      :purchase.capture-mode/pin-mode}
                                                   {:event "value-return" :duration 0 :start 39}]
                                        :name     ":purchase.capture-mode/pin-mode"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.forex/currency-origin]
                                        :duration 32
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase.forex/currency-origin}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    38
                                                    :key      :purchase.forex/currency-origin}
                                                   {:event "value-return" :duration 0 :start 38}]
                                        :name     ":purchase.forex/currency-origin"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/status]
                                        :duration 35
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/status}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    38
                                                    :key      :purchase/status}
                                                   {:event "value-return" :duration 0 :start 38}]
                                        :name     ":purchase/status"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/lat]
                                        :duration 32
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/lat}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    35
                                                    :key      :purchase/lat}
                                                   {:event "value-return" :duration 0 :start 35}]
                                        :name     ":purchase/lat"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/secure-code-version]
                                        :duration 31
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/secure-code-version}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    37
                                                    :key      :purchase/secure-code-version}
                                                   {:event "value-return" :duration 0 :start 37}]
                                        :name     ":purchase/secure-code-version"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/auth-code]
                                        :duration 32
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/auth-code}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    35
                                                    :key      :purchase/auth-code}
                                                   {:event "value-return" :duration 0 :start 35}]
                                        :name     ":purchase/auth-code"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/denied-reasons]
                                        :duration 32
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase/denied-reasons}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    38
                                                    :key      :purchase/denied-reasons}
                                                   {:event "value-return" :duration 0 :start 38}]
                                        :name     ":purchase/denied-reasons"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :card/type]
                                        :duration 58
                                        :details
                                                  [{:event    "compute-plan"
                                                    :duration 0
                                                    :start    6
                                                    :provides
                                                              #{:card.pan/masked :card/status-detail :purchase/merchant-id
                                                                :purchase/precise-amount-origin
                                                                :purchase/precise-amount
                                                                :card/status
                                                                :card.product/id
                                                                :purchase/stand-in?
                                                                :card/printed-name
                                                                :card/id
                                                                :purchase/currency-origin
                                                                :purchase.capture-mode/entry-mode
                                                                :card/authorizer
                                                                :purchase/approved-reasons
                                                                :purchase/postcode
                                                                :purchase/time
                                                                :purchase/lon
                                                                :purchase/recurring
                                                                :purchase/expires-on
                                                                :purchase/type
                                                                :purchase/mcc
                                                                :purchase/charges
                                                                :purchase/secure-code
                                                                :purchase/source
                                                                :purchase.forex/amount-origin
                                                                :purchase.forex/amount-usd
                                                                :purchase/account
                                                                :purchase/category
                                                                :purchase/result-code
                                                                :purchase/acquirer-id
                                                                :purchase.forex/precise-amount-origin
                                                                :purchase/id
                                                                :card/card-number
                                                                :purchase.capture-mode/pin-mode
                                                                :purchase.forex/currency-origin
                                                                :card.pan/id
                                                                :customer/id
                                                                :purchase/original-merchant-name
                                                                :purchase/status
                                                                :purchase/lat
                                                                :card/member-since
                                                                :purchase/secure-code-version
                                                                :purchase/auth-code
                                                                :card.pan/encrypted
                                                                :card.pan/hashed
                                                                :purchase/denied-reasons
                                                                :purchase/merchant-name
                                                                :card/type
                                                                :purchase/time-wallclock
                                                                :card/good-through
                                                                :purchase/amount
                                                                :purchase.forex/exchange-rate
                                                                :purchase/event-type
                                                                :card/pin
                                                                :purchase/country
                                                                :purchase.forex/precise-amount-usd}
                                                    :plan
                                                              (([:card/id
                                                                 abrams.controllers.graph.purchase/purchase-simple]
                                                                 [:card/type abrams.controllers.graph.card/card-by-id]))}
                                                   {:event "call-read" :duration 0 :start 6 :key :card/type}
                                                   {:event       "waiting-resolver"
                                                    :duration    0
                                                    :start       7
                                                    :waiting-key :card/id
                                                    :input-data
                                                                 {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                                    :sym         abrams.controllers.graph.purchase/purchase-simple
                                                    :key         :card/type}
                                                   {:event    "call-resolver-with-cache"
                                                    :duration 0
                                                    :start    34
                                                    :input-data
                                                              {:card/id #uuid "56a017f8-1770-4ba1-b958-6475e341cb20"}
                                                    :sym      abrams.controllers.graph.card/card-by-id
                                                    :key      :card/type}
                                                   {:event    "schedule-resolver"
                                                    :duration 0
                                                    :start    35
                                                    :label    abrams.controllers.graph.card/card-by-id
                                                    :input-data
                                                              {:card/id #uuid "56a017f8-1770-4ba1-b958-6475e341cb20"}
                                                    :sym      abrams.controllers.graph.card/card-by-id
                                                    :key      :card/type}
                                                   {:event    "call-resolver"
                                                    :duration 28
                                                    :start    35
                                                    :label    abrams.controllers.graph.card/card-by-id
                                                    :input-data
                                                              {:card/id #uuid "56a017f8-1770-4ba1-b958-6475e341cb20"}
                                                    :sym      abrams.controllers.graph.card/card-by-id
                                                    :key      :card/type}
                                                   {:event    "api-call"
                                                    :duration 28
                                                    :start    35
                                                    :label
                                                              "GET https://prod-s0-credit-card-accounts.nubank.com.br/api/admin/cards/56a017f8-1770-4ba1-b958-6475e341cb20"
                                                    :style    {:fill "#73abff"}
                                                    :url
                                                              "https://prod-s0-credit-card-accounts.nubank.com.br/api/admin/cards/56a017f8-1770-4ba1-b958-6475e341cb20"
                                                    :method   :get}
                                                   {:event    "merge-resolver-response"
                                                    :duration 0
                                                    :start    64
                                                    :sym      abrams.controllers.graph.card/card-by-id
                                                    :key      :card/type}
                                                   {:event "call-read" :duration 0 :start 64 :key :card/type}
                                                   {:event "value-return" :duration 0 :start 64}]
                                        :name     ":card/type"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.forex/exchange-rate]
                                        :duration 31
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase.forex/exchange-rate}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    37
                                                    :key      :purchase.forex/exchange-rate}
                                                   {:event "value-return" :duration 0 :start 37}]
                                        :name     ":purchase.forex/exchange-rate"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase/nsu]
                                        :duration 61
                                        :details
                                                  [{:event    "compute-plan"
                                                    :duration 0
                                                    :start    3
                                                    :provides #{:purchase/nsu}
                                                    :plan
                                                              (([:purchase/nsu
                                                                 abrams.controllers.graph.purchase/purchase-nsu]))}
                                                   {:event    "call-resolver-with-cache"
                                                    :duration 0
                                                    :start    3
                                                    :input-data
                                                              {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-nsu
                                                    :key      :purchase/nsu}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/nsu}
                                                   {:event    "schedule-resolver"
                                                    :duration 0
                                                    :start    4
                                                    :label    abrams.controllers.graph.purchase/purchase-nsu
                                                    :input-data
                                                              {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-nsu
                                                    :key      :purchase/nsu}
                                                   {:event    "call-resolver"
                                                    :duration 60
                                                    :start    4
                                                    :label    abrams.controllers.graph.purchase/purchase-nsu
                                                    :input-data
                                                              {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-nsu
                                                    :key      :purchase/nsu}
                                                   {:event    "api-call"
                                                    :duration 60
                                                    :start    4
                                                    :label
                                                              "GET https://prod-s0-insulator.nubank.com.br/api/admin/transactions/5bc5199d-435e-4c5c-b2cd-2f4cedd1b357/nsu"
                                                    :style    {:fill "#73abff"}
                                                    :url
                                                              "https://prod-s0-insulator.nubank.com.br/api/admin/transactions/5bc5199d-435e-4c5c-b2cd-2f4cedd1b357/nsu"
                                                    :method   :get}
                                                   {:event    "merge-resolver-response"
                                                    :duration 0
                                                    :start    64
                                                    :sym      abrams.controllers.graph.purchase/purchase-nsu
                                                    :key      :purchase/nsu}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    64
                                                    :key      :purchase/nsu}
                                                   {:event "value-return" :duration 0 :start 64}]
                                        :name     ":purchase/nsu"}
                                       {:start    6
                                        :path
                                                  [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                                   :>/info
                                                   :purchase.forex/precise-amount-usd]
                                        :duration 33
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    6
                                                    :key      :purchase.forex/precise-amount-usd}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    39
                                                    :key      :purchase.forex/precise-amount-usd}
                                                   {:event "value-return" :duration 0 :start 39}]
                                        :name     ":purchase.forex/precise-amount-usd"}]}
                           {:start    1
                            :path
                                      [[:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"]
                                       :purchase/merchant-name]
                            :duration 33
                            :details
                                      [{:event    "compute-plan"
                                        :duration 0
                                        :start    1
                                        :provides
                                                  #{:purchase/merchant-id :purchase/precise-amount-origin
                                                    :purchase/precise-amount
                                                    :purchase/stand-in?
                                                    :card/id
                                                    :purchase/currency-origin
                                                    :purchase.capture-mode/entry-mode
                                                    :purchase/approved-reasons
                                                    :purchase/postcode
                                                    :purchase/time
                                                    :purchase/lon
                                                    :purchase/recurring
                                                    :purchase/expires-on
                                                    :purchase/type
                                                    :purchase/mcc
                                                    :purchase/charges
                                                    :purchase/secure-code
                                                    :purchase/source
                                                    :purchase.forex/amount-origin
                                                    :purchase.forex/amount-usd
                                                    :purchase/account
                                                    :purchase/category
                                                    :purchase/result-code
                                                    :purchase/acquirer-id
                                                    :purchase.forex/precise-amount-origin
                                                    :purchase/id
                                                    :purchase.capture-mode/pin-mode
                                                    :purchase.forex/currency-origin
                                                    :customer/id
                                                    :purchase/original-merchant-name
                                                    :purchase/status
                                                    :purchase/lat
                                                    :purchase/secure-code-version
                                                    :purchase/auth-code
                                                    :purchase/denied-reasons
                                                    :purchase/merchant-name
                                                    :purchase/time-wallclock
                                                    :purchase/amount
                                                    :purchase.forex/exchange-rate
                                                    :purchase/event-type
                                                    :purchase/country
                                                    :purchase.forex/precise-amount-usd}
                                        :plan
                                                  (([:purchase/merchant-name
                                                     abrams.controllers.graph.purchase/purchase-simple]))}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    1
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym      abrams.controllers.graph.purchase/purchase-simple
                                        :key      :purchase/merchant-name}
                                       {:event    "schedule-resolver"
                                        :duration 0
                                        :start    1
                                        :label    abrams.controllers.graph.purchase/purchase-simple
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym      abrams.controllers.graph.purchase/purchase-simple
                                        :key      :purchase/merchant-name}
                                       {:event    "call-resolver"
                                        :duration 33
                                        :start    1
                                        :label    abrams.controllers.graph.purchase/purchase-simple
                                        :input-data
                                                  {:purchase/id #uuid "5bc5199d-435e-4c5c-b2cd-2f4cedd1b357"}
                                        :sym      abrams.controllers.graph.purchase/purchase-simple
                                        :key      :purchase/merchant-name}
                                       {:event    "api-call"
                                        :duration 32
                                        :start    1
                                        :label
                                                  "GET https://prod-s0-feed.nubank.com.br/api/transactions/5bc5199d-435e-4c5c-b2cd-2f4cedd1b357/simple"
                                        :style    {:fill "#73abff"}
                                        :url
                                                  "https://prod-s0-feed.nubank.com.br/api/transactions/5bc5199d-435e-4c5c-b2cd-2f4cedd1b357/simple"
                                        :method   :get}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    1
                                        :key      :purchase/merchant-name}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    34
                                        :sym      abrams.controllers.graph.purchase/purchase-simple
                                        :key      :purchase/merchant-name}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    34
                                        :key      :purchase/merchant-name}
                                       {:event "value-return" :duration 0 :start 34}]
                            :name     ":purchase/merchant-name"}]}
               {:start    1
                :path     [:com.wsscode.pathom/trace]
                :duration 0
                :details
                          [{:event "compute-plan" :duration 0 :start 1}
                           {:event    "call-read"
                            :duration 0
                            :start    1
                            :key      :com.wsscode.pathom/trace}
                           {:event "value-return" :duration 0 :start 1}
                           {:event    "skip-resolved-key"
                            :duration 0
                            :start    1
                            :key      :com.wsscode.pathom/trace}]
                :name     ":com.wsscode.pathom/trace"}]
    :hint     "Query"})

(ws/defcard trace-purchase-details
  {::wsm/align {:display "flex"
                :width   "100%"}}
  (ct.react/react-card
    (pv.trace/d3-trace {::pv.trace/trace-data      purchase-details-trace
                        ::pv.trace/on-show-details #(js/console.log %)})))

(def purchase-details-trace-after
  '{:start    0
    :path     []
    :duration 106
    :details
              [{:event         "process-pending"
                :duration      0
                :start         106
                :provides
                               #{[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]}
                :merge-result? true}
               {:event "flush-watchers-loop" :duration 0 :start 106}
               {:event "trace-done" :duration 0 :start 106}]
    :children
              [{:start    0
                :path
                          [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]]
                :duration 106
                :details
                          [{:event "compute-plan" :duration 0 :start 0}
                           {:event    "call-read"
                            :duration 0
                            :start    0
                            :key      [:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]}
                           {:event    "async-return"
                            :duration 0
                            :start    0
                            :key      [:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]}
                           {:event         "process-pending"
                            :duration      0
                            :start         2
                            :provides      #{:abrams.api/shard}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 2}
                           {:event     "reset-loop"
                            :duration  0
                            :start     2
                            :loop-keys [:abrams.api/shard]}
                           {:event         "process-pending"
                            :duration      0
                            :start         2
                            :provides      #{:purchase/can-expire?}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 2}
                           {:event     "reset-loop"
                            :duration  0
                            :start     2
                            :loop-keys [:purchase/can-expire?]}
                           {:event         "process-pending"
                            :duration      0
                            :start         6
                            :provides      #{:>/expire-confirmation}
                            :merge-result? true}
                           {:event "flush-watchers-loop" :duration 0 :start 6}
                           {:event         "process-pending"
                            :duration      0
                            :start         26
                            :provides      #{:purchase/chargebacks}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 26}
                           {:event "reset-loop" :duration 0 :start 26 :loop-keys []}
                           {:event         "process-pending"
                            :duration      0
                            :start         26
                            :provides      #{:chargeback/all-resolved-statuses}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 26}
                           {:event "reset-loop" :duration 0 :start 26 :loop-keys []}
                           {:event         "process-pending"
                            :duration      0
                            :start         27
                            :provides      #{:purchase/open-chargeback}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 27}
                           {:event "reset-loop" :duration 0 :start 27 :loop-keys []}
                           {:event         "process-pending"
                            :duration      0
                            :start         27
                            :provides      #{:purchase/can-create-chargeback?}
                            :merge-result? false}
                           {:event "flush-watchers-loop" :duration 0 :start 27}
                           {:event     "reset-loop"
                            :duration  0
                            :start     27
                            :loop-keys [:purchase/can-create-chargeback?]}
                           {:event         "process-pending"
                            :duration      0
                            :start         106
                            :provides      #{:>/info}
                            :merge-result? true}
                           {:event "flush-watchers-loop" :duration 0 :start 106}
                           {:event "merge-result" :duration 0 :start 106}]
                :name
                          "[:purchase/id #uuid \"5be8370a-15bc-49f7-b3c8-89b51118c7ea\"]"
                :children
                          [{:start    0
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :purchase/can-anticipate?]
                            :duration 0
                            :details
                                      [{:event    "call-read"
                                        :duration 0
                                        :start    0
                                        :key      :purchase/can-anticipate?}
                                       {:event "value-return" :duration 0 :start 0}]
                            :name     ":purchase/can-anticipate?"}
                           {:start    2
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :>/expire-confirmation]
                            :duration 4
                            :details
                                      [{:event "compute-plan" :duration 0 :start 2}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    2
                                        :key      :>/expire-confirmation}
                                       {:event    "async-return"
                                        :duration 0
                                        :start    2
                                        :key      :>/expire-confirmation}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         3
                                        :provides      #{:abrams.api/shard}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 3}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     4
                                        :loop-keys [:abrams.api/shard]}
                                       {:event "merge-result" :duration 0 :start 6}]
                            :name     ":>/expire-confirmation"
                            :children
                                      [{:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/expire-confirmation
                                                   :purchase/id]
                                        :duration 0
                                        :details
                                                  [{:event "call-read" :duration 0 :start 2 :key :purchase/id}
                                                   {:event "value-return" :duration 0 :start 2}]
                                        :name     ":purchase/id"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/expire-confirmation
                                                   :abrams.api/shard]
                                        :duration 2
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    2
                                                    :key      :abrams.api/shard}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    4
                                                    :key      :abrams.api/shard}
                                                   {:event "value-return" :duration 0 :start 4}]
                                        :name     ":abrams.api/shard"}]}
                           {:start    1
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :purchase/can-expire?]
                            :duration 1
                            :details
                                      [{:event    "compute-plan"
                                        :duration 0
                                        :start    1
                                        :provides #{:purchase/can-expire?}
                                        :plan
                                                  (([:purchase/can-expire?
                                                     abrams.controllers.graph.purchase/can-expire?]))}
                                       {:event      "call-resolver-with-cache"
                                        :duration   0
                                        :start      1
                                        :input-data {:purchase/status :purchase.status/unsettled}
                                        :sym        abrams.controllers.graph.purchase/can-expire?
                                        :key        :purchase/can-expire?}
                                       {:event      "schedule-resolver"
                                        :duration   0
                                        :start      1
                                        :label      abrams.controllers.graph.purchase/can-expire?
                                        :input-data {:purchase/status :purchase.status/unsettled}
                                        :sym        abrams.controllers.graph.purchase/can-expire?
                                        :key        :purchase/can-expire?}
                                       {:event      "call-resolver"
                                        :duration   0
                                        :start      1
                                        :label      abrams.controllers.graph.purchase/can-expire?
                                        :input-data {:purchase/status :purchase.status/unsettled}
                                        :sym        abrams.controllers.graph.purchase/can-expire?
                                        :key        :purchase/can-expire?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    1
                                        :key      :purchase/can-expire?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    2
                                        :sym      abrams.controllers.graph.purchase/can-expire?
                                        :key      :purchase/can-expire?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    2
                                        :key      :purchase/can-expire?}
                                       {:event "value-return" :duration 0 :start 2}]
                            :name     ":purchase/can-expire?"}
                           {:start    0
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :purchase/charges]
                            :duration 0
                            :details
                                      [{:event    "call-read"
                                        :duration 0
                                        :start    0
                                        :key      :purchase/charges}
                                       {:event "value-return" :duration 0 :start 0}]
                            :name     ":purchase/charges"}
                           {:start    1
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :abrams.api/shard]
                            :duration 1
                            :details
                                      [{:event    "compute-plan"
                                        :duration 0
                                        :start    1
                                        :provides #{:abrams.api/shard}
                                        :plan
                                                  (([:abrams.api/shard abrams.controllers.graph.api/api-shard]))}
                                       {:event      "schedule-resolver"
                                        :duration   0
                                        :start      1
                                        :label      abrams.controllers.graph.api/api-shard
                                        :input-data {}
                                        :sym        abrams.controllers.graph.api/api-shard
                                        :key        :abrams.api/shard}
                                       {:event      "call-resolver"
                                        :duration   0
                                        :start      1
                                        :label      abrams.controllers.graph.api/api-shard
                                        :input-data {}
                                        :sym        abrams.controllers.graph.api/api-shard
                                        :key        :abrams.api/shard}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    1
                                        :key      :abrams.api/shard}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    2
                                        :sym      abrams.controllers.graph.api/api-shard
                                        :key      :abrams.api/shard}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    2
                                        :key      :abrams.api/shard}
                                       {:event "value-return" :duration 0 :start 2}]
                            :name     ":abrams.api/shard"}
                           {:start    0
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :purchase/can-create-chargeback?]
                            :duration 27
                            :details
                                      [{:event    "compute-plan"
                                        :duration 1
                                        :start    0
                                        :provides
                                                  #{:purchase/can-create-chargeback? :purchase/chargebacks
                                                    :chargeback/all-resolved-statuses
                                                    :purchase/open-chargeback}
                                        :plan
                                                  (([:purchase/chargebacks
                                                     abrams.controllers.graph.chargeback/purchase-chargebacks]
                                                     [:chargeback/all-resolved-statuses
                                                      abrams.controllers.graph.chargeback/chargeback-resolved-statuses]
                                                     [:purchase/open-chargeback
                                                      abrams.controllers.graph.chargeback/purchase-open-chargeback]
                                                     [:purchase/can-create-chargeback?
                                                      abrams.controllers.graph.chargeback/purchase-can-create-chargeback]))}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    0
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    1
                                        :input-data
                                                  {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                        :sym      abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "schedule-resolver"
                                        :duration 0
                                        :start    1
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :input-data
                                                  {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                        :sym      abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver"
                                        :duration 24
                                        :start    1
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :input-data
                                                  {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                        :sym      abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "api-call"
                                        :duration 24
                                        :start    1
                                        :label
                                                  "GET https://prod-s0-chargebacks.nubank.com.br/api/admin/purchases/5be8370a-15bc-49f7-b3c8-89b51118c7ea/chargebacks"
                                        :style    {:fill "#73abff"}
                                        :url
                                                  "https://prod-s0-chargebacks.nubank.com.br/api/admin/purchases/5be8370a-15bc-49f7-b3c8-89b51118c7ea/chargebacks"
                                        :method   :get}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    26
                                        :sym      abrams.controllers.graph.chargeback/purchase-chargebacks
                                        :key      :purchase/can-create-chargeback?}
                                       {:event      "call-resolver-with-cache"
                                        :duration   0
                                        :start      26
                                        :input-data {}
                                        :sym
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :key        :purchase/can-create-chargeback?}
                                       {:event      "schedule-resolver"
                                        :duration   0
                                        :start      26
                                        :label
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :input-data {}
                                        :sym
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :key        :purchase/can-create-chargeback?}
                                       {:event      "call-resolver"
                                        :duration   0
                                        :start      26
                                        :label
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :input-data {}
                                        :sym
                                                    abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :key        :purchase/can-create-chargeback?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    26
                                        :sym
                                                  abrams.controllers.graph.chargeback/chargeback-resolved-statuses
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    26
                                        :input-data
                                                  {:purchase/chargebacks []
                                                   :chargeback/all-resolved-statuses
                                                                         #{:chargeback.status/conductor-legacy
                                                                           :chargeback.status/canceled
                                                                           :chargeback.status/recovered
                                                                           :chargeback.status/aborted
                                                                           :chargeback.status/expired
                                                                           :chargeback.status/first-reversed
                                                                           :chargeback.status/writeoff
                                                                           :chargeback.status/archived
                                                                           :chargeback.status/reversed}}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "schedule-resolver"
                                        :duration 0
                                        :start    26
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :input-data
                                                  {:purchase/chargebacks []
                                                   :chargeback/all-resolved-statuses
                                                                         #{:chargeback.status/conductor-legacy
                                                                           :chargeback.status/canceled
                                                                           :chargeback.status/recovered
                                                                           :chargeback.status/aborted
                                                                           :chargeback.status/expired
                                                                           :chargeback.status/first-reversed
                                                                           :chargeback.status/writeoff
                                                                           :chargeback.status/archived
                                                                           :chargeback.status/reversed}}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver"
                                        :duration 0
                                        :start    26
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :input-data
                                                  {:purchase/chargebacks []
                                                   :chargeback/all-resolved-statuses
                                                                         #{:chargeback.status/conductor-legacy
                                                                           :chargeback.status/canceled
                                                                           :chargeback.status/recovered
                                                                           :chargeback.status/aborted
                                                                           :chargeback.status/expired
                                                                           :chargeback.status/first-reversed
                                                                           :chargeback.status/writeoff
                                                                           :chargeback.status/archived
                                                                           :chargeback.status/reversed}}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    27
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-open-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver-with-cache"
                                        :duration 0
                                        :start    27
                                        :input-data
                                                  {:purchase/source          :purchase.source/upfront-national
                                                   :purchase/open-chargeback nil}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "schedule-resolver"
                                        :duration 0
                                        :start    27
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :input-data
                                                  {:purchase/source          :purchase.source/upfront-national
                                                   :purchase/open-chargeback nil}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-resolver"
                                        :duration 0
                                        :start    27
                                        :label
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :input-data
                                                  {:purchase/source          :purchase.source/upfront-national
                                                   :purchase/open-chargeback nil}
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "merge-resolver-response"
                                        :duration 0
                                        :start    27
                                        :sym
                                                  abrams.controllers.graph.chargeback/purchase-can-create-chargeback
                                        :key      :purchase/can-create-chargeback?}
                                       {:event    "call-read"
                                        :duration 0
                                        :start    27
                                        :key      :purchase/can-create-chargeback?}
                                       {:event "value-return" :duration 0 :start 27}]
                            :name     ":purchase/can-create-chargeback?"}
                           {:start    0
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :purchase/id]
                            :duration 0
                            :details
                                      [{:event "call-read" :duration 0 :start 0 :key :purchase/id}
                                       {:event "value-return" :duration 0 :start 0}]
                            :name     ":purchase/id"}
                           {:start    1
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :purchase/can-classify-rewards?]
                            :duration 0
                            :details
                                      [{:event    "call-read"
                                        :duration 0
                                        :start    1
                                        :key      :purchase/can-classify-rewards?}
                                       {:event "value-return" :duration 0 :start 1}]
                            :name     ":purchase/can-classify-rewards?"}
                           {:start    2
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :>/info]
                            :duration 104
                            :details
                                      [{:event "compute-plan" :duration 0 :start 2}
                                       {:event "call-read" :duration 0 :start 2 :key :>/info}
                                       {:event "async-return" :duration 0 :start 2 :key :>/info}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         4
                                        :provides      #{:purchase/type}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 4}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     4
                                        :loop-keys [:purchase/type]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         4
                                        :provides      #{:purchase.capture-mode/pin-mode}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 4}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     4
                                        :loop-keys [:purchase.capture-mode/pin-mode]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         4
                                        :provides      #{:purchase.capture-mode/entry-mode}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 4}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     4
                                        :loop-keys [:purchase.capture-mode/entry-mode]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         4
                                        :provides      #{:abrams.api/shard}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 4}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     4
                                        :loop-keys [:abrams.api/shard]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         5
                                        :provides      #{:purchase/source}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 5}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     5
                                        :loop-keys [:purchase/source]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         5
                                        :provides      #{:purchase/stand-in?}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 5}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     5
                                        :loop-keys [:purchase/stand-in?]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         29
                                        :provides
                                                       #{:purchase/merchant-id :purchase/precise-amount-origin
                                                         :purchase/precise-amount
                                                         :purchase/stand-in?
                                                         :card/id
                                                         :purchase/currency-origin
                                                         :purchase.capture-mode/entry-mode
                                                         :purchase/approved-reasons
                                                         :purchase/postcode
                                                         :purchase/time
                                                         :purchase/lon
                                                         :purchase/recurring
                                                         :purchase/expires-on
                                                         :purchase/type
                                                         :purchase/mcc
                                                         :purchase/charges
                                                         :purchase/secure-code
                                                         :purchase/source
                                                         :purchase.forex/amount-origin
                                                         :purchase.forex/amount-usd
                                                         :purchase/account
                                                         :purchase/category
                                                         :purchase/result-code
                                                         :purchase/acquirer-id
                                                         :purchase.forex/precise-amount-origin
                                                         :purchase/id
                                                         :purchase.capture-mode/pin-mode
                                                         :purchase.forex/currency-origin
                                                         :customer/id
                                                         :purchase/original-merchant-name
                                                         :purchase/status
                                                         :purchase/lat
                                                         :purchase/secure-code-version
                                                         :purchase/auth-code
                                                         :purchase/denied-reasons
                                                         :purchase/merchant-name
                                                         :purchase/time-wallclock
                                                         :purchase/amount
                                                         :purchase.forex/exchange-rate
                                                         :purchase/event-type
                                                         :purchase/country
                                                         :purchase.forex/precise-amount-usd}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 29}
                                       {:event    "reset-loop"
                                        :duration 0
                                        :start    30
                                        :loop-keys
                                                  [:card/id
                                                   :purchase/approved-reasons
                                                   :purchase/lon
                                                   :purchase/recurring
                                                   :purchase/expires-on
                                                   :purchase/secure-code
                                                   :purchase/category
                                                   :purchase/result-code
                                                   :purchase.forex/precise-amount-origin
                                                   :purchase.forex/currency-origin
                                                   :purchase/lat
                                                   :purchase/secure-code-version
                                                   :purchase/auth-code
                                                   :purchase/denied-reasons
                                                   :purchase.forex/exchange-rate
                                                   :purchase.forex/precise-amount-usd]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         30
                                        :provides      #{:>/purchase-merchant}
                                        :merge-result? true}
                                       {:event "flush-watchers-loop" :duration 0 :start 30}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         30
                                        :provides      #{:card/id}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 30}
                                       {:event "reset-loop" :duration 0 :start 30 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase/auth-code}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 31}
                                       {:event "reset-loop" :duration 0 :start 31 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase/secure-code}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 31}
                                       {:event "reset-loop" :duration 0 :start 31 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase/expires-on}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 31}
                                       {:event "reset-loop" :duration 0 :start 31 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase.forex/precise-amount-origin}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 31}
                                       {:event "reset-loop" :duration 0 :start 31 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase/denied-reasons}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 31}
                                       {:event "reset-loop" :duration 0 :start 31 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase/recurring}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 31}
                                       {:event "reset-loop" :duration 0 :start 31 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase/approved-reasons}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 31}
                                       {:event "reset-loop" :duration 0 :start 31 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase/secure-code-version}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 31}
                                       {:event "reset-loop" :duration 0 :start 31 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         31
                                        :provides      #{:purchase/result-code}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 32}
                                       {:event "reset-loop" :duration 0 :start 32 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         32
                                        :provides      #{:purchase/lat}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 32}
                                       {:event "reset-loop" :duration 0 :start 32 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         32
                                        :provides      #{:purchase.forex/exchange-rate}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 32}
                                       {:event "reset-loop" :duration 0 :start 32 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         32
                                        :provides      #{:purchase/lon}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 32}
                                       {:event "reset-loop" :duration 0 :start 32 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         32
                                        :provides      #{:purchase.forex/precise-amount-usd}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 32}
                                       {:event "reset-loop" :duration 0 :start 32 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         32
                                        :provides      #{:purchase.forex/currency-origin}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 32}
                                       {:event "reset-loop" :duration 0 :start 32 :loop-keys []}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         73
                                        :provides
                                                       #{:purchase.forex/deltas-total-amount :purchase.forex/deltas
                                                         :purchase.forex/deltas-status}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 73}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     73
                                        :loop-keys [:purchase.forex/deltas]}
                                       {:event         "process-pending"
                                        :duration      0
                                        :start         105
                                        :provides      #{:purchase/nsu}
                                        :merge-result? false}
                                       {:event "flush-watchers-loop" :duration 0 :start 105}
                                       {:event     "reset-loop"
                                        :duration  0
                                        :start     105
                                        :loop-keys [:purchase/nsu]}
                                       {:event "merge-result" :duration 0 :start 106}]
                            :name     ":>/info"
                            :children
                                      [{:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/precise-amount]
                                        :duration 0
                                        :details
                                                  [{:event    "call-read"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase/precise-amount}
                                                   {:event "value-return" :duration 0 :start 2}]
                                        :name     ":purchase/precise-amount"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.points/label]
                                        :duration 0
                                        :details
                                                  [{:event    "call-read"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.points/label}
                                                   {:event "value-return" :duration 0 :start 3}]
                                        :name     ":purchase.points/label"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/stand-in?]
                                        :duration 3
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/stand-in?}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    5
                                                    :key      :purchase/stand-in?}
                                                   {:event "value-return" :duration 0 :start 6}]
                                        :name     ":purchase/stand-in?"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :card/id]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :card/id}
                                                   {:event "call-read" :duration 0 :start 30 :key :card/id}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":card/id"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.points/redeemed-at]
                                        :duration 0
                                        :details
                                                  [{:event    "call-read"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.points/redeemed-at}
                                                   {:event "value-return" :duration 0 :start 3}]
                                        :name     ":purchase.points/redeemed-at"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.capture-mode/entry-mode]
                                        :duration 2
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase.capture-mode/entry-mode}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    4
                                                    :key      :purchase.capture-mode/entry-mode}
                                                   {:event "value-return" :duration 0 :start 4}]
                                        :name     ":purchase.capture-mode/entry-mode"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :>/purchase-merchant]
                                        :duration 27
                                        :details
                                                  [{:event "compute-plan" :duration 0 :start 3}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    3
                                                    :key      :>/purchase-merchant}
                                                   {:event    "async-return"
                                                    :duration 0
                                                    :start    3
                                                    :key      :>/purchase-merchant}
                                                   {:event         "process-pending"
                                                    :duration      0
                                                    :start         9
                                                    :provides      #{:purchase/merchant-name}
                                                    :merge-result? false}
                                                   {:event "flush-watchers-loop" :duration 0 :start 9}
                                                   {:event     "reset-loop"
                                                    :duration  0
                                                    :start     9
                                                    :loop-keys [:purchase/merchant-name]}
                                                   {:event         "process-pending"
                                                    :duration      0
                                                    :start         9
                                                    :provides      #{:purchase/id}
                                                    :merge-result? false}
                                                   {:event "flush-watchers-loop" :duration 0 :start 9}
                                                   {:event     "reset-loop"
                                                    :duration  0
                                                    :start     9
                                                    :loop-keys [:purchase/id]}
                                                   {:event         "process-pending"
                                                    :duration      0
                                                    :start         29
                                                    :provides      #{:purchase/original-merchant-name}
                                                    :merge-result? false}
                                                   {:event "flush-watchers-loop" :duration 0 :start 29}
                                                   {:event     "reset-loop"
                                                    :duration  0
                                                    :start     29
                                                    :loop-keys [:purchase/original-merchant-name]}
                                                   {:event         "process-pending"
                                                    :duration      0
                                                    :start         30
                                                    :provides      #{:purchase/name-edited?}
                                                    :merge-result? false}
                                                   {:event "flush-watchers-loop" :duration 0 :start 30}
                                                   {:event     "reset-loop"
                                                    :duration  0
                                                    :start     30
                                                    :loop-keys [:purchase/name-edited?]}
                                                   {:event "merge-result" :duration 0 :start 30}]
                                        :name     ":>/purchase-merchant"
                                        :children
                                                  [{:start    5
                                                    :path
                                                              [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                               :>/info
                                                               :>/purchase-merchant
                                                               :purchase/id]
                                                    :duration 4
                                                    :details
                                                              [{:event    "external-wait-key"
                                                                :duration 0
                                                                :start    5
                                                                :key      :purchase/id}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    9
                                                                :key      :purchase/id}
                                                               {:event "value-return" :duration 0 :start 9}]
                                                    :name     ":purchase/id"}
                                                   {:start    5
                                                    :path
                                                              [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                               :>/info
                                                               :>/purchase-merchant
                                                               :purchase/merchant-name]
                                                    :duration 4
                                                    :details
                                                              [{:event    "external-wait-key"
                                                                :duration 0
                                                                :start    5
                                                                :key      :purchase/merchant-name}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    9
                                                                :key      :purchase/merchant-name}
                                                               {:event "value-return" :duration 0 :start 9}]
                                                    :name     ":purchase/merchant-name"}
                                                   {:start    5
                                                    :path
                                                              [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                               :>/info
                                                               :>/purchase-merchant
                                                               :purchase/original-merchant-name]
                                                    :duration 25
                                                    :details
                                                              [{:event    "external-wait-key"
                                                                :duration 0
                                                                :start    5
                                                                :key      :purchase/original-merchant-name}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    30
                                                                :key      :purchase/original-merchant-name}
                                                               {:event "value-return" :duration 0 :start 30}]
                                                    :name     ":purchase/original-merchant-name"}
                                                   {:start    5
                                                    :path
                                                              [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                               :>/info
                                                               :>/purchase-merchant
                                                               :purchase/name-edited?]
                                                    :duration 25
                                                    :details
                                                              [{:event    "compute-plan"
                                                                :duration 0
                                                                :start    5
                                                                :provides
                                                                          #{:purchase/merchant-id :purchase/precise-amount-origin
                                                                            :purchase/precise-amount
                                                                            :purchase/stand-in?
                                                                            :card/id
                                                                            :purchase/currency-origin
                                                                            :purchase.capture-mode/entry-mode
                                                                            :purchase/approved-reasons
                                                                            :purchase/postcode
                                                                            :purchase/time
                                                                            :purchase/lon
                                                                            :purchase/recurring
                                                                            :purchase/expires-on
                                                                            :purchase/type
                                                                            :purchase/mcc
                                                                            :purchase/charges
                                                                            :purchase/secure-code
                                                                            :purchase/source
                                                                            :purchase.forex/amount-origin
                                                                            :purchase.forex/amount-usd
                                                                            :purchase/account
                                                                            :purchase/category
                                                                            :purchase/name-edited?
                                                                            :purchase/result-code
                                                                            :purchase/acquirer-id
                                                                            :purchase.forex/precise-amount-origin
                                                                            :purchase/id
                                                                            :purchase.capture-mode/pin-mode
                                                                            :purchase.forex/currency-origin
                                                                            :customer/id
                                                                            :purchase/original-merchant-name
                                                                            :purchase/status
                                                                            :purchase/lat
                                                                            :purchase/secure-code-version
                                                                            :purchase/auth-code
                                                                            :purchase/denied-reasons
                                                                            :purchase/merchant-name
                                                                            :purchase/time-wallclock
                                                                            :purchase/amount
                                                                            :purchase.forex/exchange-rate
                                                                            :purchase/event-type
                                                                            :purchase/country
                                                                            :purchase.forex/precise-amount-usd}
                                                                :plan
                                                                          (([:purchase/original-merchant-name
                                                                             abrams.controllers.graph.purchase/purchase-simple]
                                                                             [:purchase/name-edited?
                                                                              abrams.controllers.graph.purchase/name-edited?]))}
                                                               {:event       "waiting-resolver"
                                                                :duration    0
                                                                :start       5
                                                                :waiting-key :purchase/original-merchant-name
                                                                :input-data
                                                                             {:purchase/id
                                                                              #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                                :sym         abrams.controllers.graph.purchase/purchase-simple
                                                                :key         :purchase/name-edited?}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    5
                                                                :key      :purchase/name-edited?}
                                                               {:event    "call-resolver-with-cache"
                                                                :duration 0
                                                                :start    29
                                                                :input-data
                                                                          {:purchase/original-merchant-name "PAO DE ACUCAR LJ 183"
                                                                           :purchase/merchant-name          "Pao de Acucar Lj"}
                                                                :sym      abrams.controllers.graph.purchase/name-edited?
                                                                :key      :purchase/name-edited?}
                                                               {:event    "schedule-resolver"
                                                                :duration 0
                                                                :start    30
                                                                :label    abrams.controllers.graph.purchase/name-edited?
                                                                :input-data
                                                                          {:purchase/original-merchant-name "PAO DE ACUCAR LJ 183"
                                                                           :purchase/merchant-name          "Pao de Acucar Lj"}
                                                                :sym      abrams.controllers.graph.purchase/name-edited?
                                                                :key      :purchase/name-edited?}
                                                               {:event    "call-resolver"
                                                                :duration 0
                                                                :start    30
                                                                :label    abrams.controllers.graph.purchase/name-edited?
                                                                :input-data
                                                                          {:purchase/original-merchant-name "PAO DE ACUCAR LJ 183"
                                                                           :purchase/merchant-name          "Pao de Acucar Lj"}
                                                                :sym      abrams.controllers.graph.purchase/name-edited?
                                                                :key      :purchase/name-edited?}
                                                               {:event    "merge-resolver-response"
                                                                :duration 0
                                                                :start    30
                                                                :sym      abrams.controllers.graph.purchase/name-edited?
                                                                :key      :purchase/name-edited?}
                                                               {:event    "call-read"
                                                                :duration 0
                                                                :start    30
                                                                :key      :purchase/name-edited?}
                                                               {:event "value-return" :duration 0 :start 30}]
                                                    :name     ":purchase/name-edited?"}]}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/approved-reasons]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/approved-reasons}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/approved-reasons}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/approved-reasons"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/time]
                                        :duration 0
                                        :details
                                                  [{:event    "call-read"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase/time}
                                                   {:event "value-return" :duration 0 :start 2}]
                                        :name     ":purchase/time"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/lon]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/lon}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/lon}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/lon"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/recurring]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/recurring}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/recurring}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/recurring"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/expires-on]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/expires-on}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/expires-on}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/expires-on"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.forex/deltas]
                                        :duration 70
                                        :details
                                                  [{:event    "compute-plan"
                                                    :duration 0
                                                    :start    3
                                                    :provides
                                                              #{:purchase.forex/deltas-total-amount :purchase.forex/deltas
                                                                :purchase.forex/deltas-status}
                                                    :plan
                                                              (([:purchase.forex/deltas
                                                                 abrams.controllers.graph.purchase/purchase-forex]))}
                                                   {:event    "call-resolver-with-cache"
                                                    :duration 0
                                                    :start    3
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-forex
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "schedule-resolver"
                                                    :duration 1
                                                    :start    5
                                                    :label    abrams.controllers.graph.purchase/purchase-forex
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-forex
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "call-resolver"
                                                    :duration 67
                                                    :start    6
                                                    :label    abrams.controllers.graph.purchase/purchase-forex
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-forex
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "api-call"
                                                    :duration 67
                                                    :start    6
                                                    :label
                                                              "GET https://prod-s0-billing.nubank.com.br/api/transactions/5be8370a-15bc-49f7-b3c8-89b51118c7ea/forex-delta"
                                                    :style    {:fill "#73abff"}
                                                    :url
                                                              "https://prod-s0-billing.nubank.com.br/api/transactions/5be8370a-15bc-49f7-b3c8-89b51118c7ea/forex-delta"
                                                    :method   :get}
                                                   {:event    "merge-resolver-response"
                                                    :duration 0
                                                    :start    73
                                                    :sym      abrams.controllers.graph.purchase/purchase-forex
                                                    :key      :purchase.forex/deltas}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    73
                                                    :key      :purchase.forex/deltas}
                                                   {:event "value-return" :duration 0 :start 73}]
                                        :name     ":purchase.forex/deltas"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/type]
                                        :duration 2
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase/type}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    4
                                                    :key      :purchase/type}
                                                   {:event "value-return" :duration 0 :start 4}]
                                        :name     ":purchase/type"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.points/points-display]
                                        :duration 0
                                        :details
                                                  [{:event    "call-read"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.points/points-display}
                                                   {:event "value-return" :duration 0 :start 3}]
                                        :name     ":purchase.points/points-display"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/charges]
                                        :duration 0
                                        :details
                                                  [{:event    "call-read"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase/charges}
                                                   {:event "value-return" :duration 0 :start 2}]
                                        :name     ":purchase/charges"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/secure-code]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/secure-code}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/secure-code}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/secure-code"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/source]
                                        :duration 2
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/source}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    5
                                                    :key      :purchase/source}
                                                   {:event "value-return" :duration 0 :start 5}]
                                        :name     ":purchase/source"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :abrams.api/shard]
                                        :duration 1
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :abrams.api/shard}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    4
                                                    :key      :abrams.api/shard}
                                                   {:event "value-return" :duration 0 :start 4}]
                                        :name     ":abrams.api/shard"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/category]
                                        :duration 28
                                        :details
                                                  [{:event    "compute-plan"
                                                    :duration 0
                                                    :start    2
                                                    :provides
                                                              #{:purchase/merchant-id :purchase/precise-amount-origin
                                                                :purchase/precise-amount
                                                                :purchase/stand-in?
                                                                :card/id
                                                                :purchase/currency-origin
                                                                :purchase.capture-mode/entry-mode
                                                                :purchase/approved-reasons
                                                                :purchase/postcode
                                                                :purchase/time
                                                                :purchase/lon
                                                                :purchase/recurring
                                                                :purchase/expires-on
                                                                :purchase/type
                                                                :purchase/mcc
                                                                :purchase/charges
                                                                :purchase/secure-code
                                                                :purchase/source
                                                                :purchase.forex/amount-origin
                                                                :purchase.forex/amount-usd
                                                                :purchase/account
                                                                :purchase/category
                                                                :purchase/result-code
                                                                :purchase/acquirer-id
                                                                :purchase.forex/precise-amount-origin
                                                                :purchase/id
                                                                :purchase.capture-mode/pin-mode
                                                                :purchase.forex/currency-origin
                                                                :customer/id
                                                                :purchase/original-merchant-name
                                                                :purchase/status
                                                                :purchase/lat
                                                                :purchase/secure-code-version
                                                                :purchase/auth-code
                                                                :purchase/denied-reasons
                                                                :purchase/merchant-name
                                                                :purchase/time-wallclock
                                                                :purchase/amount
                                                                :purchase.forex/exchange-rate
                                                                :purchase/event-type
                                                                :purchase/country
                                                                :purchase.forex/precise-amount-usd}
                                                    :plan
                                                              (([:purchase/category
                                                                 abrams.controllers.graph.purchase/purchase-simple]))}
                                                   {:event    "call-resolver-with-cache"
                                                    :duration 0
                                                    :start    2
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-simple
                                                    :key      :purchase/category}
                                                   {:event    "schedule-resolver"
                                                    :duration 0
                                                    :start    2
                                                    :label    abrams.controllers.graph.purchase/purchase-simple
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-simple
                                                    :key      :purchase/category}
                                                   {:event    "call-resolver"
                                                    :duration 27
                                                    :start    2
                                                    :label    abrams.controllers.graph.purchase/purchase-simple
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-simple
                                                    :key      :purchase/category}
                                                   {:event    "api-call"
                                                    :duration 27
                                                    :start    2
                                                    :label
                                                              "GET https://prod-s0-feed.nubank.com.br/api/transactions/5be8370a-15bc-49f7-b3c8-89b51118c7ea/simple"
                                                    :style    {:fill "#73abff"}
                                                    :url
                                                              "https://prod-s0-feed.nubank.com.br/api/transactions/5be8370a-15bc-49f7-b3c8-89b51118c7ea/simple"
                                                    :method   :get}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase/category}
                                                   {:event    "merge-resolver-response"
                                                    :duration 0
                                                    :start    29
                                                    :sym      abrams.controllers.graph.purchase/purchase-simple
                                                    :key      :purchase/category}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/category}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/category"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/result-code]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/result-code}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/result-code}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/result-code"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.forex/precise-amount-origin]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.forex/precise-amount-origin}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase.forex/precise-amount-origin}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase.forex/precise-amount-origin"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/id]
                                        :duration 1
                                        :details
                                                  [{:event "call-read" :duration 0 :start 2 :key :purchase/id}
                                                   {:event "value-return" :duration 0 :start 2}
                                                   {:event    "skip-resolved-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/id}]
                                        :name     ":purchase/id"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.capture-mode/pin-mode]
                                        :duration 2
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase.capture-mode/pin-mode}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    4
                                                    :key      :purchase.capture-mode/pin-mode}
                                                   {:event "value-return" :duration 0 :start 4}]
                                        :name     ":purchase.capture-mode/pin-mode"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.forex/currency-origin]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.forex/currency-origin}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase.forex/currency-origin}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase.forex/currency-origin"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/status]
                                        :duration 0
                                        :details
                                                  [{:event    "call-read"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase/status}
                                                   {:event "value-return" :duration 0 :start 2}]
                                        :name     ":purchase/status"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/lat]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/lat}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/lat}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/lat"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/secure-code-version]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/secure-code-version}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/secure-code-version}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/secure-code-version"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/auth-code]
                                        :duration 28
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase/auth-code}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/auth-code}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/auth-code"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/denied-reasons]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase/denied-reasons}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase/denied-reasons}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase/denied-reasons"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :card/type]
                                        :duration 0
                                        :details
                                                  [{:event "call-read" :duration 0 :start 3 :key :card/type}
                                                   {:event "value-return" :duration 0 :start 3}]
                                        :name     ":card/type"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.forex/exchange-rate]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.forex/exchange-rate}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase.forex/exchange-rate}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase.forex/exchange-rate"}
                                       {:start    2
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase/nsu]
                                        :duration 103
                                        :details
                                                  [{:event    "compute-plan"
                                                    :duration 1
                                                    :start    2
                                                    :provides #{:purchase/nsu}
                                                    :plan
                                                              (([:purchase/nsu
                                                                 abrams.controllers.graph.purchase/purchase-nsu]))}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    2
                                                    :key      :purchase/nsu}
                                                   {:event    "call-resolver-with-cache"
                                                    :duration 0
                                                    :start    3
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-nsu
                                                    :key      :purchase/nsu}
                                                   {:event    "schedule-resolver"
                                                    :duration 4
                                                    :start    3
                                                    :label    abrams.controllers.graph.purchase/purchase-nsu
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-nsu
                                                    :key      :purchase/nsu}
                                                   {:event    "call-resolver"
                                                    :duration 98
                                                    :start    7
                                                    :label    abrams.controllers.graph.purchase/purchase-nsu
                                                    :input-data
                                                              {:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"}
                                                    :sym      abrams.controllers.graph.purchase/purchase-nsu
                                                    :key      :purchase/nsu}
                                                   {:event    "api-call"
                                                    :duration 98
                                                    :start    7
                                                    :label
                                                              "GET https://prod-s0-insulator.nubank.com.br/api/admin/transactions/5be8370a-15bc-49f7-b3c8-89b51118c7ea/nsu"
                                                    :style    {:fill "#73abff"}
                                                    :url
                                                              "https://prod-s0-insulator.nubank.com.br/api/admin/transactions/5be8370a-15bc-49f7-b3c8-89b51118c7ea/nsu"
                                                    :method   :get}
                                                   {:event    "merge-resolver-response"
                                                    :duration 0
                                                    :start    105
                                                    :sym      abrams.controllers.graph.purchase/purchase-nsu
                                                    :key      :purchase/nsu}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    105
                                                    :key      :purchase/nsu}
                                                   {:event "value-return" :duration 0 :start 105}]
                                        :name     ":purchase/nsu"}
                                       {:start    3
                                        :path
                                                  [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                                   :>/info
                                                   :purchase.forex/precise-amount-usd]
                                        :duration 27
                                        :details
                                                  [{:event    "external-wait-key"
                                                    :duration 0
                                                    :start    3
                                                    :key      :purchase.forex/precise-amount-usd}
                                                   {:event    "call-read"
                                                    :duration 0
                                                    :start    30
                                                    :key      :purchase.forex/precise-amount-usd}
                                                   {:event "value-return" :duration 0 :start 30}]
                                        :name     ":purchase.forex/precise-amount-usd"}]}
                           {:start    0
                            :path
                                      [[:purchase/id #uuid "5be8370a-15bc-49f7-b3c8-89b51118c7ea"]
                                       :purchase/merchant-name]
                            :duration 0
                            :details
                                      [{:event    "call-read"
                                        :duration 0
                                        :start    0
                                        :key      :purchase/merchant-name}
                                       {:event "value-return" :duration 0 :start 0}]
                            :name     ":purchase/merchant-name"}]}
               {:start    0
                :path     [:com.wsscode.pathom/trace]
                :duration 0
                :details
                          [{:event "compute-plan" :duration 0 :start 0}
                           {:event    "call-read"
                            :duration 0
                            :start    0
                            :key      :com.wsscode.pathom/trace}
                           {:event "value-return" :duration 0 :start 0}
                           {:event    "skip-resolved-key"
                            :duration 0
                            :start    0
                            :key      :com.wsscode.pathom/trace}]
                :name     ":com.wsscode.pathom/trace"}]
    :hint     "Query"}
  )

(ws/defcard trace-purchase-after
  {::wsm/align {:display "flex"
                :width   "100%"}}
  (ct.react/react-card
    (pv.trace/d3-trace {::pv.trace/trace-data      purchase-details-trace-after
                        ::pv.trace/on-show-details #(js/console.log %)})))
