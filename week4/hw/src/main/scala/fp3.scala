 object fp3 {

  // EXERCISE 1: 
  def member (a : Int, xs : List[Int]) : Boolean = {
    xs match{
      case Nil => return false
      case x::xs => if (a == x) return true else member(a,xs)
    }
  }

  // EXERCISE 2: 
  def allEqual (xs : List[Int]) : Boolean = {
	xs match {
	case Nil => return true
	case x::Nil => return true
	case x::xs => if (x == xs.head) allEqual(xs.tail) else return false
	}

  }

  // EXERCISE 3: 
  def stringLengths (xs:List[String]) : List[(String, Int)] = {
    xs.map(x => (x,x.length))
  }

  // EXERCISE 4: 
  def delete1 [X] (x:X, ys:List[X]) : List[X] = {
    ys match{
	case Nil => Nil
	case y::ys => if(y==x) delete1(y,ys) else y::delete1(x,ys)
	}
  }

  // EXERCISE 5: 
  def delete2 [X] (x:X, ys:List[X]) : List[X] = {
    for(a <- ys; if (a != x)) yield a
	
  }

  // EXERCISE 6: 
  def delete3 [X] (x:X, ys:List[X]) : List[X] = {
    ys.filter(y=>y!=x)
  }

  // EXERCISE 7: 
  def removeDupes1 [X] (xs:List[X]) : List[X] = {
    xs match{
	case Nil => Nil
	case x::Nil => List(x)
	case x::xs => if (x == xs.head) removeDupes1(xs) else x::removeDupes1(xs)
	}
  }


  // EXERCISE 8: 
  def removeDupes2 [X] (xs:List[X]) : List[(Int, X)] = {
    def rd2 [X] (x:X, xs:List[X],i:Int) :List[(Int,X)] = {
	xs match{
	case Nil => if (x==Nil) List() else (i,x)::List()
	case y::ys => if(y == x) rd2(x,ys,i+1) else (i,x)::rd2(y,ys,1)}
	}
	if(xs.length>0) rd2(xs.head,xs.tail,1)
	else List()
  }


  // EXERCISE 9: 

  def splitAt [X] (n:Int, xs:List[X]) : (List[X], List[X]) = {
    (n,xs) match{
	case(_,Nil) => (Nil,Nil)
	case (-1,xs) => (List(),xs)
	case (n,x::xs) => {
	val(lista,listb) = splitAt(n-1,xs) 
	if(n>0) (x::lista,listb) 
	else (lista,x::listb)}
	}
  }

  // EXERCISE 10:

  def allDistinct (xs : List[Int]) : Boolean = {
    xs match{
	case Nil => return true
	case x::xs => if(member(x,xs)) return false else allDistinct(xs)
	}
  }
}