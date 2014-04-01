(ns project-euler.core)

(defn multiples-of-three-and-five
  "Finds the sum of all the multiples of 3 or 5 below the number provided"
  [ceil]
  (let 
    [ceiling (+ ceil 0)]
    (reduce + (distinct (concat (range 0 ceiling 5) (range 0 ceiling 3))))
    )
  )

(defn even-valued-fibs
  "Finds the sum of all the even valued Fibonacci numbers below provided ceiling"
  [ceil]

  )

(defn offset-fibonacci
  "Returns a lazy evaluated fibonacci sequence"
  []
  (map first (filter (fn [[x y]] (> y 1)) 
                     (iterate (fn [[a b]] [b (+ a b)]) [0 1])
                     )
       )
  )
