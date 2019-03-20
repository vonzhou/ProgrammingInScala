package ch09

object Files2 {
  def filesHere = (new java.io.File(".")).listFiles

  def filesMatching(query: String,
                    matcher: (String, String) => Boolean) = {

    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(_))

  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))

  def filesRegex(query: String) =
    filesMatching(query, _.matches(_))

  def main(args: Array[String]) {
    println("filesEnding(\"scala\").toList [" +
      filesEnding("scala").toList + "]")
    println("filesContaining(\"Files1\").toList [" +
      filesContaining("Files1").toList + "]")
    println("filesRegex(\".*Re.ex.*\").toList [" +
      filesRegex(".*Re.ex.*").toList + "]")
  }
}

