package lectures.par1.basics

/**
 * created by Bhumika sharma on 22-Jun-21
 */
object Expressions extends App{

  //SIDE EFFECTS in scala are expressions returning UNIT -> () eg : while loop, println(), reassigning of vars
  //Everything in scala is expression and not instruction
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(1 == x)
  println(!(1 == x))

  var aVar = 2
  aVar += 3
  println(aVar)

  //IF expressions produces a value. Its a expression not a instruction
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 2
  println(aConditionValue) // 5

  //Code blocks in scala are expressions as well and return the value of last expression
  val someValue: Int = {
    if (1<2) 43 else 44
  }

}
