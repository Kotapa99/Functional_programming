object Test {
   def main(args: Array[String]) {
        println( "Fahrenheit Value : " + fahrenheit(35) );
   }
   def fahrenheit( a:Double ) : Double = {

      return a*1.8+32
   }
}