package SparkAbstractions

import java.util.Calendar

import org.apache.spark.{SparkConf, SparkContext}

object RDDExercise extends App {

  //RDD (Resilient Distributed Dataset). The main approach to work with unstructured data. Pretty similar to a distributed collection that is not always typed. Read more at https://indatalabs.com/blog/data-engineering/convert-spark-rdd-to-dataframe-dataset#WmP9o1AYJcK3C4ZT.99

  val sparkconf = new SparkConf().setAppName("Practice").setMaster("local[*]")
  val sparkcontext = new SparkContext(sparkconf)
// when you provide the input data to RDD
  val listArray = List[Any](1,2,3,"Nitish","Saxena")
  val firstRDD = sparkcontext.parallelize(listArray)
  // Print RDD

  firstRDD.collect().foreach(
    print
  )

  // Below code is Just to check the power of for each block --
  firstRDD.collect().foreach{
    x =>
    if (firstRDD.count() == x) println("******* main *********")
      else println(" ***** else *******")
  }

  // when you load the data from external Source --
//  val extSourceRDD = sparkcontext.textFile("src\\main\\resources\\emp_data.csv")
//  extSourceRDD.collect.foreach(print)

  // collect - is used to collect all data sets from executors as an array to the driver program.

  val dummyList = List[Any](1,2,3,"Array",'a')
  val dummyRDD = sparkcontext.parallelize(dummyList)

  //dummyRDD.saveAsTextFile("src\\resources\\csv\\rdd.txt")

  //Below will send all the details of spark context with all information..
  sparkcontext.getConf.getAll.foreach(print)
  //  O/p -- (spark.driver.port,57278)(spark.master,local[*])(spark.executor.id,driver)(spark.app.name,Practice)(spark.driver.host,localhost)(spark.app.id,local-1547655266804)


println("*****************")
  /*
  spark.sparkContext._conf.getAll()
Update the default configurations

conf = spark.sparkContext._conf.setAll([('spark.executor.memory', '4g'), ('spark.app.name', 'Spark Updated Conf'), ('spark.executor.cores', '4'), ('spark.cores.max', '4'), ('spark.driver.memory','4g')])
Stop the current Spark Session

spark.sparkContext.stop()
Create a Spark Session

Required in Spark Sql.

spark = SparkSession.builder.config(conf=conf).getOrCreate()
 */

                                          // Important //
  val dummyfirstRDD = sparkcontext.parallelize(List(1,2,3,4,"Nitish"))
  dummyfirstRDD.collect().filter{
    case _:String => false
    case _:Int => true
  }.foreach(print)


// Read CSV and store data in RDD and then print the data of RDD.

  val readCSVRDD = sparkcontext.textFile("C:\\Users\\nitishsa\\IdeaProjects\\SparkwithScalaDemo\\src\\main\\resources\\csv\\a.csv")
  readCSVRDD.
    collect().foreach(println)/**************************************************************************************************************************************************/

                                // IMP:

  // Filter vs Map functions -- Filter execution time < Map execution time

  // If we subtract #1 & #2 then we get the time, in which rdd was processed.

  val t0 = Calendar.getInstance().getTimeInMillis // #1

  dummyfirstRDD.collect().filter{
    case _:String => false
    case _:Int => true
  }.foreach(print)

  println( t0 - Calendar.getInstance.getTimeInMillis) // #2

  // In python - we have time(), which gives the current time.

  println("**********************")
  val listArray12 = List(1,2,34,5,22,67,8,9)
  val someRDD = sparkcontext.parallelize(listArray12)
  val someRDD1 = sparkcontext.parallelize(1 to 100,10)
  println(someRDD.partitions.size)
  println(someRDD1.partitions.size)


  println("*****************************************************************************************************")

  val sparkRDDD = sparkcontext.textFile("C:\\Users\\nitishsa\\IdeaProjects\\SparkwithScalaDemo\\src\\main\\resources\\csv\\a.csv")

 val text =  sparkRDDD.flatMap{
     _.split(",")
}

  text.collect().foreach(print)

  println("*****************************************************************************************************")


  Thread.sleep(10000000)

}

