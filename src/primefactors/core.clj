(ns primefactors.core)

(defn primefactors 
	([n] (primefactors n 2 '()))
	([n candidate accumulator] 
		(cond	(<= n 1) (reverse accumulator)
		  		(= 0 (rem n candidate)) (conj (primefactors (/ n candidate)) candidate)
		  		:else (primefactors n (inc candidate) accumulator)
		)
	)
)