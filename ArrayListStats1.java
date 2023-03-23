import java.util.*; // for the ArrayList class

public class Main // ArrayListStats1Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayListStats1Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 16 - Set 1 Lab 1  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        // Create a new ArrayListStats1 object
        ArrayListStats1 arrayListStats = new ArrayListStats1();

        // Here you create the ArrayList of Integer objects
        ArrayList list = new ArrayList();
        
        // Now we add some elements
        list.add(90);  // or we could say list.add(new Integer(90));
        list.add(99); // or we could say list.add(new Integer(100));
        list.add(new Integer(3));
        list.add(90);
        list.add(100);
        
        arrayListStats.printArrayList( list );     
        System.out.println( "The sum is               " + arrayListStats.getTheSum( list ) );
        System.out.println( "The average is           " + arrayListStats.getTheAverage( list ) );
        System.out.println( "The sum smaller than " + list.get(0) + "   " + arrayListStats.getTheSumOfNumbersLessThanFirstNumber( list ) );
        System.out.println( "The sum smaller than " + list.get(list.size()-1) + "  " + arrayListStats.getTheSumOfNumbersLessThanLastNumber( list ) );
        System.out.println( "The first number repeats " + arrayListStats.firstNumberRepeats( list ) );
        System.out.println( "The last number repeats  " + arrayListStats.lastNumberRepeats( list ) );
               
    } // end of main method
    
} // end of class

/*
Chapter 16 - Set 1 Lab 1  Written by Justin Naicker


The list is 90 99 3 90 100 
The sum is               382
The average is           76.4
The sum smaller than 90   3
The sum smaller than 100  282
The first number repeats true
The last number repeats  false

*/


// Lab Chapter 16 ArrayList Set 1, Lab 1
// 1) Main.java and ArrayListStats1.java

// FINISH ME
// Name: Justin Naicker


// NOTE: An ArrayList is an object, however it does
//       have many methods of its own, unlike the array.
//       It can also grow in size.
//       
//       Here are some of the most used methods:
//       Suppose we have:
//           ArrayList list = new ArrayList();
//
//           add(some int) - adds an element at the end of the list
//           add(pos, int) - inserts an element at the position pos
//           size() - returns the number of elements in the list
//           isEmpty() - returns true if there are no elements, else false
//           get(pos) - return the address of the element
//           remove(pos) - removes the element at the pos position
//           set(pos, new element) - replaces the current element with a different element
//           clear() - removes all elements
//           
//           Here are some sample calls to methods.
//           Assume the list is initially empty (no elements).
//                
//           Examples:
//           list.isEmpty() // returns true
//
//           list.add(80);  // adds 80 to the list, 0 position
//           list.add(90);  // adds 90 to the list, 1 position
//           list.add(100); // adds 100 to the list, 2 position
//           (the list is now 80, 90, 100)
//           list.size() is now 3
//           list.isEmpty() // returns false
//
//           list.add(1, 95); // inserts 95 in the list at the 1 position
//           (the list is now 80, 95, 90, 100)
//           list.size() is now 4
//
//           list.get(0) - returns 80  
//           list.get(1) - returns 95
//
//           list.remove(1); //removes element in the 1 position
//           (the list is now 80, 90, 100)
//           list.size() is now 3
//           list.isEmpty() // returns false

//           list.set(1, 98); // sets the 1 element to 98 (returns 90)
//           (the list is now 80, 98, 100)

import java.util.*;


public class ArrayListStats1
{
    // *************************************************
    // print the ArlistList elements all on the same line
    // *************************************************  
    // We will receive a reference (a memory address)
    // to an ArlistList object. 
    // list is the reference variable that receives the memory
    // address of some ArlistList.
    public void printArrayList(ArrayList<Integer> list)
    {
        System.out.print("The list is ");
        // loop through all of the elements
        // and print each element and a space
        for (int i=0; i < list.size(); i++)
          {
             // print the ith element and a space
             // get the ith element
             System.out.print(list.get(i) + " ");
        }
        
        // move the cursor to the next line
        System.out.println();
        
    } // end of method printArlistList()


    // ********************************************
    // find the sum of the numbers in the ArlistList
    // ********************************************
    public int getTheSum(ArrayList<Integer> list)
    {
        // create a variable to hold your sum and set it 0.
        int sum = 0;
        
        // loop through all of the elements
        // and add each element to your sum
        for (int i=0; i < list.size(); i++)
        { 
             // add to your sum the value
             // sum = ???  +  ???;
             sum += list.get(i);
        }
        
        // return your sum
        return sum;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheSum()

    
    
    // ************************************************
    // find the average of the numbers in the ArrayList
    // ************************************************  
    public double getTheAverage(ArrayList<Integer> list)
    {
      int sum = 0;
      
      for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        // Get the sum and divide by the number
        // of elements in the arlist.
        // Make sure you do NOT lose any accuracy.
      
        return (double)sum/list.size(); // replace me with the average
    } // end of method getTheAverage()


    
    // ***************************************************************
    // find the sum of the numbers that are less than the first number
    // Example: list refers to [10, 7, 4, 20, 3]
    // The sum would be 7 + 4 + 3 = 14, since 7, 4, and 3 are all less
    // than 10.
    // ***************************************************************  
    public int getTheSumOfNumbersLessThanFirstNumber(ArrayList<Integer> list)
    {
      int sum = 0;
        // get your initial sum
        // create a variable called sum of type int
        // and set it to 0

         

        // get the first number from the ArlistList
        int firstNumber = list.get(0);
        
        // loop from 1 to the end of the list
        for (int i=1; i < list.size(); i++)
        {

             if (list.get(i) < firstNumber)
             {
               sum = sum + list.get(i);
             }
        }
        
        return sum;  
    } // end of method getTheSumOfNumbersLessThanFirstNumber()


    
    // ***************************************************************
    // find the sum of the numbers that are less than the last number
    // Example: list = {10, 7, 4, 25, 20}
    // The sum would be 10 + 7 + 4 = 21, since 10, 7, and 4 are all less
    // than 20.
    // ***************************************************************  
    public int getTheSumOfNumbersLessThanLastNumber(ArrayList<Integer> list)
    {
        // get your initial sum
        int sum = 0; 

        // get the last number from the ArrayList
        int lastNumber = list.get(list.size()-1);
        
        // loop from 0 to the end of the list
        for (int i=0; i < list.size()-1; i++)
        {
             // if list.get(i) is less than lastNumber then 
             // add to your sum the value of list.get(i)
             // sum = ???  +  ???;
             if (list.size() < lastNumber )
               sum = sum + list.get(i);
        }
        
        return sum;  // return the sum
    } // end of method getTheSumOfNumbersLessThanLastNumber()

    
    // ****************************************
    // does the first number repeat?
    // ****************************************  
    public boolean firstNumberRepeats(ArrayList<Integer> list)
    {
        // get the first number in the list
        int firstNumber = list.get(0);
        
        // loop through all of the elements starting at position 1
        // and see if you can find the firstNumber
        for (int i=1; i < list.size(); i++) // less than
        {
             // is the first number here? 
             // if so, return true
             if (list.get(i) == firstNumber)
                 return true; 
        }
        
        // return false
        return false;
    } // end of method firstNumberRepeats()

    
    // ****************************************
    // does the last number repeat?
    // ****************************************  
    public boolean lastNumberRepeats(ArrayList<Integer> list)
    {
        // get the last number in the list
        int lastNumber = list.get(list.size()-1);
        
        // loop through all of the elements-1 starting at position 0
        // and see if you can find the lastNumber
        for (int i=0; i  <  list.size()-1; i++) // less than
        {
          
             // is the last number here? 
             // if so, return true
             if (list.get(i) == lastNumber)
                 return true; 
        }
        
        // return false
        return false;
    } // end of method lastNumberRepeats()

    
    
}  // end of class
