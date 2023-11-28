(ns my.macros)

(defmacro sci-copy-nss [& nss]
  (into {} (for [[_ ns] nss]
             [(list 'quote ns) `(sci.core/copy-ns ~ns (sci.core/create-ns '~ns))])))
