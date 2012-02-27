(ns primefactors.test.core
  (:use [primefactors.core])
  (:use midje.sweet)
)

(fact (primefactors 1) => (list))

(fact (primefactors 2) => (list 2))

(fact (primefactors 3) => (list 3))

(fact (primefactors 4) => (list 2 2))