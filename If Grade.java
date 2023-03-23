// Lab Chapter 6 Set 1, Lab 1
// Main.java and Grade.java

// FINISH ME
// Name: Your full name goes here

public class Main // GradeRunner
{
  
    public static void main( String args[] )
    {
        System.out.println("Grade Check");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 6 - Set 1 Lab 1  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

      Grade grade = new Grade();

      
      
        // FINISH ME
        // Since, getLetterGrade is a static method and is loaded into
        // RAM memory when you start the program, we can call it by
        // using the   name of the class.methodName(??)
        // The name of the class is Grade and the method is 
        // getLetterGrade( int numGrade )
        System.out.println("78 is a " + grade.getLetterGrade( 78 ) );      
        System.out.println("92 is a " + grade.getLetterGrade( 92 ) );
        System.out.println("31 is a " + grade.getLetterGrade( 31 ) );
        System.out.println("82 is a " + grade.getLetterGrade( 82 ) );      
        System.out.println("77 is a " + grade.getLetterGrade( 77 ) );
        System.out.println("73 is a " + grade.getLetterGrade( 73 ) );
        System.out.println("55 is a " + grade.getLetterGrade( 55 ) );      
        System.out.println("65 is a " + grade.getLetterGrade( 65 ) );
        
        // FINISH ME
        // ADD THE OTHER TEST CASES
                
    } // end of main method
 
} // end of class Main

public class Grade
{
    public static String getLetterGrade( int numGrade )
    {        
        String letGrade="";
        
        // FINISH ME
        // find the letter grade from the numGrade
        // use an if else if statement
        // if (numGrade GTE 90)
        //     letGrade = ???;
        // else if (??????)
        //     letGrade = ???;
        // etc.
        // GTE means Greater Than or Equal to (the math symbol)
        // A is GTE 90 
        // B is GTE 80 and Less Than 90  
        // C is GTE 75 and Less Than 80 
        // D is GTE 70 and Less Than 75 
        // F is Less Than 70 

        // find it here

      if (numGrade > 90)
      {
        return "A";
      }
      else if (numGrade > 80 && numGrade < 90)
      {
        return "B";
      }
      else if (numGrade > 75 && numGrade < 80)
      {
        return "C";
      }
      else if (numGrade > 70 && numGrade < 75)
      {
        return "D";
      }
      else if (numGrade < 70)
      {
        return "F";
      }
        
        
        return letGrade;
        
    } // end of method getLetterGrade( int numGrade )
}
