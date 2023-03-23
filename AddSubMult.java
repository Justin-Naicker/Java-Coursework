// Lab Chapter 5 Set 1, Lab 2
// Main.java and AddSubMult.java

// FINISH ME
// Name: Justin Naicker


public class Main // AddSubMultRunner
{
 public static void main( String args[] )
 {
    System.out.println("Add Sub Mult");
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line

    // FINISH ME
    String info = "Chapter 5 - Set 1 Lab 2  Written by Justin Naicker";
    System.out.println(info);
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line

   
    System.out.println( AddSubMult.check( 10, 20) );  
    System.out.println( AddSubMult.check( 20, 10) ); 
    System.out.println( AddSubMult.check( 20, 20) );
    System.out.println( AddSubMult.check( 10, 10) ); 
    System.out.println( AddSubMult.check( 0, 1) ); 
    System.out.println( AddSubMult.check( 1, 0 ) ); 
    System.out.println( AddSubMult.check( 3.1, 5.7) ); 
    System.out.println( AddSubMult.check( 5.2, 3.8 ) ); 
    System.out.println( AddSubMult.check( 5342, 323 ) ); 
    System.out.println();
    System.out.println();
    
    
    
    if (info.indexOf("xxxxx xxxxx") >= 0 )
    {
         System.out.println("ERROR ERROR ERROR  What's your name?");
    }
    
    
 }
}


// Lab Chapter 5 Set 1, Lab 2
// AddSubMultRunner.java and AddSubMult.java

// FINISH ME
// Name: Justin Naicker


public class AddSubMult
{
    // Write a method to check 2 parameters.  
    // If a is > b, return a - b.  If b is > a, return b - a.  
    // If a is equal to b, return a * b.
    public static double check( double a, double b )
    {
        if (a > b)
        {
          return a - b;
        }
      else if (b > a)
      {
        return b - a;
      }
      else if (a == b)
      {
        return a * b;
      }
      
        return 0;
    }
}

