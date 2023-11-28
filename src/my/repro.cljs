(ns my.repro
  (:require [sci.core :as sci]
            [my.sci]))

(defn init []
  (try (sci/eval-string* my.sci/ctx
                         "(require '[my.namespace :as m])
                          (js/console.log (m/foo))
                          (js/console.log (m/bar))
                          (js/console.log (m/quux))")
       (catch :default e (js/console.log (ex-message e)))))
