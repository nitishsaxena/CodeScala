package Excercise

object FiltersEx extends App {

  /*
  <<<<<<<<<<<<<<<<<<<<<<  Below are the methods available which are used to filter in Collection >>>>>>>>>>
  collect
  diff
  distinct
  drop
  dropWhile
  filter        -- Done
  filterNot
  find
  foldLeft
  foldRight
  head
  headOption
  init
  intersect
  last
  lastOption
  reduceLeft
  reduceRight
  remove
  slice
  tail
  take
  takeWhile
  union
  */
  val listArray = List (List(1,2,3,4),List(5,6,7,8),List(9,10,11,12))
  // Check for examples for all above methods of filter Scala.

  // Filter --  To use filter on your collection, give it a predicate to filter the collection elements as desired. A predicate is just a method (or function) that returns a boolean value.

  // Imp : Unique characteristics of filter compared to these other methods include: Filter walks through all of the elements in the collection; some of the other methods stop before reaching the end of the collection.

  val arrayFisrt = List ( 1 to 10 )
  println(arrayFisrt)
  val arraySecond = List.range(1,11,3)
  println(arraySecond)

  val arrayThird = List.range(1,10,2)

  println( s" Even No's in this $arrayThird is = "  +
    arrayThird.map( _ % 2 == 0)
  )
  println(s" Even No's in this $arrayThird is = "   +
    arrayThird.filter(_ % 2 == 0)
  )

  /********************************************************************************************************************************************/
  println("Below is the classic Example!! ")
  /********************************************************************************************************************************************/


  val fruits = List[String] ( "Apple", " Orange ", "Banana", " Peru ")
  println(fruits.filter(_.startsWith("a")))

  println(fruits.filter(_.length > 2))

  val listLispStyle = "apple" :: "banana" :: "Peru" :: 1 :: 2 :: Nil
  println(listLispStyle.filter{
    case string : String => true
    case _  => false
  })


  val listMixture = List[Any](1,2,3,4,5,"Hi","How","are","you","@@")
  println(
    listMixture.filter{
      case _ : Int => true
      case _ : Any => false
    }
  )

  val listNosEvenAndOdd = List.range(1,100)



}

