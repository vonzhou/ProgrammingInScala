package ch16

// 使用模式匹配
object InsertionSort2 {
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs
    else y :: insert(x, ys)
  }

  def main(args: Array[String]) {
    println("isort(List(5, 3, 12)) [" + isort(List(5, 3, 12)) + "]")
  }
}
