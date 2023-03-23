// Lab Chapter 5 Set 1, Lab 3
// Main.java and FirstLastVowel.java

// FINISH ME
// Name: Jusin Naicker



public class Main // VowelsRunner
{
 public static void main( String args[] )
 {
    System.out.println("Vowels");
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line

    // FINISH ME
    System.out.println("Chapter 5 - Set 1 Lab 3  Written by Justin Naicker");
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line


    // FINISH ME
    // create a FirstLastVowel() object
     FirstLastVowel s = new FirstLastVowel();
  
  
    System.out.println(  s.go(  "dog#cat#pigaplus")    );
    System.out.println(  s.go(  "pigs#apluscompsci#food")    );
    System.out.println(  s.go(  "##catgiraffeapluscompsci")    );
    System.out.println(  s.go(  "apluscatsanddogsaplus###")    );
    System.out.println(  s.go(  "##")    );
    System.out.println(  s.go(  "aplusdog#13337#pigaplusprogram")    );
    System.out.println(  s.go(  "code#H00P#code1234")    );
    System.out.println(  s.go(  "##wowgira77##eplus")    );
    System.out.println(  s.go(  "catsandaplusdogsaplus###")    );
    System.out.println(  s.go(  "7")    );
    System.out.println(  s.go(  "a")    );
    System.out.println(  s.go(  "E")    );
    System.out.println(  s.go(  "9AEIOUaeiou8"));
    
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line

 }
}


// Lab Chapter 5 Set 1, Lab 3
// Main.java and FirstLastVowel.java

// FINISH ME
// Name: Justin Naicker



public class FirstLastVowel
{
  
  
   // Return "yes" if the first letter OR last letter of the string is a vowel 
   // [ aeiouAEIOU ].  
   // else return "no"    
   public static String go( String a )
   {
    
       
     
     int i = a.length()-1;

     if (a.charAt(0) == 'a' || a.charAt(i) == 'a' || a.charAt(0) == 'A' || a.charAt(i) == 'A' || a.charAt(0) == 'e' || a.charAt(i) == 'e' || a.charAt(0) == 'E' || a.charAt(i) == 'E'  || a.charAt(0) == 'i' || a.charAt(i) == 'i' || a.charAt(0) == 'I' || a.charAt(i) == 'I' || a.charAt(0) == 'o' || a.charAt(i) == 'o' || a.charAt(0) == 'O' || a.charAt(i) == 'O'  || a.charAt(0) == 'u' || a.charAt(i) == 'u' || a.charAt(0) == 'U' || a.charAt(i) == 'U')
     {
       return "yes";
     }
     else
     {
       return "no";
     }   
   
   }
} // end of class FirstLastVowel

