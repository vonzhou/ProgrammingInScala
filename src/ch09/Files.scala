package ch09

object Files {

  object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    private def filesMatching(matcher: String => Boolean) =
      for (file <- filesHere; if matcher(file.getName))
        yield file

    def filesEnding(query: String) =
      filesMatching(_.endsWith(query))

    def filesContaining(query: String) =
      filesMatching(_.contains(query))

    def filesRegex(query: String) =
      filesMatching(_.matches(query))
  }

  def main(args: Array[String]) {
    println("FileMatcher.filesEnding(\"scala\").toList [" +
      FileMatcher.filesEnding("scala").toList + "]")
    println("FileMatcher.filesContaining(\"Files1\").toList [" +
      FileMatcher.filesContaining("Files1").toList + "]")
    println("FileMatcher.filesRegex(\".*Re.ex.*\").toList [" +
      FileMatcher.filesRegex(".*Re.ex.*").toList + "]")
  }
}

