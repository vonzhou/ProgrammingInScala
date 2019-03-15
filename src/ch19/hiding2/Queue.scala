
trait Queue[T] {
  def head: T

  def tail: Queue[T]

  def enqueue(x: T): Queue[T]
}


object Queue {
  def apply[T](xs: T*) = new QueueImpl[T](xs.toList, Nil)


  private class QueueImpl[T](
                              private val leading: List[T],
                              private val trailing: List[T]
                            ) extends Queue[T] {

    private def mirror =
      if (leading.isEmpty)
        new QueueImpl(trailing.reverse, Nil)
      else
        this

    def head = mirror.leading.head

    def tail = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def enqueue(x: T) = new QueueImpl(leading, x :: trailing)
  }

}

val q = Queue[Int](1, 2, 3)
//println(q)