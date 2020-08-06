(ns simple.main
  (:require [overtone.at-at :as at])
  (:gen-class))

;;
;; Update this file to use the libary you wish to test.
;;


(defn -main []
  (let [my-pool (at/mk-pool)]
    (at/at (+ 1000 (at/now)) #(println "hello from the past!") my-pool)
    (at/after 1100 #(println "hello from the past!") my-pool)
    (let [job (at/every 1000 #(println "Hi GraalVM.") my-pool :initial-delay 2000)]
      (Thread/sleep 4000)
      (at/show-schedule my-pool)
      (at/stop job)
      (let [job-id2(:id (at/interspaced 1099 #(println "Hello GraalVM.") my-pool :desc "Greeting GraalVM"))]
        (Thread/sleep 2000)
        (at/show-schedule my-pool)
        (Thread/sleep 4000)
        ;(at/stop job-id2 my-pool)
        (at/stop-and-reset-pool! my-pool :strategy :stop)
        (at/show-schedule my-pool)
        (shutdown-agents)))))
