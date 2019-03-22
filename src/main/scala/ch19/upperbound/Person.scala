// mix Ordered trait
class Person(val firstName: String, val lastName: String)
  extends Ordered[Person] {

  def compare(that: Person) = {
    val lastNameComparison = lastName.compareToIgnoreCase(that.lastName)
    if (lastNameComparison != 0)
      lastNameComparison
    else
      firstName.compareToIgnoreCase(that.firstName)
  }

  override def toString = firstName + " " + lastName
}


val robert = new Person("Robert", "Jones")
val sally = new Person("Sally", "Smith")
val res = robert < sally
println(res)


// upper bound
def orderedMergeSort[T <: Ordered[T]](xs: List[T]): List[T] = {
  def merge(xs: List[T], ys: List[T]): List[T] =
    (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (x < y)
          x :: merge(xs1, ys)
        else
          y :: merge(xs, ys1)
    }

  val n = xs.length / 2
  if (n == 0)
    xs
  else {
    val (ys, zs) = xs splitAt n
    merge(orderedMergeSort(ys), orderedMergeSort(zs))
  }
}


val people = List(
  new Person("Larry", "Wall"),
  new Person("Anders", "Hejlsberg"),
  new Person("Guido", "van Rossum"),
  new Person("Alan", "Kay"),
  new Person("Yukihiro", "Matsumoto")
);
val sorted = orderedMergeSort(people);
println(sorted)


