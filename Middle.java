class Main {
  public static void main(String[] args) {
System.out.println("Middle Letter");
        System.out.println(); 
        System.out.println(); 

      Middle s = new Middle();
    
        System.out.println("Chapter 4 - Set 1 Lab 3  Written by Justin Naicker");
        System.out.println(); 
        System.out.println();  

        System.out.println( s.go( "dog" ) ) ;
        System.out.println( s.go( "aplus" ) ) ;
        System.out.println( s.go( "catgiraffe" ) ) ;
        System.out.println( s.go( "ap" ) ) ;
        System.out.println( s.go( "pluscat" ) ) ;
        System.out.println( s.go( "aplusdog#13337#" ) ) ;
        System.out.println( s.go( "code" ) ) ;
        System.out.println( s.go( "wow" ) ) ;
        System.out.println( s.go( "catsand" ) ) ;   
    }
}

public class Middle
{

   public static String go( String a )
    {
        
        return a.substring( a.length()/2, (a.length()/2)+1);
    }
}
