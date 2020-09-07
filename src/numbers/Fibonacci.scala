package numbers

import home.CodeProblem

object Fibonacci extends CodeProblem {
  override def getPrompt: String = "Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number."

  def solve(n: Int): String = {
    var solutionString: String = "1, "
    var previousNumber: Int = 0
    var currentNumber: Int = 1
    for(i <- 1 until n){
      solutionString += s"${previousNumber + currentNumber}, "
      val inbetween = previousNumber + currentNumber
      previousNumber = currentNumber
      currentNumber = inbetween
    }
    solutionString.stripSuffix(", ")
  }
}