package Excercise

/*
*Lisp style
Java style
Using the List class range method
Using the List class fill method
Using the List class tabulate method
* */
object ListTypes extends App {
  // 1- Lisp Style

  val listArray = 1 :: 2 :: 3 :: 4 :: Nil
  println(listArray)

  val listMixedArray = List[Any](1, "Nitish", 2 , "Saxena")
  val list = List[Any](1, 2, "Nitish", "Saxena", 1.0d )

  // here we define Any as a type of List. you can also define any other datatypes like Number and all. By default the type of list is " Any'. This is what I think. // val listAnyElements = List(1, "hi", 1.0d )  <= In this array it accepts any types of elements.

  // 2 - Java Style

  val listJavaStyle = List(1,2,3,4)

  // 3 - Scala list with Range Method -

  val listWithRangeWithoutStepValue = List.range(1,10)
  val listWithRangeWithStepValue    = List.range(1,10,2)

  // 4 - Create a Scala List with the List class ‘fill’ method

  val listWithFillMethod = List.fill(10)("Hi"," ", "How are you")
  println(listWithFillMethod) //List(Hi, Hi, Hi, Hi, Hi, Hi, Hi, Hi, Hi, Hi)

  // 5 -
      // a - First Way!! In Scala collections, distinct is used to filter un identical values.
  println(listWithFillMethod.distinct)
      // b - Second way!! Use to Set method, set method automatically removes duplicates.
  println(listWithFillMethod.toSet.toList)

  //  Important  6 - Create a Scala List with the List class ‘tabulate’ method. Tabulate method creates a new List whose elements are created according to the function you supply. Below I am passing the function " _*10 ".

  val listWithTabulateFirst = List.tabulate(10)(_*10)
  println(listWithTabulateFirst)

}
