(ns hw1.core)

(defn reverse-list [list]
  (reverse list))
  
(defmacro reverse-call [backwards-list]
  (reverse-list backwards-list))