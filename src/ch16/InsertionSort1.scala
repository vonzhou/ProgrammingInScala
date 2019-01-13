package ch16

// 插入排序
object InsertionSort1 {
  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

  def insert(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)

  def main(args: Array[String]) {
    println("isort(List(5, 3, 12)) [" + isort(List(5, 3, 12)) + "]")
  }
}
