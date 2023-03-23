// Lab Chapter 15 Array References, Lab 3
// 3) Main.java and WordSort.java
      
// FINISH ME
// Name: Your full name goes here

public class Main // WordSortRunner
{
    
    public static void main(String args[])
    {
       System.out.println("WordSortRunner");
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line

       // FINISH ME
       System.out.println("Chapter 15 - Set 1 Lab 3  Written by Justin Naicker");
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line
        
       
       WordSort words = new WordSort("house book cat apple dog");       
       System.out.println(words); // calls the toString() method
       System.out.println(); // prints a blank line
       
       words.setList("hat bat cat at dat mat");       
       System.out.println(words); // calls the toString() method
       System.out.println(); // prints a blank line
       
       words.setList("Hat bat Cat at Dat mat");       
       System.out.println(words); // calls the toString() method
       System.out.println(); // prints a blank line
       
       
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line
       
    } // end of method main
    
} // end of class Main



/*
WordSortRunner


Chapter 15 - Set 1 Lab 3  Written by xxxxx xxxxx


apple, book, cat, dog, house

at, bat, cat, dat, hat, mat

Cat, Dat, Hat, at, bat, mat

*/

// Lab Chapter 15 Array References, Lab 3
// 3) Main.java and WordSort.java
      
// FINISH ME
// Name: Your full name goes here

import java.util.Arrays;

public class WordSort
{
    // instance variable
    private String[] wordRay;

    
    // init constructor
    // It has the same name as the class
    // and NO return type.
    // receives a String with all the words seperated by a space
    public WordSort(String line)
    {
        // Remember that a constructor needs to set the
        // values of our instance variables.
        // This class only has one variable but it 
        // refers to an array of String objects.
        
        // call the setList() method and pass it line
        setList(line);
        
    }

    
    public void setList(String line)
    {
        // the split() method creates an array for you
        // with all of the words
        wordRay = line.split(" ");
        
        // call the sort() method below

        sort();
        
    }

    
    // moves words around so that they are in alphabetical order
    public void sort()
    {
         // use Arrays.sort() and pass it wordRay
         // This will order the array so that it is
         // in alphabetical order.
         // Notice that we are sending to the method
         // the memory address of our wordRay so that
         // it knows where our wordRay list is located.
         Arrays.sort(wordRay);
         
    }

    public String toString( )
    {
        String output = "";
        
        // join each word in the wordRay list to your output
        // you will need to loop through the list adding 
        // all the way
        // if it is the last element
        //     output += the word;  
        // else
        //     output += the word + ", "; 
        
        // loop through all the words in wordRay
        // add to your output variable 
        // wordRay[i]
        for (int i = 0; i < wordRay.length; i++)
        {
           if (i == wordRay.length - 1) // last element
               output += wordRay[i];  
           else
               output += wordRay[i] + ", ";
        }

        // think about what you should return
        return output; // fix me!!!!!
    }
    
} // end of class
          
