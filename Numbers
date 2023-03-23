public class Main // NumbersRunner
{
  
    public static void main ( String[] args )
    {
        System.out.println("NumbersRunner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 9 - Set 1 Lab 2  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // list will refer to what we call an
        // array!  You will not be tested over 
        // this (until the next chapter 14).
        int [] list = {24, 7, 100, 113, 2, 4, 11, 121};
        
        for (int i=0; i < list.length; i++)
        {
          // gets the number
          // in the i position of list          
          // you are not responsible for this yet
          int num = list[i]; 
   
          // Call your isPrime() method in the Numbers class and pass it num.
          // Since getFactors() is static, we can use the name
          // of the class to call it.          
          if (Numbers.isPrime(num))
            System.out.println(num + " is prime.");
          else 
            System.out.println(num + " is NOT prime.");
          
          // Call your getFactors() method in the Numbers class and pass it num.
          // Since getFactors() is static, we can use the name
          // of the class to call it.
          System.out.println("The factors are: " + Numbers.getFactors(num));

          // Call your numberOfFactors() method in the Numbers class and pass it num.
          // Since numberOfFactors() is static, we can use the name
          // of the class to call it.
          System.out.println("Number of factors: " + Numbers.numberOfFactors(num));
            
          // Call your hasExactly3Factors() method in the Numbers class and pass it num.
          // Since hasExactly3Factors() is static, we can use the name
          // of the class to call it.
          System.out.println("Has exactly 3 factors: " + Numbers.hasExactly3Factors(num));
          
          System.out.println();
        } 
      
      
    } // end of method main
    
} // end of class



public class Numbers
{
    // return an int that holds the number of 
    // factors of num.
    // Example:
    // num = 14
    // return 4 since 1, 2, 7, and 14 are factors
    public static int numberOfFactors(int num)
    {
       // create an int variable called count and
       // set it to 0 since we have not 
       // found any factors yet.
      
       int count = 0;
       
       // write a for loop to loop through all 
       // possible factors (1 through num)
       for (int d = 1; d <= num; d++)
       {
          // see if num divided by d is 0
          // use your mod operator
          if (num % d == 0)
          {
             // add 1 to your count since
             // you found a factor of num
             count++;
          }
       } // end of for loop
       
       return count;
    } // end of numberOfFactors
    
    
    // return a String that contains all of 
    // the factors of num
    // Example:
    // num is 14
    // return "1 2 7 14"
    public static String getFactors( int num )
    {
      // create a String variable 
      // called factors and set it to ""
      String factors = "";
      
      // now loop through all the possible factors
      // of num and join on to the end of factors
      // each factor and a space.
      
      // we will use d for our divisor
      for (int d = 1; d <= num; d++)
      {
         // see if d is a factor of num
         // Use %
         if (num % d == 0)
         {
            // add d plus a " " to your factors String
            factors = factors + d + " ";
         }
      }
      
      // this will remove the final space
      factors = factors.trim();
      
      // now return the value of factors
      return factors;    
    } // end of method getFactors
    
    
    public static boolean isPrime( int num )
    {
        // a prime number is a positive number that
        // has exactly 2 factors, 1 and itself.
        // so 1 is NOT prime
        
        // so first, if num is less than or equal to 1, return false
      
      
        // now call numberOfFactors(num) and
        // see if it is equal to 2
        // and if so, return true

        if (numberOfFactors(num) == 2)
        {
           return true;
        }
      
        
        // since it is not prime, return false
        return false;
    } // end of method main
 
    public static boolean hasExactly3Factors( int num )
    {
      
        // if num has exactly 3 factors 
        // return true
        // otherwise return false
        // CAll a method from above to find this
     
        if ( numberOfFactors(num) == 3)
        {
           return true;
        }
      
        
        // since it does not have exactly 3 factors
        // return false
        return false;
    } // end of method main

} // end of class Numbers

  
