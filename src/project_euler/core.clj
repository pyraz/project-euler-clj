(ns project-euler.core)

(defn multiples-of-three-and-five
  "Finds the sum of all the multiples of 3 or 5 below the number provided"
  [ceil]
  (let 
    [ceiling (+ ceil 0)]
    (reduce + (distinct (concat (range 0 ceiling 5) (range 0 ceiling 3))))
    )
  )

(defn distinct-fibonacci
  "Returns a lazy evaluated fibonacci sequence"
  []
  (filter #(not= % 0) 
          (distinct (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1]))
                    ))
  )

(defn fib-sequence
  "Returns a fibonacci sequence, starting at 1, up to provided limit"
  [ceil]
  (take-while #(< % ceil) (distinct-fibonacci))
  )

(defn even-fibs
  "Finds the sequence of even fibonacci numbers up to the limit"
  [ceil]
  (filter #(== (mod % 2) 0) (fib-sequence ceil))
  )

(reduce + (even-fibs 4000000))
