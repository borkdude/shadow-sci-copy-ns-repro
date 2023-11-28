(ns my.sci
  (:require [sci.core :as sci]
            [my.namespace]))

(def ctx (sci/init {:namespaces {'my.namespace (sci/copy-ns my.namespace (sci/create-ns 'my.namespace))}
                    :classes {'js js/globalThis :allow :all}}))
