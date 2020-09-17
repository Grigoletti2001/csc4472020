; INSTRUCTIONS
; 
; Type in all of the expressions (a)-(o) from Exercise 2.2.3 of 
; http://www.scheme.com/tspl4/start.html   
; For each expression, type in its value beneath the expression (as a comment). ']' 
; Use SISC Scheme to verify your answers.  (a) has been completed for you.
; 
; SUBMISSION
;
; 1. Submit this file on D2L before the deadline.
;
; 2. Late submissions will not be permitted because solutions will be discussed
; in class.
; the verified terminal file showing I entered all code in my own terminal will be 
; also uploaded as well as a link to a private Github Repo showing my lecture/reading 
; notes along with exercise notes/files. 


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(a)

(cons 'car 'cdr)
; evaluates to: (car . cdr)
; verified evaluates to (car . cdr)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(b)
(list 'this '(is silly))


; evaluates to: (this (is silly))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(c)
(cons 'is '(this silly?))


; evaluates to: (is this silly?)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(d)

(quote (+ 2 3))


; evaluates to: (+ 2 3)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(e
(cons '+ '(2 3))


; evaluates to: (+ 2 3) 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(f)
(car '(+ 2 3))


; evaluates to: +

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(g)
(cdr '(+ 2 3))


; evaluates to: (2 3)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(h)

cons

; evaluates to: 

; evaluates to: #<native procedure cons>

;this is a fundamental function means nothing in and onto itself. it must have someting 
; onto which to attach itself with. 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(i)

(quote cons)


; evaluates to cons

; quotes just means repeat as a string like "echo in JS"


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(j)

(quote (quote cons))


; evaluates to: (quote cons)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(k)
(car (quote (quote cons)))


; evaluates to: quote


; car in scheme = a primitive operation. car and cdr are the main operations. 
;car focuses (i.e. extracts.) on the first pointer and cdr operation extracts the 
;second. ) if you were to run cdr (quote (quote cons)) on this, it would return nothing 
;because there isn't a second pointer/cell. 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(l)

(+ 2 3)


; evaluates to: 5 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(m)

(+ '2 '3)

; evaluates to: 5 



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(n)

(+ (car '(2 3)) (car (cdr '(2 3))))


; evaluates to: 5
; to ask for help understanding this. 


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise 2.2.3(o)
((car (list + - * /)) 2 3)


; evaluates to: 5

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

