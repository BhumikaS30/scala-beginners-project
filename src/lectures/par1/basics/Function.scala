package lectures.par1.basics

object Function extends App {
  def aFunction(a: String, b: String): String = a + " " + b
  println(aFunction("hello", "world!"))

  def aParameterLessFunction() : Int = 42
  println(aParameterLessFunction()) //or
  println(aParameterLessFunction)

  //WHEN U NEED LOOPS USE RECURSION
  def aRepeatedFunction(aString: String, n: Int) : String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hello!", 3))

  //U can define auxiliary functions inside a code block
  def bigFunction(n:Int) : Int = {
    def smallFunction(a: Int, b: Int) : Int = a + b
    smallFunction(n , n-1)
  }

  /*
  1. A greeting function for kids (name, age) -> Hi my name is $name and i am $age years old!
  2. Factorial function 1 * 2 * 3 * ..... * n
  3. Fibonacci function
     f(1) = 1
     f(2) = 1
     f(n) = f(n-1) + f (n-2)
  4. Test if a number is prime
   */

  def greetingFunction(name: String, age: Int) : String = {
    "Hi my name is " + name + " and i am " + age + " years old!"
  }
  println(greetingFunction("Bhumika", 28))

  def factorial(n : Int) : Int = {
    if (n <= 0) 1
    else n * factorial(n-1)
  }
  println(factorial(5)) // 5 * 4 * 3 * 2 * 1 = 120

  def fibonacci(n: Int) : Int = {
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2) //1 1 2 3 5 8..
  }
  println(fibonacci(8))

  def isPrime(n: Int) : Boolean = {
    def isPrimeUntil(t: Int) : Boolean = if (t <= 1) true else n % t != 0 && isPrimeUntil(t -1)
    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
 }
