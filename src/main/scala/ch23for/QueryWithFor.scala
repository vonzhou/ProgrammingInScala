case class Book(title: String, authors: String*)

val books: List[Book] =
  List(
    Book(
      "Structure and Interpretation of Computer Programs",
      "Abelson, Harold", "Sussman, Gerald J."
    ),
    Book(
      "Principles of Compiler Design",
      "Aho, Alfred", "Ullman, Jeffrey"
    ),
    Book(
      "Programming in Modula-2",
      "Wirth, Niklaus"
    ), Book(
      "Elements of ML Programming",
      "Ullman, Jeffrey"
    ),
    Book(
      "The Java Language Specification",
      "Gosling, James", "Joy, Bill", "Steele, Guy", "Bracha, Gilad"
    )
  )


val a = for (b <- books; a <- b.authors if a startsWith "Gosling")
  yield b.title
println(a)

val b = for (b <- books if (b.title indexOf "Program") >= 0)
  yield b.title
println(b)

val c = for (b1 <- books; b2 <- books if b1 != b2; a1 <- b1.authors; a2 <- b2.authors if a1 == a2)
  yield a1
println(c)
println(removeDuplicates(c))


def removeDuplicates[A](xs: List[A]): List[A] = {
  if (xs.isEmpty) xs
  else
    xs.head :: removeDuplicates(
      //      xs.tail filter (x => x != xs.head)
      for (x <- xs.tail if x != xs.head) yield x
    )
}






