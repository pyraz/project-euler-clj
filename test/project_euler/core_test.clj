(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]))

(deftest test-multiples-of-three-and-five
  (testing "#multiples-of-three-and-five"
    (testing "it finds the sum of all multiples of 3 and 5 below argument"
      (is (= 3 (multiples-of-three-and-five 4)))
      (is (= 8 (multiples-of-three-and-five 6)))
      (is (= 14 (multiples-of-three-and-five 7)))
      (is (= (+ 3 5 6 9 10) (multiples-of-three-and-five 11)))
      )
    )
  )

(deftest test-fib-sequence
  (testing "#test-fib-sequence"
    (testing "returns a sequence of fibonacci numbers, starting at 1, to limit"
      (is (= (seq [1 2 3 5 8]) (fib-sequence 10))) 
      )
    )
  )

(deftest test-distinct-fibonacci
  (testing "#distinct-fibonacci"
    (testing "it returns a fibonacci sequence"
      (is (= (seq [1]) (take 1 (distinct-fibonacci))))
      (is (= (seq [1 2]) (take 2 (distinct-fibonacci))))
      (is (= (seq [1 2 3 5 8 13 21 34 55 89]) (take 10 (distinct-fibonacci))))
      )
    )
  )

(deftest test-even-fibs
  (testing "#even-fibs"
    (testing "it returns a sequence of even fibonacci numbers, up to limit"
     (is (= (seq [2 8]) (even-fibs 10))) 
      ))
  )
