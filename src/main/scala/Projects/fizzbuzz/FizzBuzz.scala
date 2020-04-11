package Projects.fizzbuzz

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

  def execute(): Unit = {
    for (num <- 1 to 20){
      calFizzBuzz(num) match {
        case Left(s) => println(s"Number is ${num}, FizzBuzz result is ${s}")
        case Right(i) => println(s"Number is ${num}, FizzBuzz result is ${i}")
      }
    }
  }
}
