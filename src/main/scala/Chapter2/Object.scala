package Chapter2

object Object extends App {

  // This is function
  def mainObjectFunction: Unit = {

  }
  def schoolAdmission(name: String , collegeName : String):String = {
    s"$name is present in this $collegeName"
  }
  // This is kind of scala class which we create in Java. This is how we make in scala.
  object mainobject {
    var name = "Nitish"
    var age = 24
    println(schoolAdmission("Nitish","SHIC"))

  }
  println(mainobject.name + "   "  + mainobject.age)

  // You can store the one object in another Object.
  val importantInstance5 = mainobject
  val importantInstance6 = mainobject
  println(importantInstance5.age + "  " + importantInstance6.name)
  println(importantInstance1 == importantInstance2) // true ( because both importantInstance 1 & 2 is pointing to mainobject ).
  println(importantInstance1 == importantInstance2)


                                                    // COMPANIONS //


  object COMPANION { }

  class COMPANION { }

  val importantInstance1 = COMPANION
  val importantInstance2 = COMPANION
  val importantInstance3 = new COMPANION
  val importantInstance4 = new COMPANION

  println(importantInstance1 == importantInstance2) // True  because both importantInstance 1 & 2 is pointing to mainobject. In this new address is not allocated to importance 1 & 2
  println(importantInstance3 == importantInstance4) // False because in this new address is allocated to importance 3 & 4.

  // Importance of Companions ==


  //Example of Companion ==

  object companionExample {
    def function1 (name : String ) : Unit = {println(s"Name is $name")}
    println("ABC_XYZ")
  }
  class companionExample  {
    def function1(name : String) : Unit = {println(s"Name is $name")}
    println("XYZ_ABC")
  }

  val companionExampleOfObject0 = new companionExample()
  val companionExampleOfObject1 = new companionExample

  println(companionExampleOfObject0)
  println(companionExampleOfObject1)

  // #3

  val dummy = companionExample

  val list = List(1,"ABC",3,"Nitish",5)
  println(
  list.map{
    case _ : String => true
    case _ : Any => false
  })

  val list1 = List(List(1,2,3),List(4,5,6),List(7,8,9))
  println(list1.flatten)
  println(list1.flatMap(
    _.filter( _ % 2 == 0)
  ))

  // Filter will return - Int , String type values but in Map it will return boolean value (because Map accept Predicates)

}
/*
Important:
  1- In Scala, every Scala object = Singleton Instance.
  2- COMPANIONS - writing object and class with same name in same scope is called COMPANIONS.
  3- In Scala, every object is Singleton Object. In Singleton only one variable will refer to Singelton Object
 */

