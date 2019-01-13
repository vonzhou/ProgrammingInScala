
package Notebooks {

  class Apple

}

package Fruits {

  class Apple

}

object Ex7 {

  import Notebooks._
  import Fruits.{Apple => _, _}

  def main(args: Array[String]) {
    println("new Apple [" + (new Apple) + "]")
  }
}
