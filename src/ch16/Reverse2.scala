package ch16


object Reverse2 {
  def reverseLeft[T](xs: List[T]) =
    (List[T]() /: xs) { (ys, y) => y :: ys }

  def main(args: Array[String]) {
    println("reverseLeft(List(5, 7, 1, 3)) [" +
      reverseLeft(List(5, 7, 1, 3)) + "]")
  }
}
