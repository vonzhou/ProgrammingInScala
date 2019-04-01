
def maxListOrdering[T](elements: List[T])(ordering: Ordering[T]): T =
  elements match {
    case List() =>
      throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest =>
      val maxRest = maxListOrdering(rest)(ordering)
      if (ordering.gt(x, maxRest)) x
      else maxRest
  }


val list = List("abc", "helo", "aaa")
//val max = maxListOrdering(list, )

