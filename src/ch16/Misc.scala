package ch16


object Misc {
  val fruit = List("apples", "oranges", "pears")
  val nums = List(1, 2, 3, 4)
  val diag3 =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
  val empty = List()

  object ExplicitTypes {
    val fruit: List[String] = List("apples", "oranges", "pears")
    val nums: List[Int] = List(1, 2, 3, 4)
    val diag3: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    val empty: List[Nothing] = List()
  }

  // List() is also of type List[String]!
  // 协变 空列表类型是 List[Nothing]
  val xs: List[String] = List()

  object ExplicitCons {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    val diag3 = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
    val empty = Nil
  }

  object NoParens {
    val nums = 1 :: 2 :: 3 :: 4 :: Nil
  }

  // 我的想法,但是实际上length操作更耗时,为啥不记录一下?
  def append[T](xs: List[T], ys: List[T]): List[T] =
    if (xs.length > ys.length) append1(ys, xs)
    else append1(xs, ys)

  def append1[T](xs: List[T], ys: List[T]): List[T] =
    xs match {
      case List() => ys
      case x :: xs1 => x :: append1(xs1, ys)
    }


  def assoc = {
    val xs = List("x")
    val ys = List("y")
    val zs = List("z")
    val l1 =
      xs ::: ys ::: zs
    val l2 =
      xs ::: (ys ::: zs)
    l1 == l2
  }

  def forList = {
    for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)
  }

  def main(args: Array[String]) {
    println("assoc [" + assoc + "]")


    println("forList [" + forList + "]")
  }
}
