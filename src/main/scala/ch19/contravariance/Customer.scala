class Publication(val title: String)

class Book(title: String) extends Publication(title)

object Library {
  val books: Set[Book] =
    Set(
      new Book("Programming in Scala"),
      new Book("Walden")
    )

  // Function1 参数的 convariance, contravariance
  def printBookList(info: Book => AnyRef) = {
    for (book <- books)
      println(info(book))
  }
}

object Customer extends App {
  def getTitle(p: Publication): String = p.title

  Library.printBookList(getTitle)
}

