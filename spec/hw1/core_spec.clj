(ns core-spec
  (:use [speclj.core]
        [hw1.core])
  (:require [hw1.core]))
  
  
(describe "reverse-list"
  (it "is true"
    (should true))
  (it "reverses a single element list"
    (should= '(1) (reverse-list '(1))))
  (it "reverses a two element list"
    (should= '(2 1) (reverse-list '(1 2))))
  (it "reverses a list with a function call"
    (should= (list (quote +) 1 2) (reverse-list (list 2 1 (quote +)))))
    
    
)

(describe "reverse-call"
  (it "evals an addition"
    (should= 3 (reverse-call (2 1 +))))
)


(run-specs)