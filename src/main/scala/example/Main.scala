package example

object Main extends App {
  // 1 - find max
  val ages = Seq(42, 9, 29, 64)
  println(s"The oldest person is ${ages.max}")

  // 2 - fizz buzz
  FizzBuzz.execute(1 to 20)

  // 3 - binary clock
  BinaryClock.execute(1 to 10)

  // 一年中的第几天
  //DaySequence.execute("2019-01-19")
}
