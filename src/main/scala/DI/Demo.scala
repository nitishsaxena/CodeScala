package DI

import java.io.File
import java.util.Scanner

import scala.io.Source

object Demo extends App {
//1
    val scanner = new Scanner(System.in)
    println("Enter App name!! For Now you can give the path.")
    scanner.next()
    println("From which date you want the data!!")
    scanner.nextInt()
    println("Up to which date you want the data!!")
    scanner.nextInt()

    /* -- File Reader Function -- */
//2
    val appDirectoryName = new File("C:\\Users\\nitishsa\\IdeaProjects\\SparkwithScalaDemo\\src\\main\\resources\\csv\\DI")

//3
    appendAppPathAndFileName()

//4
    def appendAppPathAndFileName(): Unit ={
        /* -- Return the list of files which is present in appDirectoryName --*/
//5
        /* -- Call --*/
        //iteratingInDirectory(appDirectoryName).foreach(println)
        iteratingInDirectory(appDirectoryName)
          .foreach(
              iteratingInFile(_)
          )
    }
//6
    def iteratingInDirectory(dir: File): List[String] = {
        dir.listFiles.filter(_.isFile)
          .filter(_.getName.endsWith("txt"))
          .map(_.getPath).toList
    }

    /* -- pass the file path --*/
    def iteratingInFile(fileName: String): Unit ={
        for (line <- Source.fromFile(fileName).getLines) {
            println(line)
        }
   }
}




