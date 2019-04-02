
// not tail recursion
def incAll1(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case x :: xs1 => x + 1 :: incAll1(xs1)
}

// a very inefficient approach
def incAll2(xs: List[Int]): List[Int] = {
  var result = List[Int]()
  for (x <- xs)
    result = result ::: List(x + 1)
  result
}

// use ListBuffer
import scala.collection.mutable.ListBuffer

def incAll3(xs: List[Int]): List[Int] = {
  val buf = new ListBuffer[Int]
  for (x <- xs)
    buf += x + 1
  buf.toList
}