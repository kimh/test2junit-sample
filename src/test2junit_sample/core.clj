(ns test2junit_sample.core
  (:use clojure.test))

(defn say-hi [] "hi")
(defn say-yo [] "yo")

(defn -main
  "simple test"
  []
  (is (= "hi" (say-hi)))
  (is (= "ya" (say-yo))))


