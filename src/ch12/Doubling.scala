package ch12

// 不好理解?!
trait Doubling extends IntQueue {
  abstract override def put(x: Int) = {
    super.put(2 * x)
  }
}
