package example

import scala.util.matching.Regex

object BinaryClock {
  val maxHour = 11
  val maxMinute = 59
  var containsOneRegex : Regex = "(1)".r

  def getTimeByMax(count: Int, maxTime: Int): List[Int] = {
    var x = 0
    var times: List[Int] = Nil
    for (x <- 0 to maxTime if containsOneRegex.findAllMatchIn(x.toBinaryString).size == count){
      times = x :: times
    }

    times
  }

  def getResult(n: Int) = {
    var results :List[String]= Nil
    var x = 0
    var hour = 0
    var minute = 0
    for (x <- 0 to n){
      for( hour <- getTimeByMax(x, maxHour);  minute <- getTimeByMax(n - x, maxMinute)){
        val minuteString =  if (minute < 10)  s"0${minute}" else s"${minute}"
        results = s"${hour}:${minuteString}" :: results
      }
    }
    results
  }

  def printResult(results: List[String]): Unit = println(s"[${results.mkString(", ")}]")

  def execute(range: Range):Unit = range.foreach(n => printResult(getResult(n)))
}
