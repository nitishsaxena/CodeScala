package Chapter1

object ScalaImpFacts extends App {
    println("Object with extending to App")
    withoutApp.main(Array("Nitish","Saxena","Vaah","Bhai","Vaah"))

}
object withoutApp {
  def main (args : Array [String] ): Unit ={
    println("Object without extending to App")
    println(args.length)
    for (i <- 0 to args.length-1){
      print (args(i) + " ,")
    }
  }
}


object Operations extends App {
  var x: Int = 10
  var y: Int = 11
  if(!(x==y)) println("true") else println("false")

  var multiplication = 10
  multiplication*=2
  println(multiplication)

  val returnvalue = true
  val returnValueContioned = {
    if (returnvalue) println ("@@ True is executing@@") else println("@@ False is executing @@")
  }

  println( if ( returnvalue )
        println(" @@ True @@ ")
    else
        print(" @@ False @@ "))
}
