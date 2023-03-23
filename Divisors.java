public class Main // DivisorsRunner
{
  
    public static void main( String args[] )
    {
        System.out.println("DivisorsRunner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 8 - Set 1 Lab 3  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

      

        // Generate all of the divisors for any given number.
        // Do not count the number itself.  
        // 6 has the divisors 1 2 3.  
        // Use mod ( % ) to find the divisors.        
        
        System.out.println("10 has the divisors " + Divisors.getDivisors(10) + ".");
        System.out.println("45 has the divisors " + Divisors.getDivisors(45) + ".");
        System.out.println("14 has the divisors " + Divisors.getDivisors(14) + ".");
        System.out.println("1024 has the divisors " + Divisors.getDivisors(1024) + ".");
        System.out.println("1245 has the divisors " + Divisors.getDivisors(1245) + ".");
        System.out.println("33 has the divisors " + Divisors.getDivisors(33) + ".");
        System.out.println("65535 has the divisors " + Divisors.getDivisors(65535) + ".");
      

        // add more test cases        

/*
10
45
14
1024
1245
33
65535
*/
        
    }
    
}

class Divisors
{ 
    public static String getDivisors( int number )
    {
        // Generate all of the divisors for any given number,
        // but do not count the number itself.
        // Example: 6  returns "1 2 3"
        // Use mod ( % ) to find the divisors.
        
        // create a String variable called 
        // divisors and set it to "";        
        String divisors = "";
        
        
        // create an int variable called d and set it to 1
        // d will be 1,2,3,4,....,number/2
        // we will divide number over and over again by d
        int d = 1;
        
        
         while (d <= number/2)
         {
            // see if number is divisible by d
            // and if so, join it on to the end of the divisors plus add a " "
            
      if (number%d == 0)
      {
          divisors = divisors + d + " ";
      }
        
            
          d+= 1;
            // increment d by 1
         }
        
        // return the value of divisors
        return divisors; 
        
    } // end of method main
    
} // end of class Divisors
