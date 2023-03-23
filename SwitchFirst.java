class Main {
  public static void main(String[] args) {

    System.out.println("Switch First");
        System.out.println();
        System.out.println(); 


        System.out.println("Chapter 4 - Set 1 Lab 4  Written by Justin Naicker");
        System.out.println(); 
        System.out.println(); 


        SwitchFirst s = new SwitchFirst();  // s receives the memory address of the object  

        System.out.println( s.go( "dog", "cats" ) ) ;  // prints cog
        System.out.println( s.go( "aplus", "pigs" ) ) ; // prints pplus
        System.out.println( s.go( "catgiraffe", "apluscompsci" ) ) ;
        System.out.println( s.go( "ap", "aplus" ) ) ;
        System.out.println( s.go( "pluscat", "dogsaplus" ) ) ;
        System.out.println( s.go( "#", "#" ) ) ;
        System.out.println( s.go( "aplusdog#13337#", "pigaplusprogram" ) ) ;
        System.out.println( s.go( "code", "code1234" ) ) ;
        System.out.println( s.go( "wow", "aplus" ) ) ;
        System.out.println( s.go( "catsand" , "aplusdogsaplus" ) ) ;
        System.out.println( s.go( "7", "77777" ) ) ;        
    
  }
}

public class SwitchFirst
{
   public static String go( String a, String b )
   {
        // Return a new string that has the first letter of the 
        // second string b plus all of the letters from the first string a
        // minus the first letter.
        // Useful String methods:
        // charAt(index)   returns the char at the index position
        // substring(start, stop)  takes letters from start to stop-1
        // substring(start)  takes all chars from start to end
        //
        // Examples: 
        // String s = "catalog";
        // String s2 = "" + s.charAt(2); // s2 will now be "t";
        // String s3 = s.substring(4);   // s3 will now be "log"
        // String s4 = s.substring(1,3); // s4 will now be "at"
        
        String result = ""; 
        
        return b.substring(0,1) + a.substring(1, a.length());
    }
}
