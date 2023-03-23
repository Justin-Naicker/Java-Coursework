// Lab Chapter 15 Array References, Lab 4
// 4) Main.java and WordSortTwo.java and a data file
//    wordsorttwo.dat (you will need to create a file
//    with this name and copy the data to it.  The data
//    is shown below right after the sample output.
      
// FINISH ME
// Name: Your full name goes here

       

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main // WordSortTwoRunner
{
    public static void main( String args[] ) throws IOException
    {
       System.out.println("WordSortTwoRunner");
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line

       // FINISH ME
       System.out.println("Chapter 15 - Set 1 Lab 4  Written by Justin Naicker");
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line
        
        // reads in a file and sends it to the Scanner object
        Scanner file = new Scanner(new File("wordsorttwo.dat"));
        
        int size = file.nextInt(); // reads in first line (# of sentences)
        file.nextLine(); // moves file cursor to the next line
        
        for(int i = 0; i < size; i++)
        {
            String sentence = file.nextLine(); // reads in the sentence
            System.out.println(sentence);
            
            // instantiate a new WordSortTwo object
            WordSortTwo words = new WordSortTwo(sentence);
            System.out.println(words);  // calls toString() method
            words.resetWords(sentence);
            System.out.println(words);  // calls toString() method            
            System.out.println();
        }
        
    } // end of main method
    
    
} // end of class

/*

WordSortTwoRunner


Chapter 15 - Set 1 Lab 4  Written by xxxxx xxxxx


WHAT TIME WAS IT?
IT?, TIME, WAS, WHAT
IT?, TIME, WAS, WHAT

THE BIG BROWN FOX IS LAZY!
BIG, BROWN, FOX, IS, LAZY!, THE
BIG, BROWN, FOX, IS, LAZY!, THE

I AM SAM SAM I AM SAM IS BIG
AM, AM, BIG, I, I, IS, SAM, SAM, SAM
AM, AM, BIG, I, I, IS, SAM, SAM, SAM

1234 ONE TWO 5678
1234, 5678, ONE, TWO
1234, 5678, ONE, TWO

a b i j 1 2 3
1, 2, 3, a, b, i, j
1, 2, 3, a, b, i, j



Here is the data for the file called wordsorttwo.dat
5
WHAT TIME WAS IT?
THE BIG BROWN FOX IS LAZY!
I AM SAM SAM I AM SAM IS BIG
1234 ONE TWO 5678
a b i j 1 2 3

*/

// Lab Chapter 15 Array References, Lab 4
// 4) Main.java and WordSortTwo.java 
      
// FINISH ME
// Name: Your full name goes here

public class WordSortTwo
{
    // instance variable
    private String[] wordRay;

    
    // init constructor
    public WordSortTwo(String sentence)
    {
        // creates an array of the words in sentence
        wordRay = sentence.split(" ");
        
        // sort the array of words alphabetically
        bubbleSort();
        
    }

    
    public void resetWords(String sentence)
    {
        // creates an array of the words in sentence
        wordRay = sentence.split(" ");
        
        // sorts the array of words alphabetically
        selectionSort();
    }
    
    
    public void bubbleSort()
    {
        // use your own sort
        // Don't use Arrays.sort(wordRay);
      
        // you will need an outer loop to make wordRay.length passes
        for (int p=1; p < wordRay.length; p++)
        {
            // you will need an inner loop that will
            // compare each i and i+1 element to see if they are out of order (OOO)
            for (int i=0; i < wordRay.length-1; i++)
            {
                 // check to see if the i and i+1 elements are out of order (OOO)
                 // use the compareTo() method to see if
                 // wordRay[i].compareTo(wordRay[i+1]) is greater than 0
                 // and if so, swap the i and i+1 elements
                 if (wordRay[i].compareTo(wordRay[i+1]) > 0) // use greater than  OOO
                 {
                      // HERE is some general info
                      // swap the ith and i+1 elements
                      // use a temporary variable to help with your swap
                   
                      // START HERE with your code
                      // STEP 1: copy the i element to the temp box
                      String temp = wordRay[i];
                      
                      // copy the i+1 element to the i box
                      wordRay[i] = wordRay[i+1];
                      
                      // copy the temp element to the i+1 box
                      wordRay[i+1] = temp;
                   
                 }  // end of if
              
            } // end of for i loop to loop through the words
        } // end of outer for loop for the number of passes
    }

    public void selectionSort()
    {
        // write a selection sort to sort the words
        // GOOGLE IT!
         int n = wordRay.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (wordRay[j].compareTo(wordRay[min_idx]) < 0)
                    min_idx = j;
 
            
              String temp = wordRay[min_idx];
              wordRay[min_idx] = wordRay[i];
              wordRay[i] = temp;
          
        }
        
      
    }
    
    
    
    public String toString()
    {
        String output="";

        // join each word in the wordRay list to your output
        // you will need to loop through the list adding all the way
        // if it is the last element
        //     output += the word; // no ", " 
        // else
        //     output += the word + ", "; 

        // loop through all of the wordRay objects
        for (int i = 0; i < wordRay.length; i++)
        {
           if (i == wordRay.length - 1) // last index
                output += wordRay[i]; // no ", " 
           else
             output += wordRay[i] + ", ";
        }
        
        return output; // fix me!!!! by returning your output
    }
    
}  // end of WordSortTwo.java


//.dat file
5
WHAT TIME WAS IT?
THE BIG BROWN FOX IS LAZY!
I AM SAM SAM I AM SAM IS BIG
1234 ONE TWO 5678
a b i j 1 2 3 
