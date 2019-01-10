package Excercise

object Excercise extends App {
  def func( x : Int) : Unit = {
    if(x >2 ) funcMultiply(10,20)  else funcAddition(10,20)
  }
  def funcMultiply(x: Int, y: Int ) : Unit = {
    println(s"Multiplication of $x and $y is = " + x*y)
  }
  def funcAddition(x: Int = 10 , y: Int = 20) : Unit = {
    println(s"Addition of two Nos is: $x and $y is = "+ x+y)
  }
  func(10)


}
