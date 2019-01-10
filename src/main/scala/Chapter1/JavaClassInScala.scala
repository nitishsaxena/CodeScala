package Chapter1

import java.io.File

class JavaClassInScala {
   def main(args : Array[String]): Unit ={

     val readCSV = new File("src\\main\\resources\\emp_data.csv")
     print(readCSV)


   }
}
