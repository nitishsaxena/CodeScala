package Excercise

object ImpMethodNotation extends App {

  class Person(nameOfPerson : String , favouriteMovie: String ) {
    def like (favoriteMovie : String) : Boolean = favoriteMovie == this.favouriteMovie
    def likes(favouriteMovieOne: String , favouriteMovieSecond: String) : Boolean = {
      favouriteMovieOne == this.favouriteMovie && favouriteMovieSecond == this.favouriteMovie  }
    //def hangOut(person: Person):String = s"$person hanging Out with $nameOfPerson"
    def +(person: Person):String = s"$person hanging Out with $nameOfPerson"

  }

  val personVariable = new Person("Nitish","Inception")

  // 1- How to pass the values to method --

  println(personVariable.like("Inception") )// Output : True

  /********************************************************************************************************************************************/

  // 2- Classic Way

  println(personVariable like "Inception ") // This is called INFIX NOTATION OR OPERATOR NOTATION.

  /********************************************************************************************************************************************/

  // 3 - Classic Way flause - println(personVariable likes "Inception" "Inception") --  Classic Way, Infix Notation works for only One Argument. If there is More than argument than you have to use OLD method (#4)

  // #4 - OLD Way same as #1

  println(personVariable.likes("Inception","Inception"))

  val personClassObject = new Person("Richa","FightClub")

  // In Scala, all operators are methods <GOOD> . You can use any operator as method (@@)

  // Case 1 +
  println(personVariable + personClassObject) //#!
  println(personVariable.+(personClassObject))// #2

  // #1 & #2 both are equivalent. In #1 && #2 , hangOut behave as Operator. We can use Operator at this position also.

  // Case 2  ?

  // Using operators as Method name is called Syntatic Sugar. Advantage of Syntatic Sugar is that you can write code like you are reading the lines of Book. :) Suppose you write code as below.. and see how cool is it when you are reading......

  def ?(name:String, age: Int):Unit = println(s"My name is = $name && and my age is $age")
  ?("Nitish",25)

println(" CASE example ")
  val listNitishOnDemand = List[Any]("A","B",1,1.0d,'C')
  println(listNitishOnDemand.filter{
    case _ : String => true
    case _ : Any => false
  })


  /************************************************************************************************************************************/

  // PRE-FIX NOTATION is all about methods as well like Aka Operators (! ? ). Pre Fix notation works on some operators ( - , + , ~(Tilda) , ! (Bang))

  /************************************************************************************************************************************/
  object func extends App {
    val x = -1
    val y = 1.unary_- // In Scala,  unary_!     unary_-     unary_+     unary_~   are supported. //
    println (
      if (x == y ) "Equals"
      else
        "Not Equals")

    /************************************************************************************************************************************/

    // PostFix Notation
    class PostFixFunction {
      def postFixFunction() : Unit = println(" @@ Post Fix Function Returns @@ ") }

    val z = new PostFixFunction()
    println(z.postFixFunction()) // #1
    println(z postFixFunction()) // #2

    // #1 & #2 both are equals and #2 called as POST FIX NOTATION.

    /************************************************************************************************************************************/
    // Apply Function --

    class Apply {
      var name = "Nitish"

      def apply(): String = s"Hi $name!! How are you??"

      def apply(name : String) = s"Hi $name!! How are you??"
    }
    val abc = new Apply()
    println(abc.apply())
    println(abc apply())
    println(abc())
    // Apply() is the function -- which is call directly if you call the object as a function. See above - three ways for apply function. Apply functions works for parameterized as well. See below an example.
    /************************************************************************************************************************************/
    println(abc("Nitish"))

  }



}
