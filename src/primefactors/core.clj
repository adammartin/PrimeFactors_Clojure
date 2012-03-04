(ns primefactors.core)

(defn primefactors 
	([n] (primefactors n 2))
	([n candidate] 
		(cond	(<= n 1) (list)
		  		(= 0 (rem n 2)) (conj (primefactors (/ n 2)) 2)
		  		:else (list n)
		)
	)
)