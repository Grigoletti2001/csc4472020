
object argpass {

  class RefInt (initial : Int) {
    private var n : Int = initial 
    def get () : Int = n 
    def set (m : Int) : Unit = { n = m }
 }


def refint1 (f : RefInt => Unit) : (Int, Int, Int) = {
    val r = new RefInt (0)
    f (r)
    val n : Int = r.get
    f (r)
    val m : Int = r.get
    f (r)
    val x : Int = r.get
    (n, m, x)
  }

 def refint2 (f : RefInt => Unit) : (Int, Int, Int) = {
    val r = new RefInt (0)
    val s = new RefInt (0)
    val t = new RefInt (0)
    f (r)
    f (s)
    f (t)
    val n : Int = r.get
    val m : Int = s.get
    val x : Int = t.get
    (n, m, x)
  }


  def refint3 (r : RefInt) : RefInt = {
    val n : Int = r.get
    r.set(r.get + 1)
    val m = new RefInt (n * 2)
    m
  }


  def refint4 (r : RefInt, f : RefInt => Unit) : Boolean = {
    val t = new RefInt(r.get)
    f (t)
    if( t.get  == r.get ){
      true   
    }else{
      false
    }
  }


  def refint5 (xs : List[RefInt]) : Unit = {
    xs match{
      case Nil => Nil
      case y::ys => y.set(20)
    }
  }

}
