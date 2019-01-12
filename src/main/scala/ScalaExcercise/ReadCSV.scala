package ScalaExcercise

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object ReadCSV {
    case class Employee(empno:String, ename:String, designation:String, manager:String, hire_date:String, sal:String , deptno:String)
    def main(args : Array[String]): Unit = {
        val conf = new SparkConf().setAppName("Read CSV File").setMaster("yarn").set("deploy-mode","client");
        val sc = new SparkContext(conf)
        val sqlContext = new SQLContext(sc)
        import sqlContext.implicits._ /* Converting the scala objects into data frames. */
        val textRDD = sc.textFile("src\\main\\resources\\emp_data.csv")

        val empRdd = textRDD.map {
            line =>
                val col = line.split(",")
                println(line)
                Employee(col(0), col(1), col(2), col(3), col(4), col(5), col(6))
        }
        empRdd.toDF().show()

        val array = Array(1,22,3,4,3)
        val parallelize = sc.parallelize(array)
        println("*************************************")
        println(parallelize.collect())
        println("**********************************************")
        val readCSV1 = sc.textFile("src\\main\\resources\\csv\\emp_data.csv")
        println(readCSV1.take(2))

        val readCSV2 = sc.textFile("src\\main\\resources\\csv\\emp_data.csv")
        val lines = readCSV2.map(
                s => s.length
        )
        println(lines.collect())

        val a:Seq[Int] = Seq(1,2,3,4)
        println(a)

        Thread.sleep(10000)
/*
case class  – It has been created for modeling data. You can say for mapping data with the schema.
textFile    – Function to load the dataset into RDD as a text file format
map         - Function is used to map data set value with created case class Employee.
toDF        – Function is used to transform RDD to Data Frame. */
    }
}
