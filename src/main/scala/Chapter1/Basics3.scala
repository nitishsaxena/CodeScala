package Chapter1

object Basics3 {
    def main(args : Array[String]){}

  // var - MUTABLE (value change after assigning )
  // val - INMUTABLE (value can't change  after assigning)

  //Two ways to write --
  var variable1 = 10
  var variable2:Int = 10
  variable1 = 15 // Here you re assign the value to variable1@@

  val variable3 = 15
  val variable4 = 20
  //variable4 = 20 (Here reassigning is not so possible@@)

  // Calling a Basics1.function in SCALA -- ( Might be you can create Basics1.function in class only) Here you create a class under scala class.
  var a = new A()
  a.func(10)
}

class A {
   def func (a:Int): Unit = {
     print("Basics1.A B C D E F")
   }
}

// if you extend the Scala Object to "APP" then in that case you don't have to mention the def main method.
object Imp  extends App {


}
