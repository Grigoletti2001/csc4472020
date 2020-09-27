object fp2 {
  
  //Exercise 1:
 def map [A,B] (xs:List[A], f:A=>B) : List[B] = {

xs match {
    case Nil => Nil
   case x::xs => f(x) :: map (xs,f)
  }

}
  // EXERCISE 2:
  def filter [A] (xs:List[A], f:A=>Boolean) : List[A] = {
    xs match {
      case Nil     => Nil
      case y::ys if f(y) => y :: filter(ys,f)
      case _::ys   => filter(ys,f)
    }
  }

// EXERCISE 3: 
def append [A] (xs:List[A], ys:List[A]) : List[A] = {
    xs match   {
   case List() => ys
   case x::xs => x::append(xs,ys)
   }
}
  // EXERCISE 4: 
 def flatten [A] (xss:List[List[A]]) : List[A] = {
    xss match  {
   case Nil => Nil
   case ys::yss => ys:::flatten(yss)
      }
    }
 
  // EXERCISE 5: 
    def foldLeft [A,B] (xs:List[A], e:B, f:(B,A)=>B) : B = {
    xs match{
      case Nil => e
      case x::xs => foldLeft(xs,f(e,x),f)
    }
  }
  // EXERCISE 6: 
   def foldRight [A,B] (xs:List[A], e:B, f:(A,B)=>B) : B = {
    xs match {
      case Nil => e
      case y::ys => f(y,foldRight(ys,e,f))
    }
  }
  // EXERCISE 7: 
 def joinTerminateRight (xs : List[String], delimiter : String) : String = {
    def f(s: String, n: String) : String = delimiter + s + n
    xs match {
      case Nil => ""
      case y::ys => y + foldRight(ys,delimiter,f)
    }
  }
  // EXERCISE 8: 
   def joinTerminateLeft (xs : List[String], term : String) : String = {
    def f(s: String, n: String) : String = s + n + term
    xs match {
      case Nil => ""
      case y::ys => y + foldLeft(ys,term,f)
    }
  }
  // EXERCISE 9: 
def firstNumGreaterThan (a : Int, xs : List[Int]) : Int = {
    xs match {
   case Nil => throw new RuntimeException
   case x::xs => if(x < a) firstNumGreaterThan(a,xs) else x 
   }
}
  // EXERCISE 10: 
def firstIndexNumGreaterThan (a : Int, xs : List[Int]) : Int = {
    xs.indexOf(firstIndexAux(a,xs))
}
def firstIndexAux(a:Int,xs:List[Int]): Int ={
xs match{
case Nil => throw new RuntimeException
case x::xs => if(x < a) firstIndexAux(a,xs) else x
}
}
} 
      

//ends object fp2

