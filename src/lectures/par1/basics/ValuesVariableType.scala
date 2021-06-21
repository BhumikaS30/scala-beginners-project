package lectures.par1.basics

/**
 * created by Bhumika sharma on 22-Jun-21
 */
object ValuesVariableType extends App {
  //VALUES
  val x: Int = 42 // VALUES cannot be reassigned, they are IMMUTABLE
  println(x)

  val y = 42 // Type inference by compiler
  println(y)

  val aStr: String = "Bhumika"
  println(aStr)

  val aBool: Boolean = true
  val aChar: Char = 'B'
  val aInt: Int = x
  val aShort: Short = 4613
  val aFloat: Float = 12.89f
  val aDouble: Double = 12.45

  //VARIABLES
  var aVar:Int = 4
  aVar = 5 //Re-assignment allowed

  //Functional programming involves more of VALS tha VARS.
}
