(ns simple.main
  (:require [taoensso.nippy :as nippy])
  (:gen-class))


; (comment
  ;; Throws exception
  (defn -main []
    (prn (nippy/freeze nippy/stress-data))
    (prn (nippy/thaw (nippy/freeze nippy/stress-data))))
    
    ; )


; (def data
;   {:string "hello world"
;    :number 123
;    :keyword :fun
;    :lazy-seq (range 10)})


; (defn -main []
;   (prn (nippy/freeze data))
;   (prn (nippy/thaw (nippy/freeze data)))
;   (println "it works!"))
