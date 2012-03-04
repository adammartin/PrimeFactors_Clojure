(ns primefactors.core)

(defn primefactors 
	([n] (primefactors n 2))
	([n candidate] 
		(cond	(<= n 1) (list)
		  		(= 0 (rem n candidate)) (conj (primefactors (/ n candidate)) 2)
		  		:else (list n)
		)
	)
)