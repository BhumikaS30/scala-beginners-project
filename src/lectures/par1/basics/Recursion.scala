package lectures.par1.basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial (n: Int) : Int = {
    if (n <= 1 ) 1
    else n * factorial(n - 1) // leads to stack overflow for a bigger number
  }

  def anotherFactorial(n : Int) : BigInt = {
    @tailrec // ensures the function is tail recursive
    def factHelper(x: Int, accumulator: BigInt) : BigInt = {
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator) // TAIL RECURSION = use recursive call as last expression
    }
    factHelper(n, 1)
  }

  /*
  print a string n times
   */

  @tailrec
  def concatString (aString: String, n: Int, accumulator: String) : String = if (n <= 0) accumulator else concatString(aString, n - 1, aString + accumulator)
  println(concatString("Hello! ", 3, ""))

  @tailrec
  def findMax(xs: List[Int], max: Int): Int = xs match {
    case head :: tail => findMax(tail, if (head > max) head else max)
    case Nil => max
  }
  val array : Seq[Int] = Seq(1,2,3,4)
  var sum: Int = array.sum
  val map : Map[Int, String] = Map(1 -> "Bhumika", 2 -> "Pratik")
  println(map.getOrElse(3, "Pratik"))
}
