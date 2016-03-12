import scala.io.Source
/**
  * Created by y on 2016/03/13.
  */
object Main {
  def main(args: Array[String]) {
    val body = Source.fromURL("http://icon.jp/")
    val lines: Iterator[String] = body.getLines()

    val freeVSTs = findFree(lines)
    for(freeVST <- freeVSTs){
      val url = parseURL(freeVST)
      val text = parseText(freeVST)
      println(text + ": " + url)
    }
  }

  def findFree(lines: Iterator[String]): List[String] = {
    var vstList: List[String] = List()
    for (line <- lines) {
      if (line.contains("無償") && line.contains("main-index-title")) {
        vstList = vstList ::: List(line)
      }
    }
    vstList
  }

  def parseURL(string: String): String = {
    string.replace("<h5 class=\"main-index-title\"><a href=\"", "").split("\"")(0)
  }

  def parseText(string: String): String = {
    val url = parseURL(string)
    val header = "<h5 class=\"main-index-title\"><a href=\"" + url + "\" class=\"main-index-title\">"
    val text = string.replace(header, "").replace("</a></h5>", "")
    text
  }
}
