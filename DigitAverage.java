public class Main // DigitAverageRunner
{
    public static void main( String args[] )
    {
   
        System.out.println("DigitAverageRunner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 8 - Set 1 Lab 1  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212, 222222 };
  
        DigitAverage s = new DigitAverage();      // Chap 8  Set 1  Lab 1

        // val will receive each number from the cases array (list)
        // for each val it will go through and execute the body of the loop
        for( int val : cases )
        {
            // we are passing or sending the value of val each time
            System.out.println( s.go( val ) );
        }
        
    } // end of method main
    
} // end of class Main



public class DigitAverage
{
    public static int countDigits( int number )
    {
        // use a while loop 
        // DO NOT CONVERT IT TO A STRING
        
        // create a count variable to keep track of how
        // many digits that you have found, and set it to 0.
        // int ????? = 0;
        int count = 0;
        // Create a while loop
        // while the number is greater than 0
        while (number > 0)
        {
            // update your number by dividing your number by 10
            // this will throw away the right most digit
            // For example:  234 / 10 is 23
            number = number / 10;
            
            // now add 1 to your count
            count = count + 1;           
        }
        
      
        return count; // fix me by returning your count
    }

    public static int sumDigits( int number )
    {
        // use the same structure as above
        
        // to get the right digit use see the example
        // Example:  237 % 10 is 7
        
        
        // declare a variable called sum of type int
        // and set it to 0
        
        int sum = 0;
      
        // Create a while loop
        // while the number is greater than 0?
        while (number > 0)
        {
            // get the right digit
            int rightDigit = number % 10;
            
            
            // add the right digit to your sum
            sum = sum + rightDigit;
            
            
            // update your number by dividing your number by 10
            // this will throw away the right most digit
            // For example:  234 / 10 is 23
            number = number / 10;
            
       
        }
        
        
        return sum; // return your sum
    }

    // method go must call countDigits and sumDigits
    // to receive full credit
    public static double go( int number )
    {
        // find the average - call sumDigits(number) / countDigits(number)
        // convert either the numerator or denominator
        // to a double (use a typecast)

  return ((double)sumDigits(number)/countDigits(number));
 
    }
    
    
}  // end of class public class DigitAverage
