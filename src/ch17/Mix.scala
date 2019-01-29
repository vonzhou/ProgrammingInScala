println("展示List的使用")
val colors = List("red", "blue", "green")
colors.head
// List
colors.tail


val fiveInts = new Array[Int](5)
val fiveToOne = Array(5, 4, 3, 2, 1)
fiveInts(0) = fiveToOne(4)
fiveInts


println("展示ListBuffer")
import scala.collection.mutable.ListBuffer
val buf = new ListBuffer[Int]
buf += 1
buf += 2
buf
3 +=: buf
buf.toList

println("数组缓冲ArrayBuffer")
import scala.collection.mutable.ArrayBuffer
val buf2 = new ArrayBuffer[Int]()
buf2 += 12
buf2 += 15
buf2
buf2.length
buf2(0)

println("StringOps字符串序列操作")
def hasUpperCase(s: String) = s.exists(_.isUpper)
hasUpperCase("Robert Frost")


println("Set=============")
val set = Set.empty[String]
val set2 = Set("hello")










