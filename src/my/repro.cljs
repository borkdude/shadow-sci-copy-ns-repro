(ns my.repro
  (:require [sci.core :as sci]
            [my.sci]))

(defn init []
  (try (sci/eval-string* my.sci/ctx
                         (nth js/process.argv 2))
       (catch :default e (js/console.log (ex-message e)))))
