(ns exercises.core
	(:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

;; ADDED
(defonce a 3)
(defonce b (+ a 1))

(defn square-sum-larger [a b c]
  (if (> a b)
    (if (> b c)
        (+ (* a a) (* b b)))
    (+ (* a a) (* c c)))
  (if (> a c)
    (+ (* a a) (* b b)))
  (+ (* b b) (* c c))
)

(defn -main [& args]
  (println "Welcome ClojureScript Exercises! ")
  
  (println "Exercise 1.1.1")
  (println 10)
  (println (+ 5 3 4))
  (println (- 9 1))
  (println (/ 6 2))
  (println (+ (* 2 4) (- 4 6)))
  (println "Exercise 1.1.2")
  (println (+ a b (* a b)))
  (println (= a b))
  (println "Exercise 1.2")
  (println "(/ (+ 5 4
                 (- 2
                    (- 3
                       (+ 6
                            (/ 4 5)))))
               (* 3 (- 6 2) (- 2 7)))")
  (println "Result: " (/ (+ 5 4
                 (- 2
                    (- 3
                       (+ 6
                            (/ 4 5)))))
               (* 3 (- 6 2) (- 2 7))))
  (println "Exercise 1.3")
  (println (square-sum-larger 2 8 4))
)
  
(set! *main-cli-fn* -main)