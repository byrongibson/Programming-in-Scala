// vim: set ts=4 sw=4 et:

package chp1-9

object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
    yield file
}

/*def main(args: Array[String]) {
  
  FileMatcher(args(0))

}*/
