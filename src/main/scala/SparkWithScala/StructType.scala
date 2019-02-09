package SparkWithScala

import org.apache.spark.sql.types.StructType

object StructType extends App {

  // StructType ==  StructType is a built-in data type that is a collection of StructFields. StructType is used to define a schema or its part.
  // Imp: You can extend the type system and create your own user-defined types (UDTs).
  // Link: https://jaceklaskowski.gitbooks.io/mastering-spark-sql/spark-sql-DataType.html

  // Struct Type ==== Collection of Struct Fields. Struct Type is to define a schema or it's part. You can compare two StructType and check whether they are equal or Not.

  val structType1 = new StructType().add("a","int",true).add("b","string",true)
  val structType2 = new StructType().add("a","IntegerType",false).add("b","StringType",false)


  println(structType1 == structType2) // Gives Error. Don't know Why.
}