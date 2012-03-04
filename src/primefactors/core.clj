(ns primefactors.core)

(defn primefactors 
	([n] (primefactors n 2 '()))
	([n candidate accumulator] 
		(cond	(<= n 1) (reverse accumulator)
		  		(zero? (rem n candidate)) (recur (/ n candidate) candidate (cons candidate accumulator))
		  		:else (primefactors n (inc candidate) accumulator)
		)
	)
)