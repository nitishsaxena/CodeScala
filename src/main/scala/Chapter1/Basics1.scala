package Chapter1

object Basics1 {
  def main(args : Array[String]): Unit ={
    var a =10
    var b =20
    // If statement
    if(a==b) println("Same") else println("Not same")
    for ( a <- 1 to 10){
      println ("No is "+ a)
    }
    // While Loop
    while (a < 11){
      println("a < 10")
      a= a+1
    }
    //Functional programming!!
    def m1(m:Int): Int = m * 10
    println("functional programming!!")
    println(m1(10))

    def function_name( variable_name : String): String = variable_name + " Nitish"
    println(function_name("Hi"))

    /*   !! Data Structure in Array !! */
    //Declare an array by assigning it some values
    var array_name1 = Array("C programming","JAVA","Spring","Spring Boot")
    //Declare an array by using new Keyword
    val array_name2 = new Array[String](3)
    array_name2(0) = " Hi "
    array_name2(1) = " Bye "
    array_name2(2) = " HI BYE "
    for ( i <- 0 to 2 )
      println(array_name2(i))


    /* LIST */
    var listarray = List("Nitish","Nitish","Saxena")
    for ( i <- 1 to 3) println(listarray(1))





  }
}
