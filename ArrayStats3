public class Main // ArrayStats3Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayStats3Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 14 - Set 1 Lab 3  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        ArrayStats3 arrayStats = new ArrayStats3();

        int [] array = new int[] {1,3,12,8,16,18,26,77,82,90,100};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly decreasing " + arrayStats.isStrictlyDecreasing( array ) );

        
        System.out.println();

        array = new int[] {1,3,12,15,15,18,26,77,82,90,100};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );

                
        System.out.println();

        array = new int[] {1,3,12,15,16,18,26,77,82,90,100};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );


        System.out.println();

        array = new int[] {100,93,85,95,66,58,46,37,22,10,5};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );

       
        System.out.println();

        array = new int[] {100,93,85,75,75,58,46,37,22,10,5};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );

        System.out.println();

        array = new int[] {100,93,85,75,66,58,46,37,22,10,5};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );


        
        
        System.out.println();
        System.out.println();
 
        
    } // end of main method
    
} // end of class

public class ArrayStats3
{

    public void printArray(int[] ray)
    {
        System.out.print("The list is ");
        // loop through all of the elements
        // and print each element and a space
       for(int i: ray){
         System.out.print(i);
         System.out.print(" ");
       }
       
        
        
        // move the cursor to the next line

       System.out.println();

        
    } // end of method printArray()


    // *****************************************************
    // determine if the numbers always increase in the array
    // *****************************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: true if the numbers always increase
    public boolean isStrictlyIncreasing(int[] ray)
    {        
        // Loop through all of the elements - 1
        // and check to see if the ith element is greater than or
        // equal to the i+1 element (don't go out of bounds).
        // if it is, then return false

       for(int i = 0; i < ray.length-1; i++){


          if(ray[i] >= ray[i + 1])
            return false;

         
       }

      
      
        return true;
    } // end of method isStrictlyIncreasing()

    
   
    // *****************************************************
    // determine if the numbers always decrease in the array
    // *****************************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: true if the numbers always decrease
    public boolean isStrictlyDecreasing(int[] ray)
    {        
        // Loop through all of the elements - 1
        // and check to see if the ith element is less than or
        // equal to the i+1 element (don't go out of bounds).
        // if it is, then return false

      for(int i = 0; i < ray.length-1; i++){

        if(ray[i] <= ray[i + 1])
          return false;
        
      }

      
      
        return true;
    } // end of method isStrictlyDecreasing()

    
}  // end of class ArrayStats3
