
public class Main // SocialRunner
{

 // When you click the run button, it compiles (translates)
 // your code into byte code (like machine code), and then
 // starts running the code in method main.
 public static void main( String args[] )
 {
    System.out.println("Social");
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line

    // FINISH ME
    String info = "Chapter 5 - Set 1 Lab 4  Written by Justin Naicker";
    System.out.println(info);
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line
    
    
    // FINISH ME
    // create a new Social object (no arguments)
    // s will hold the memory address of the Social object
    // s is a reference variable, since it refers to the object
    // Social s means to create a variable called s that can refer
    // to a Social object.  s holds the memory address of the 
    // object. 
    // Social s = ??? ????();  

   Social s = new Social();
    
    
    // Is it a valid ss#?
    System.out.println(  s.go(  "463-44-5678")    );
    System.out.println(  s.go(  "46-144-5678")    );
    System.out.println(  s.go(  "111-44-5678")    );
    System.out.println(  s.go(  "463044-5678")    );
    System.out.println(  s.go(  "463-99-8888")    );
    System.out.println(  s.go(  "123-11-5323")    );
    System.out.println(  s.go(  "463-4-55678")    );
    System.out.println(  s.go(  "46314415678")    );
    
        
    
    if (info.indexOf("xxxxx xxxxx") >= 0 )
    {
      System.out.println("ERROR ERROR ERROR  What's your name?");
    }
 }
 
}

public class Social
{

  // Given a string, check to see if the string is a valid 
  // social security number.  For this program, social security 
  // numbers have a hyphen – at position 3 and at position 6.  
  // Return the last 4 numbers if the social security number is valid.  
  // Return bad if the social security number is invalid.
  
  public static String go( String a )
  {
       // FINISH ME
       // Is String a a valid ss#
       // First check to make sure it has the correct length
       // Next use indexOf and check the position of the '-' characters
       // There must be a dash in position 3 (use indexOf)
       //     if not return "bad"
       // Use substring to grab the String after the dash
       // There must be a dash in position 2 of the substring
       //     if not return "bad"

    String j = a.substring(4, a.length());

    if (a.indexOf("-") == 3 && j.indexOf("-") == 2)
    {
      return a.substring(7, 11);
    }
       else
    {
      return "bad";
    }

  } // end of method go
}
   
