package Chapter2

class Person{
  var Name: String = "Nitish"
  var Age: Int = 25
}
/******************************************/
// Constructor

object OOPs extends App {
  val personObject = new Person()
  println(personObject.Age)
  println(personObject.Name)

  class PersonConstructor(name: String = "Nitish", age: Int = 25) {
    def function(): Unit = println(s"Hello my name is $name and my age is $age")
  }

  val variable = new PersonConstructor()
  variable.function()

  // Concept - 1

  class Important(name: String, age: Int) {
    def greet(name: String, age: Int): Unit = {
      println(" Watch the difference!!")
      println(s"My name is $name and my age is $age")
      println(s"My name is ${this.name} and my age is ${this.age}")


    }
    // Auxillary constructors are so Impratical - that they define only for default value- See below example -
    def this(name:String) = this(name , 0)
    def this() = this("Nitish")

    // Above way of defining Auxillary Constructor is so Impratical, because we can define the default value by below as well.
    def definingDefaultvalue(name : String = "Nitish", age : Int = 25 ) = println(s"Hello My name is $name and my age is $age")
  }


  val imp = new Important("Harshit", 22)
  imp.greet("Nitish", 25)

  //  Concept - 2 Method Overloading

  // Overloading means supplying the methods with the same name but different signatures different signatures means different numbers of parameters or parameters of different types coupled with possibly different.

}
