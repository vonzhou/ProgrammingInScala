
class SlowAppendQueue[T](elems: List[T]) { // Not efficient
  def head = elems.head

  def tail = new SlowAppendQueue(elems.tail)

  // 时间复杂度O（N）
  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x))
}


