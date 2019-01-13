package ch16


object Reverse1 {
  def rev[T](xs: List[T]): List[T] = xs match {
    case List() => xs
    case x :: xs1 => rev(xs1) ::: List(x)
  }

  def main(args: Array[String]) {
    println("rev(List(5, 7, 1, 3)) [" +
      rev(List(5, 7, 1, 3)) + "]")
  }
}
