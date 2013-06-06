(ns sudoku-solver.grid-test
  (:require [clojure.test :refer :all]
            [sudoku-solver.grid :refer :all]
            [sudoku-solver.cell :refer :all]))

(def ordered-grid (make-grid '(1 2 3 4 5 6 7 8 9)))

(deftest make-grid-type-subgrid
  (testing "Test make-grid-type-subgrid-data"
    (is
      (=
        (map make-cell (repeatedly 9 (fn [] 0)))
        (:data (make-grid (repeatedly 9 (fn [] 0))))
      )
    )
  )
  (testing "Test make-grid-type-subgrid-type"
    (is
      (=
        :subgrid
        (:type (make-grid (repeatedly 9 (fn [] 0))))
      )
    )
  )
)

(deftest make-grid-type-grid
  (testing "Test make-grid type-grid data"
    (is
      (=
        (map make-grid
          (repeatedly 9
            (fn [] (repeatedly 9 (fn [] 0)))
          )
        )
        (:data (make-grid (repeatedly 81 (fn [] 0))))
      )
    )
  )
  (testing "Test make-grid type-grid type"
    (is
      (=
        :grid
        (:type (make-grid (repeatedly 81 (fn [] 0))))
      )
    )
  )
)


(deftest grid-cell-subgrid
  (testing "Test grid-cell type-subgrid"
    (is
      (= 1 (:value (get-cell ordered-grid 0 0)))
    )
    (is
      (= 4 (:value (get-cell ordered-grid 0 1)))
    )
    (is
      (= 9 (:value (get-cell ordered-grid 2 2)))
    )
  )
)
