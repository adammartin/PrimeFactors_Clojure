(ns primefactors.core)

(defn primefactors [n]
	(cond (<= n 1) (list)
		  (= 0 (rem n 2)) (conj (primefactors (/ n 2)) 2)
		  :else (list n)
	)
)