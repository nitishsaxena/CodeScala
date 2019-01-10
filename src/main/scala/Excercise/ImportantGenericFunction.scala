package Excercise


object ImportantGenericFunction extends App {

  def genericFunction[T: Manifest](t : T):Manifest[T] = manifest[T]
  val arrayIntegerString = List(1,"Nitish", 2, "Hi", 3, "How", 4, "are", 5, "you")
  val arrayInteger = List.range(1 , 10)
  println(genericFunction(arrayIntegerString))
  println(genericFunction(arrayInteger))

}
