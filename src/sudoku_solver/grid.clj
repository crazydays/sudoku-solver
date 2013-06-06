(ns sudoku-solver.grid
  (:require [sudoku-solver.cell :refer :all])
  (:gen-class))

(defstruct grid :data :type)

(defn make-grid [data]
  (case (count data)
    9  (struct grid (map make-cell data) :subgrid)
    81 (struct grid (map make-grid (partition 9 data)) :grid)
  )
)

(defn get-cell [grid x y]
  (nth (:data grid) (+ x (* y 3)))
)
