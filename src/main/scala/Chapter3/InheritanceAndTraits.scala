package Chapter3

object InheritanceAndTraits  extends App {
// Single Inheritance
  class ParentSingle {
    val variableP = 10
    private val variableP2 = 10

    final val variableP3 = 10

    val finalUpdateTry:Int = variableP3
    println(s" Adding 10 in final variable $finalUpdateTry+10" )
    println(" Adding 10 in final variable " + variableP + 10)
    println(s"Hey I am Parent Class@@ with one P variable $variableP")
    println(s"Hey I am Parent Class@@ with one P variable $variableP2")
    println(10+19) // #1
    // Important -- In scala, if you do 10+10 then it will consider as Int + Int (#1) But if you write something like -- #2 then it will consider as String+Int -- Unless of you mention the variable as Integer.

}
    //println(s"Hey I am Parent Class@@ with one P variable $variableP2") }
  class ChildSingle  extends ParentSingle {
    println("Hey I am Child Class@@")
  }
  val instanceChild = new ParentSingle
  println(instanceChild.variableP)

  /* Below will fails -- reason variableP2 is private. Will not accessible by any child class.
   println(instanceChild.variableP2)

   Modifiers --

      Public    -- accessible from same class and from another class as well
      Private   -- accessible from same class Only.
      Protected -- Public -- accessible from parent class and child class.
   */
  // Multi - Level Inheritance

  // CONSTRUCTORS - -

  class ParentDetails(name: String, age: Int){}
  // Big Difference -- In JAVA, Child class extends the Parent class and to call the constructor of child class we create the instance of child class and ChildClass childclass = new ChildClass(); --> ChildClass() --> this call your constructor. Suppose you want to call the constructor of parent class then in that case create instance of child class and use super() to call constructor of parent class first.
  class ChildDetails(name: String, age: Int) extends ParentDetails("Nitish",25){} // #1
  // class ChildDetails(name: String, age: Int) extends ParentDetails(name,age){} // #2 // #1 & #2 both are same.


}
