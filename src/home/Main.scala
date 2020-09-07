package home

import numbers._

object Main extends App {
  println("This will house all solutions, displaying the prompt and then the code solving it below!")

  val solutionInput: Int = 15

  println(ExtendablePi.getPrompt)
  println(s"Pi to $solutionInput decimal places: ${ExtendablePi.solve(solutionInput)}")

  println(ExtendableE.getPrompt)
  println(s"E to $solutionInput decimal places: ${ExtendableE.solve(solutionInput)}")


  println(Fibonacci.getPrompt)
  println(s"Fibonacci out $solutionInput places: ${Fibonacci.solve(solutionInput)}")
}
