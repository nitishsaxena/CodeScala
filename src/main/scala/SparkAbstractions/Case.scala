package SparkAbstractions

object Case extends App {

  case class Person ( name:String , age:Int )

  val nitish = new Person("Nitish",25)
  val harshit = new Person("Nitish",25)

  // < < < < <  BENEFIT  -1 > > > > >       1. When you create class with case, then in that case. "" All parameter's become Fields ""

  println(nitish.name + nitish.age)
  println(harshit.name + harshit.age)

  // But If you remove the case from class, then you code looks like below -

  class Student(name : String , age : Int) {
    def func () = {
      println(s"Hey!! My name is $name and my age is $age")
    }
  }
  val student1 = new Student("Nitish",25)
  val student2 = new Student("Harshit",23)
  student1.func()
  student2.func()

  // < < < < <  BENEFIT  -2 > > > > >  2. In Scala, if we use toString() with case, with class, then it1case output will like " Person(Nitish,25) "
  println(nitish.toString)

  //  But if we use toString() without case, with class, then in this case output will like "" SparkAbstractions.Case$Student@6d7b4f4c ""
  println(student1.toString)


  // < < < < <  BENEFIT  -3 > > > > > 3. In Java, as we know, when we create two different instance of same class after that when we do obj1 == obj2  then it will gives output as FALSE.


  println(nitish == harshit) // true, because fields are same. // false, when fields are different.

  println(student1 == student2) // false, we create two different instances so they are pointing two different pools.



  // Case class has handy "copy" methods --





}
