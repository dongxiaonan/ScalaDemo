package example

import Projects.fizzbuzz.FizzBuzz

object Main extends App {
  val ages = Seq(42, 9, 29, 64)
  println(s"The oldest person is ${ages.max}")

  // fizz buzz
  FizzBuzz.execute();
}
