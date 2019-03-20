class SlowHeadQueue[T](smele: List[T]) { // Not efficient
  // smele is elems reversed
  def head = smele.last

  def tail = new SlowHeadQueue(smele.init)

  def enqueue(x: T) = new SlowHeadQueue(x :: smele)
}