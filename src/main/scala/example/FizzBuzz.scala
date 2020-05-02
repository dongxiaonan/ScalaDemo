package example

object FizzBuzz {

  def calFizzBuzz(num: Int): Either[String , Int] = {
    var result = ""
    if (num % 3 == 0) {
      result ++= "Fizz"
    }

    if (num % 5 == 0) {
      result ++= "Buzz"
    }

    if (result.isEmpty){
      Right(num)
    }else{
      Left(result)
    }
  }

  def execute(range: Range): Unit = {
    range.foreach(num => calFizzBuzz(num) match {
      case Left(s) => println(s"Number is ${num}, FizzBuzz result is ${s}")
      case Right(i) => println(s"Number is ${num}, FizzBuzz result is ${i}")
    })
  }
}
