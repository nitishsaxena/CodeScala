package Chapter1

object Basics4 {
  def main(args : Array[String]): Unit ={

    var a = 10
    a = 20
    println(a)
    var variable = 20
    var weirdVariable = (variable = 20 )
    println(weirdVariable)
  }
}


object Demo extends App{

  val codeBlock = {
    val variable1 = 10;val variable2 = 20
    if ( variable1 == variable2)
      println("Hello Sir")
        else
      println("Good Bye @@")
  }
   println(codeBlock) // O/p : () | comes in category of side block | In short you can say, CODE BLOCKS IN SCALA ARE EXPRESSIONS | PRINTING SIDE BLOCKS IS SIDE EFFECTS.
}

// Expressions (expressions are evaluated )
//    VS
// Instructions (Instructions are executed (think JAVA ))


// IMP : In scala we will think in terms of expressions. Never use while loops in SCALA ( SIDE EFFECT)


object whileTesting{
  def main (args : Array[String]): Unit ={


   // Problem

    val someValue = {
       2 < 4
    }
    println(" ************** " + someValue + " *********** ")

    val someOtherValue = {
      if (someValue) 239 else 93
    }
    println(" ************** " + someOtherValue + " *********** ")
    println(someOtherValue)

  }
}