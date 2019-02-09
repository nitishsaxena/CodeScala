package ScalaExcercise

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object SalesTSV extends App
    //case class Data (empno:String, ename:String, designation:String, manager:String, hire_date:String, sal:String , deptno:String)
{
  val sparkConf = new SparkConf().setMaster("local[*]").setAppName("sales.tsv").set("spark.driver.host", "localhost")
  val sparkContext = new SparkContext(sparkConf)

  // Reading data from external source.

  val sqlContext = new SQLContext(sparkContext)
  import sqlContext.implicits._
  val extSourceRDD = sparkContext.textFile("src\\main\\resources\\a.tsv")


  val RDD = extSourceRDD.map {
     line =>
       val col = line.split(",")
     Data(col(0),col(1),col(2),col(3),col(4),col(5),col(6))
  }

  //RDD.toDF(ename).show()
  Thread.sleep(10000)
}
