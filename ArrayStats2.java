public class Main // ArrayStats2Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayStats2Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 14 - Set 1 Lab 2  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        ArrayStats2 arrayStats = new ArrayStats2();

        int [] array = new int[] {5,3,12,3,14,5,6,7,2,90,10};
        
        arrayStats.printArray( array );     
        System.out.println( "The largest number is  " + arrayStats.getTheLargestNumber( array ) );
        System.out.println( "The smallest number is " + arrayStats.getTheSmallestNumber( array ) );

        System.out.println( "The largest number from 1 to 5 is  " + arrayStats.getTheLargestNumber( array,1,5 ) );
        System.out.println( "The smallest number from 1 to 5 is " + arrayStats.getTheSmallestNumber( array,1, 5 ) );
        System.out.println();

        array = new int[] {500,3,12,-3,14,5,6,-7,2,90,100};
        
        arrayStats.printArray( array );     
        System.out.println( "The largest number is  " + arrayStats.getTheLargestNumber( array ) );
        System.out.println( "The smallest number is " + arrayStats.getTheSmallestNumber( array ) );

        System.out.println( "The largest number from 1 to 5 is  " + arrayStats.getTheLargestNumber( array,1,5 ) );
        System.out.println( "The smallest number from 1 to 5 is " + arrayStats.getTheSmallestNumber( array,1, 5 ) );

        System.out.println();
        System.out.println();
 
        
    } // end of main method
    
} // end of class Main (ArrayStats2)



public class ArrayStats2
{
    // ***********************************************
    // print the array's elements all on the same line
    // ***********************************************  
    // We will receive a reference (a memory address)
    // to an array. 
    // ray is the reference variable that receives the memory
    // address of some array.
  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: Array ray is printed
    public void printArray(int[] ray)
    {
        System.out.print("The list is ");
       for (int i = 0; i < ray.length; i++)
         {
           System.out.print(ray[i] + " ");
         }
      System.out.println("");

        
    } // end of method printArray()


    // ****************************************
    // find the largest number in the array
    // ****************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: The largest number is returned
    public int getTheLargestNumber(int[] ray)
  {
  int largeNumber = ray[0];

   for (int i = 0; i < ray.length; i++)
    {
        // create a variable to hold your largest number and set it to -Integer.MIN_VALUE.
        // (or you could set it to ray[0])
        // int largestNumber = ?????;
        
        // loop through all of the elements
        // and check to see if each ith element is greater than largestNumber
        // if it is, then set largestNumber to ray[i]
        // for (??????)
      
             // see if your element is greater than largestNumber
             // if (??????)
             //     largestNumber = ???[i];

          if (ray[i] > largeNumber)
          {
            largeNumber = ray[i];
          }
        }
        // return your largest number
        return largeNumber;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheLargestNumber()
  
    
    // ****************************************
    // find the smallest number in the array
    // ****************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: The smallest number is returned
    public int getTheSmallestNumber(int[] ray)
    {
        // create a variable to hold your smallest number and set it to Integer.MAX_VALUE.
        // (or you could set it to ray[0])
       int smallestNumber = ray[0];

      for (int i = 0; i < ray.length; i++)
        {
          if (ray[i] < smallestNumber)
          {
            smallestNumber = ray[i];
          }
        }
        // loop through all of the elements
        // and check to see if the ith element is smaller than smallestNumber
        // if it is, then set smallestNumber to ray[i]
        // for (?????)
        {
             // see if your element is smaller than smallestNumber
             // if (??????)
             //     smallestNumber = ???[i];


        }
        
        // return your smallest number
        return smallestNumber;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheSmallestNumber()

   
    // **************************************************
    // find the largest number in the array from position 
    // firstIndex to position lastIndex (inclusive)
    // NOTE: We have an overloaded method!!!!!!!
    //       Two methods in the same class with the same
    //       name but different parameters!!!!!!
    // **************************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: The largest number in the range is returned
    public int getTheLargestNumber(int[] ray, int firstIndex, int lastIndex)
    {
      int largestNumber = ray[firstIndex];
        // create a variable to hold your largest number and set it to -Integer.MIN_VALUE.
        // (or you could set it to ray[firstIndex])
        // int largestNumber = ??????;
        
      
        // loop through all of the elements
        // from position firstIndex to position lastIndex (inclusive)
        // and check to see if the ith element is greater than largestNumber
        // if it is, then set largestNumber to ray[i]

      for (int i = firstIndex; i < lastIndex; i++)
        {
          largestNumber = ray[i];
        }
      
      
      
        // return your largest number
        return largestNumber;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheLargestNumber()


    
    // ***************************************************
    // find the smallest number in the array from position
    // firstIndex to position lastIndex (inclusive)
    // NOTE: We have an overloaded method!!!!!!!
    //       Two methods in the same class with the same
    //       name but different parameters!!!!!!
    // ***************************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: The smallest number in the range is returned
    public int getTheSmallestNumber(int[] ray, int firstIndex, int lastIndex)
    {
      int smallestNumber = ray[firstIndex];
        // create a variable to hold your smallest number and set it to Integer.MAX_VALUE.
        // (or you could set it to ray[firstIndex])
        // int smallestNumber = ??????;

      for (int i = firstIndex; i < lastIndex; i++)
        {
          if (ray[i] < smallestNumber)
          {
            smallestNumber = ray[i];
          }
        }
        
        // loop through all of the elements
        // from position firstIndex to position lastIndex (inclusive)
        // and check to see if the ith element is smaller than smallestNumber
        // if it is, then set smallestNumber to ray[i]

      
      
      
      
        // return your smallest number
        return smallestNumber;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheSmallestNumber()

   
}  // end of public class ArrayStats2

