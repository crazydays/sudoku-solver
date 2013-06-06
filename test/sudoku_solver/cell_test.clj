(ns sudoku-solver.cell-test
  (:require [clojure.test :refer :all]
            [sudoku-solver.cell :refer :all]))

(deftest verify-make-cell-0
  (testing "Verify make-cell 0 value"
    (is (= 0 (:value (make-cell 0))))
  )
  (testing "Verify make-cell 0 immutable"
    (is (= true (:mutable (make-cell 0))))
  )
)

(deftest verify-make-cell-1
  (testing "Verify make-cell 1 value"
    (is (= 1 (:value (make-cell 1))))
  )
  (testing "Verify make-cell 1 mutable"
    (is (= false (:mutable (make-cell 1))))
  )
)
