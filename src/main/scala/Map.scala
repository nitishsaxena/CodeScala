object Map extends App {

  // Map Functions ---
  val listArray1 = List.range(1,10)
  val listArray2 = List.range(1,10,3)
  val listArray3 = List[Any](10,20,"ABC",10.0d,"XYZ",100000)
  val listArray4 = List[String]("ABC","XYZ")
  val listArray5 = List[Int](10,20)
  val listArray6 = List(1,2,3,45,5,6)


  println(listArray1 + "\n" + listArray2)

  // Map -- accept Predicate -- returns True/False (Boolean)


  // 1st Way
  println(listArray1.map(
    x => x % 2 == 0
  ))

  // 2nd Way
  println(listArray1.map(
    _%2==0
  ))

  // Let's See --


  // FlatMap Functions ---

  val flatMap = List(List(1,2,3),List(3,4,5),List(4,5,6))
    println( flatMap.flatMap(_.filter(_%2==0)))
    println( flatMap.map(_.filter(_%2==0)))
    println( flatMap.flatten)
}



