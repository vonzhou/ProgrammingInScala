object Exceptions {
  def throws1 {
    throw new IllegalArgumentException
  }

  def throws2(n: Int) = {
    val half =
      if (n % 2 == 0)
        n / 2
      else
        throw new RuntimeException("n must be even")
    half
  }

  def throws3 {
    import java.io.FileReader
    import java.io.FileNotFoundException
    import java.io.IOException

    try {
      val f = new FileReader("input.txt")
      // Use and close file
      println("f [" + f + "]")
    } catch {
      case ex: FileNotFoundException => // Handle missing file
        println("ex [" + ex + "]")
      case ex: IOException => // Handle other I/O error
        println("ex [" + ex + "]")
    }
  }

  def finally1 {
    import java.io.FileReader

    val file = new FileReader("input.txt")
    try {
      // Use the file
    } finally {
      file.close() // Be sure to close the file
    }
  }

  import java.net.URL
  import java.net.MalformedURLException

  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException =>
        new URL("http://www.scala-lang.org")
    }

  def f(): Int = try return 1 finally return 2

  def g(): Int = try 1 finally 2
}

try {
  Exceptions.throws1
} catch {
  case ex =>
    println("ex [" + ex + "]")
}

try {
  println("Exceptions.throws2(2) [" + Exceptions.throws2(2) + "]")
  Exceptions.throws2(3)
} catch {
  case ex =>
    println("ex [" + ex + "]")
}

Exceptions.throws3
println("Exceptions.urlFor(\"blah\") [" + Exceptions.urlFor("blah") + "]")
println("Exceptions.f [" + Exceptions.f + "]")
println("Exceptions.g [" + Exceptions.g + "]")
