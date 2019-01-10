package Chapter1

import scala.annotation.tailrec

object TypeInference extends App {

  // How compiler get to know the datatype. In below,compiler see right hand side, that it is integer value, so it is expecting the same from right hand side.

  var a = 2

  //RECURSION

  // Code -1
  //@tailrec --if here you use tailrec, then it gives error -- Basics1.function is not in tailrec.
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(100)) //6

  // Code-2 # output = 0 (Reasons is return type is Int - which can't hold this large value. So, you have to change the return type to BigInt.
  //  def factorial(n: Int): BigInt = {
  //    if (n <= 1) 1
  //    else n * factorial(n - 1)
  //  }
  println(factorial(20000)) // Gives an error@@ stack Overflow error -- when we tried to do recursion for 20000 value, it is actually consumes deep memory which blow the stack and it crashes.

}


// Code - 3 IMP:
object tailRecusrion extends App{
  // TAIL RECURSION

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n,1)
  }
  println("Factorial of 20000 is " + anotherFactorial(20000))
}


// Difference between code 2 & 3 is- In code 3, JVM evaluates n*factorial(3-1) at runtime and then in next loop it evaluates n*factorial(3-1) * factorial( but in code 3 (which is based on tail recursion - evaluates at the end, it keep in stack memory and process at the end.

// When you want a assurity from compiler, that below code block should be like-- tail recursion then use @tailrec.

// when you need loops, then use TAIL RECURSION.



// Tail Recursion Practice - - -

object practice extends App {
  def factorial(i: Int):BigInt = {
    @tailrec
    def factorialHelper(x : Int, accumulator: BigInt):BigInt =
      if(x <=1 ) accumulator
        else
        factorialHelper(x-1, x*accumulator)

    factorialHelper(i,1)
  }
  println(factorial(10000))
}


//Code -5 Add all the no.s = 555 || 555+554+553+.......


object code5 extends App {
  def sum(n : Int): Int= {
    if (n ==0) n
    else n + sum(n-1)
  }
  println(sum(1000000000))
}

// Code -5 with Recursion only gives stack over flow error-- reason is it allocate one stack for every computation. Like in first stack -- 10000000 + sum(1000000 - 1). In Second stack, result of first stack + sum (result of first stack -1 ) and so on. So for large number like 1000000 so many stacks got allocated which in turns blow the stack (Heap Memory).

// For this we will use Tail Recursion

object code5WithTailRecursion extends App {
  def sum(x : Int ): BigInt= {
    def helper(n : Int , accumulator: BigInt):BigInt =
      if (n == 0 ) accumulator
      else helper(n-1,(n+accumulator))

    helper(x,0)
  }
  println(sum(1000000000))
}

                                  /*<<<<<<< IMP >>>>>>>>>*/

// At the end -- Definition of Tail Recursion -- 1@ Recursive call is the last operation performed. 2@ No operation or data saved when call returns. If you gave a look to all the programs which I developed above, then you can get better clarity. Compiler can reuse  stack frame to convert recursion to loop. 3@@ Create a helper Basics1.function that takes an accumulator. 4@@ Old base becomes


// Why we create a helper Basics1.function in main Basics1.function. Helper Basics1.function keeps the track of sum of nos.


// ACCUMULATOR IS THE MAIN WHICH HOLDS THE VALUE OF RESULT.

// Code 8 -- Concatenate the String n times.


object code8 extends App {
      def helperFunction(n: Int, aString: String , accumulator:String) : String =
        if (n <= 1) accumulator
        else
          helperFunction(n-1, "Nitish", aString+" "+accumulator)

      println(helperFunction(10,"Nitish", " "))
}


// code 9 -- Prime / Non Prime

// Code 10 -- Fibbonaci with t recursion

// Code 11 - How to Define the default Value. :-

object PassingTheParameter extends App {
  def functionOne(str:String, int:Int =1 ):String = {
    str+int
  }
  functionOne("Nitish")
  //  functionOne(str:String, int:Int =1 ):String = { --- In this int:Int =1 you defined the default value of int variable to 1.

  def functionSecond(str:String, int:Int  ):String = {
    str+int
  }
  functionSecond("Nitish",1)
}
//  functionOne(str:String, int:Int =1 ):String = { --- In this int:Int =1 you defined the default value of int variable to 1.

// Code 12

object PassingTheParameteradvanced extends App {
  def functionOne(str:String = "Zero", int:Int =1 ):String = {
    str+int
  }
  functionOne()
  def functionSecond(str:String = "Zero", int:Int ):String = {
    str+int
  }
  // functionSecond(1) -- Suppose you want to give value to int variable by passing the value from Basics1.function calling. How can you give? functionSecond(1) this is wrong, this will gives you compilation error.

  // This is the method by which you can give the value to second third and so on args.
  functionSecond(int = 10)
  // by this you can pass the arguments in different order as well.

  functionSecond(int = 20 , str = "Saxena") // => this works.
}




                                // String Basic Basics1.Operations //


object StringBasicOps extends App{
  var str : String = " Hello!! This is Scala "
  println(str.split(" ").toList)

  //store the list in List[String] variable. Task -- you have to iterate the values from list array.
  var listSplit: List[String] = str.split(" ").toList


  val a = 10
  val aString ="50" // this is r8
  val aStringWrong =" 50 " // this is wrong.. Reason is there are two spaces.
  println(aString.toInt)
  println(a +: aString :+ a)

  // +: pre pending
  // :+ post pending
}


// Scala Specific Interpolators - Insertion of something of a different nature into something else.

// S-Interpolator

object SInterpolators extends App {
  def function1() : Unit = {
    val digit:Int = 25
    val str:String = "Nitish"
    // s -Interpolator
    println(s"Hello my name is $str and my age is $digit") // before the string append the 's' and you can call the values at runtime in String as well.
    println("Hello this is scala \n Hello this is nitish which trying to learn")

    // raw -Interpolator
    // Scenario - 1
    println(raw"Hello this is scala \n Hello this is nitish which trying to learn") // raw -- this will use the string as raw, will not do any computation in between.
    // Scenario - 2
    val stri = "Hello Issue is here \n Hi Hello Bye Bye@@"
    println(raw"$stri")
  }
  function1()
}

// F- Interpolator








