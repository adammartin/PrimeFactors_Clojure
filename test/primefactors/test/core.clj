(ns primefactors.test.core
  (:use [primefactors.core])
  (:use midje.sweet)
)

(fact (primefactors 1) => (list))
