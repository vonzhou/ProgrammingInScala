// use implicit parameter
def maxListImpParm[T](elements: List[T])
                     (implicit ordering: Ordering[T]): T =

  elements match {
    case List() =>
      throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest =>
      val maxRest = maxListImpParm(rest)(ordering)
      if (ordering.gt(x, maxRest)) x
      else maxRest
  }

println(maxListImpParm(List(1, 5, 10, 3)))
println(maxListImpParm(List("ccc", "aaa", "bccc")))
