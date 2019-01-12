package ch12

// P230 抽象队列的定义
abstract class IntQueue {
  def get(): Int

  def put(x: Int)
}
