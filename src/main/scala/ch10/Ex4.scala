// 字段 和  方法名 不能一样
class WontCompile {
  //  private var f = 0

  // Won't compile, because a field
  def f = 1 // and method have the same name
}
