def maxList[T](elements: List[T])
              (implicit ordering: Ordering[T]): T =

  elements match {
    case List() =>
      throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest =>
      val maxRest = maxList(rest) // (ordering) is implicit
      if (ordering.gt(x, maxRest)) x // this ordering is  still explicit
      else maxRest
  }