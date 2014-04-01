(ns project-euler.core)

(defn multiples-of-three-and-five
  "Finds the sum of all the multiples of 3 or 5 below the number provided"
  [ceil]
  (let 
    [ceiling (+ ceil 0)]
    (reduce + (distinct (concat (range 0 ceiling 5) (range 0 ceiling 3))))
    )
  )

(multiples-of-three-and-five 1000)
