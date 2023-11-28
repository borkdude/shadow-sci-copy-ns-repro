(ns my.sci
  (:require [sci.core :as sci]
            [my.namespace])
  (:require-macros [my.macros :refer [sci-copy-nss]]))

(def ctx (sci/init {:namespaces
                    (sci-copy-nss 'my.namespace)
                    #_{'my.namespace (sci/copy-ns my.namespace (sci/create-ns 'my.namespace))}
                    :classes {'js js/globalThis :allow :all}}))
