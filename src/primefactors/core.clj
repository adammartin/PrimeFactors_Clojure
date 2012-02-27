(ns primefactors.core)

(defn primefactors [n] 
	(if (<= 2 n)
		(list n)
		(list))
)