package ScalaExcercise

import org.apache.spark.{SparkConf, SparkContext}

object ReadCSV2 extends App{
  val conf = new SparkConf().setAppName("readCSV2").setMaster("local[*]")
  val sc = new SparkContext(conf)
  val lines = sc.textFile("src\\main\\resources\\csv\\emp_data.csv")

  println(" CSV contains below Records")
  lines.foreach(println)

  // Now, we are doing transformation in RDD's.
  val splitRDD= lines.map(_.split("\t"))
  println("Split the lines into fields")
  splitRDD.foreach(println)
  Thread.sleep(10000000)


  object ReadCSV3 extends App {

    val lines = List(1, 2, 3, 4, 5)
    println(lines.map(_ * 2)) // List(2, 4, 6, 8, 10)
    println(lines.map(_ != 2)) // List(true, false, true, true, true)

    val flatlines = List(List(1, 2, 3), List(2, 3, 4))
    println(flatlines.flatten) // List(1, 2, 3, 2, 3, 4)
    println(flatlines.flatMap(_.map(_ * 2))) // List(2, 4, 6, 4, 6, 8) because of flatMap, it merges two lists into two.
    println(flatlines.map(_.map(_ * 2))) //List(List(2, 4, 6), List(4, 6, 8))

    println(flatlines.flatMap(_.map(_ % 2 == 0))) //List(false, true, false, true, false, true)
    val convertToFlattern = flatlines.flatten
    val flatMapConversion = convertToFlattern.map(x => x % 2 == 0)
    println("*********" + flatMapConversion) //List(false, true, false, true, false, true)


    val mapLines = Map(0 -> "Hi", 2 -> "Nitish", 3 -> "how", 4 -> "are", 5 -> "you", 6 -> "!!")
    val computationOnMaplines =
      mapLines.
        mapValues(_.toList.map(_ * 2))
    println(computationOnMaplines)
  }

  //  << IMP >> //



  object
  Filter extends App {
    val listArray = List(1,2,3,4,5)
    val evenNos = listArray.filter(_ % 2 == 0 )
    println(evenNos) //List(2, 4)

    val evenNosWithMap = listArray.map(_ % 2 == 0)
    println(evenNosWithMap) //List(false, true, false, true, false)
  }

  /*

  val records = lines.map(_.split("\t"))
    val filtered = records.filter(rec => rec(1)!="7369" && rec(2)!="SMITH")
    val tuples = filtered.map(rec => (rec(0).toInt, rec(1).toInt))
    val maxTemps = tuples.reduceByKey((a,b) => Math.max(a,b))
    maxTemps.foreach(println(_))
    Thread.sleep(1000000)
   */


}
