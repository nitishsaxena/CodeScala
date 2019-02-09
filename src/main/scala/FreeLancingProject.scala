import java.io.FileInputStream
import java.util.{Properties, Scanner}

object FreeLancingProject extends App {

  main()

  def firstArgument(): Unit = {
    def scanner = new Scanner(System.in)

    println("Provide the properties File")
    args(0) = scanner.nextLine()
  }


  def main(): Unit = {
    // firstArgument()
    val properties = new Properties()
    val propertiesInputFileStream = new FileInputStream("C:\\Users\\nitishsa\\IdeaProjects\\SparkwithScalaDemo\\src\\main\\resources\\sample.txt")
    properties.load(propertiesInputFileStream)
    println(properties.getProperty("firstName"))
    println(properties.getProperty("lastName"))
    println(properties.getProperty("companyName"))

 }
}