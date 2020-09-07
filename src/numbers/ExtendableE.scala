package numbers

import home.CodeProblem

object ExtendableE extends CodeProblem {
  override def getPrompt: String = "Enter a number and have the program generate E up to that many decimal places. Keep a limit to how far the program will go."

  def solve(decimalPlace: Int): String = {
    // using math.Pi limits it to 15 places. Not cool
    if(decimalPlace < 16 && decimalPlace >= 0) {
      BigDecimal(math.E).setScale(decimalPlace, BigDecimal.RoundingMode.HALF_UP).toString()
    } else {
      "Sorry! Unable to calculate for that input. Please try something between 1 and 15"
    }
  }
}