package Chapter1

  /**************************************************************************************************************************************/

  // ADVANCED FUNCTIONAL PROGRAMMING //

  //Below is the program which we can do very easy in JAVA -- by using loops  but we have to make sure everything should be handle by FUNCTIONS


  // 1 @@

  object AdvancedFunctions extends App{
    def functionFirst( aString:String , n:Int): String = {

      if (n == 1) aString else aString + " " + functionFirst(aString , n-1)
    }

    println(functionFirst("Nitish", 10))
  }


  /**************************************************************************************************************************************/

// IMP : WHEN YOU WANT LOOPS THEN USE RECURSION :)

  // 2  @@ functions with side effects @@
object functionsWithSideEffects extends App{
    def functionsWithSideEfects(str:String, x: Int ): String = {
      if (x == 1) "Nitish" else str + " " + functionsWithSideEfects("Saxena", x-1 )

    }
    println(functionsWithSideEfects("Nitish",2 ))
  }


  /**************************************************************************************************************************************/

// 3 - Fibbonaci Series --


  //0 1 1 2 3 5 8

  object fibonnaciSeries extends App{

    def fibonnaciFunction(n : Int): Int = {
      if (n <=2 ) 1 else fibonnaciFunction(n-1) + fibonnaciFunction(n-2)
    }
    println(fibonnaciFunction(8))

    /**************************************************************************************************************************************/
    def isPrime(n:Int): Boolean = {
      def isPrimeUntil(t: Int): Boolean =
        if (t <= 1) true else n % t != 0 && isPrimeUntil(t - 1)

            isPrimeUntil(n / 2)
     }
            println(isPrime(1000))
            println(isPrime(2003))
            println(isPrime(4173))
    /**************************************************************************************************************************************/
}
/*
*
* a = 0
* b = 1
*
* sum = a + b
* a = b
* b = sum
*
* */


  /**************************************************************************************************************************************/

































