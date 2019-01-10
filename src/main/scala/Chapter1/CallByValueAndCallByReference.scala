package Chapter1

object CallByValueAndCallByReference extends App{


  // Call By Value

  def callByValue(value1:Long) : Unit = {
      println("Value of value1 in case of callByValue is: "+ value1)
      println("Value of value1 in case of callByValue is: "+ value1)
  }

  // Call by Reference

  def callByName(x: => Long):Unit= {
      println("Value of x in case of callByName is: "+ x)
      println("Value of x in case of callByName is: "+ x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  /* Output:
  Value of value1 in case of callByValue is: 96237277283089
  Value of value1 in case of callByValue is: 96237277283089
  Value of x in case of callByName is: 96237426197579
  Value of x in case of callByName is: 96237426280510

  Above you can see that,  In case of call By value, the function will return the same timestamp but
  but In case of call By Name, the function will return the different timestamp.


  Reason is: In callByValue- System.nanoTime() this evaluates first and the value goes to calling function. That is the reason n both case we get the same value in callByValue.
  But in callByName - System.nanoTime() directly goes to calling function and then evaluates, that is the reason, there is difference in time.
  */

  // " => " this tells the compiler that values will be call by Name not by Value. This is the evaluating expressions in Functions. => this symbol had done the operations lazy.. that's y we called this as Lazy operations.




  // => this will make the evaluation lazy, and it terminates when variable will call. See BELOW-

                                                // IMPORTANT PROGRAM //



  def infiniteFunction():Int = 1+ infiniteFunction()
  def printFirst(x:Int, y: => Int) =  println(x)

  printFirst(infiniteFunction(),10) /* Gives a Stack Overflow error, reason is you are passing an infinite function to printFirst argument as x and x was evaluating . println(x) */

  printFirst(10, infiniteFunction()) /* Gives No error and Output should be =  10. Reason is: you are passing an infinite function tp second argument as y which is defined as callByName ( and we know callByName is defined by symbol => which is for lazy operation, and in lazy operation when variable(y) will be used then function will evaluate. Here we are printing the println(x), that is why y=infiniteFunction() will never ever trigger. */







}
