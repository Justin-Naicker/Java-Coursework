// Lab Chapter 16 ArrayList Set 1, Lab 2
// 2) Main.java and ArrayStats2.java
      
// FINISH ME
// Name: Justin Naicker

import java.util.*;

public class Main // ArrayListStats2Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayListStats2Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        // Don't forget your name!
        System.out.println("Chapter 16 - Set 1 Lab 2  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        // Create an ArrayListStats2 object.
        // Call the default constructor (no arguments)
        ArrayListStats2 arrayListStats = new ArrayListStats2();
        
        
        // Create a new ArrayList that will contain
        // Integer objects.
        // Don't forget the () since you are calling the
        // default constructor of the ArrayList object.
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(12);
        list.add(3);
        list.add(14);

        // Call the add method of the ArrayList object 
        // referred to by list, and send it the value 5.
        // (Pass it 6)
        list.add(5);

        // Call the add method of the ArrayList object 
        // referred to by list, and send it the value 6.
        // (Pass it 6)
        list.add(6);
        
        
        arrayListStats.printArrayList( list);
             
        System.out.println( "The largest number is  " + arrayListStats.getTheLargestNumber( list ) );
        System.out.println( "The smallest number is " + arrayListStats.getTheSmallestNumber( list ) );

        System.out.println( "The largest number from 1 to 5 is  " + arrayListStats.getTheLargestNumber( list,1,5 ) );
        System.out.println( "The smallest number from 1 to 5 is " + arrayListStats.getTheSmallestNumber( list,1, 5 ) );
        System.out.println();


        // clear the list
        list.clear();
        list.add(500);
        list.add(3);
        list.add(12);
        list.add(-3);
        list.add(14);
        list.add(5);
        list.add(6);
        
        // send the address of your list to the 
        // printArrayList method (pass it list)
        arrayListStats.printArrayList( list ); 
            
        System.out.println( "The largest number is  " + arrayListStats.getTheLargestNumber( list ) );
        System.out.println( "The smallest number is " + arrayListStats.getTheSmallestNumber( list ) );

        System.out.println( "The largest number from 1 to 5 is  " + arrayListStats.getTheLargestNumber( list,1,5 ) );
        System.out.println( "The smallest number from 1 to 5 is " + arrayListStats.getTheSmallestNumber( list,1, 5 ) );

        System.out.println();
        System.out.println();
 
        
    } // end of main method
    
} // end of class

// Lab Chapter 16 ArrayList Set 1, Lab 2
// 2) Main.java and ArrayStats2.java
      
// FINISH ME
// Name: Justin Naicker

import java.util.*;

public class Main // ArrayListStats2Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayListStats2Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        // Don't forget your name!
        System.out.println("Chapter 16 - Set 1 Lab 2  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        // Create an ArrayListStats2 object.
        // Call the default constructor (no arguments)
        ArrayListStats2 arrayListStats = new ArrayListStats2();
        
        
        // Create a new ArrayList that will contain
        // Integer objects.
        // Don't forget the () since you are calling the
        // default constructor of the ArrayList object.
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(12);
        list.add(3);
        list.add(14);

        // Call the add method of the ArrayList object 
        // referred to by list, and send it the value 5.
        // (Pass it 6)
        list.add(5);

        // Call the add method of the ArrayList object 
        // referred to by list, and send it the value 6.
        // (Pass it 6)
        list.add(6);
        
        
        arrayListStats.printArrayList( list);
             
        System.out.println( "The largest number is  " + arrayListStats.getTheLargestNumber( list ) );
        System.out.println( "The smallest number is " + arrayListStats.getTheSmallestNumber( list ) );

        System.out.println( "The largest number from 1 to 5 is  " + arrayListStats.getTheLargestNumber( list,1,5 ) );
        System.out.println( "The smallest number from 1 to 5 is " + arrayListStats.getTheSmallestNumber( list,1, 5 ) );
        System.out.println();


        // clear the list
        list.clear();
        list.add(500);
        list.add(3);
        list.add(12);
        list.add(-3);
        list.add(14);
        list.add(5);
        list.add(6);
        
        // send the address of your list to the 
        // printArrayList method (pass it list)
        arrayListStats.printArrayList( list ); 
            
        System.out.println( "The largest number is  " + arrayListStats.getTheLargestNumber( list ) );
        System.out.println( "The smallest number is " + arrayListStats.getTheSmallestNumber( list ) );

        System.out.println( "The largest number from 1 to 5 is  " + arrayListStats.getTheLargestNumber( list,1,5 ) );
        System.out.println( "The smallest number from 1 to 5 is " + arrayListStats.getTheSmallestNumber( list,1, 5 ) );

        System.out.println();
        System.out.println();
 
        
    } // end of main method
    
} // end of class
