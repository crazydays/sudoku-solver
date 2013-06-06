(ns sudoku-solver.cell
  (:gen-class))

(defstruct cell :value :mutable)

(defn make-cell [value]
  (struct cell value (= 0 value))
)
