public class Main // LetterRemoverRunner
{
  
    public static void main( String args[] )
    {
        System.out.println("LetterRemoverRunner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 8 - Set 1 Lab 4  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        

        String s = "I am Sam I am";
        char letterToRemove = 'a';
                
        System.out.println(s + " - letter to remove " + letterToRemove);
        System.out.println(LetterRemover.removeLetters(s,letterToRemove));  
        System.out.println();
        System.out.println();
                           
        s = "ssssssssxssssesssssesss";
        letterToRemove = 's';
        System.out.println(s + " - letter to remove " + letterToRemove);
        System.out.println(LetterRemover.removeLetters(s,letterToRemove));  
        System.out.println();
        System.out.println();

              s = "qwertyqwertyqwerty";
        letterToRemove = 'a';
        System.out.println(s + " - letter to remove " + letterToRemove);
        System.out.println(LetterRemover.removeLetters(s,letterToRemove));  
        System.out.println();
        System.out.println();

      
              s = "abababababa";
        letterToRemove = 'b';
        System.out.println(s + " - letter to remove " + letterToRemove);
        System.out.println(LetterRemover.removeLetters(s,letterToRemove));  
        System.out.println();
        System.out.println();

            
              s = "abaababababa";
        letterToRemove = 'x';
        System.out.println(s + " - letter to remove " + letterToRemove);
        System.out.println(LetterRemover.removeLetters(s,letterToRemove));  
        System.out.println();
        System.out.println();
        
        
                           
        // add more test cases  
        
        
        
    }
    
}

public class LetterRemover
{
  
    public static String removeLetters( String s, char rem )
    {
        // remove all letters from cleaned that are == rem
        String cleaned = s;
        
        // use a while loop
        
        // get the 1st occurrence of rem
        int pos = cleaned.indexOf(rem);
        
        
        while (pos >= 0) // while pos >= 0 you need to clean it!
        {

          
            // clean it!  (use substring to grab the 2 parts of cleaned)
            // so grab the left part and grab the right part omitting
            // the letter in the pos position
            // Example:  
            // cleaned = "Hello everybody"
            //           rem = "e"
            //           so pos would be 1
            // cleaned = "H" + "llo everybody"
            // so cleaned = clean.substring(?,?) + cleaned.substring(?); 
            // cleaned = ?????

          cleaned = cleaned.substring(0,pos) + cleaned.substring(pos+1);
          
            // now see if there is another occurrence of rem
            // look at how we did it above
            // pos = ??????
            pos = cleaned.indexOf(rem);
        }
        
        return cleaned;
    } // end of method 
    
} // end of class LetterRemover
