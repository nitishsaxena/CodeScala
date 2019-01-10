package Chapter1


/*********************************************/
object ScalaFunctions {
  def main(args: Array[String]): Unit ={
    mainFunction.functionNameWithOneArgument("Nitish")
  }
}
/*********************************************/
object mainFunction extends App {

  def functionNameWithOneArgument(name:String): Unit ={
    println(" Name of Hero is @@ " + name)
  }
}
/*********************************************/



        // SCALA FUNCTION

// 2 args scala fucntion --
object function extends App{
    def functionFirst(variable1: Int, variable2:Int):Int = {
      variable1 + variable2
    }

println(functionFirst(1,1))
}


//1 args and 0 params parameter scala Basics1.function --

object secondfunction extends App{
  def functionSecond():Int = {
    2
  }
  def functionSecond(str: String ):String =  {
    "Nitish"
  }
  //0 args parameter Basics1.function OR paramterless Basics1.function. Below are the two ways to write parameter less Basics1.function
  println(functionSecond()); /*OR*/  println(functionSecond)
}

// Below  is the example of Method Overloading And Method Over-riding also..

object mainfunction {
  def main (args : Array [String] ): Unit ={

    class A extends App {
      def function1() = {
        println ( "Hello World !! ")
      }
    }

    class B extends A {
    // In Scala || USE -- override keyword || for overriding the parent method.
      override def function1() = {
        println(" Hello Nitish")
      }
    }

    val classBobject = new B
    classBobject.function1()

  }
}
