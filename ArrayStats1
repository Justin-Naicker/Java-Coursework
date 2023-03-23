public class Main // ArrayStats1Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayStats1Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 14 - Set 1 Lab 1  Written by Justin Naicker");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        ArrayStats1 arrayStats = new ArrayStats1();

        int [] array = new int[] {5,1,2,3,4,5,6,7,8,9,10};
        // we could also say:
        // int [] array = new int[11]; // new creates 11 variables with same name
        // array[0] = 5;
        // array[1] = 1;
        // array[2] = 2;
        // etc.
        
        arrayStats.printArray( array );     
        System.out.println( "The sum is               " + arrayStats.getTheSum( array ) );
        System.out.println( "The average is           " + arrayStats.getTheAverage( array ) );
        System.out.println( "The sum smaller than " + array[0] + "   " + arrayStats.getTheSumOfNumbersLessThanFirstNumber( array ) );
        System.out.println( "The sum smaller than " + array[array.length-1] + "  " + arrayStats.getTheSumOfNumbersLessThanLastNumber( array ) );
        System.out.println( "The first number repeats " + arrayStats.firstNumberRepeats( array ) );
        System.out.println( "The last number repeats  " + arrayStats.lastNumberRepeats( array ) );
          
 
        
    } // end of main method
    
} // end of class Main (ArrayStats1.java)

public class ArrayStats1
{

    public void printArray(int[] ray)
    {
        System.out.print("The list is ");
        
        for (int i = 0; i < ray.length; i++)
        {
        System.out.print(ray[i] + " ");
        }
      System.out.println("");
      
    }


    public int getTheSum(int[] ray)
    {
      int sum = 0;

      for (int i = 0; i < ray.length; i++)
        {
        sum+= ray[i];
        }
        
        return sum; 
    }

    
    
    public double getTheAverage(int[] ray)
    {
        return ((double)getTheSum(ray)/ray.length); 
    } 


    
  
    public int getTheSumOfNumbersLessThanFirstNumber(int[] ray)
    {
         int sum = 0;

        int firstNumber = ray[0];
        
      for (int i = 1; i < ray.length; i++ )
        {
          if (ray[i] < firstNumber)
          {
            sum += ray[i];
          }
        }
        return sum;  
    } 


    public int getTheSumOfNumbersLessThanLastNumber(int[] ray)
    {
     int sum = 0;    
        int lastNumber = ray[ray.length-1];

      for (int i = 0; i < lastNumber; i++)
        {
        sum += ray[i];
        }
        return sum; 
    } 

    
    public boolean firstNumberRepeats(int[] ray)
    {
      int firstNumber = ray[0];
        
         for (int i = 0; i < ray.length; i++)
        {
          if (ray[i] == firstNumber)
          {
            return true;
          }
        }
        return false;
    } 

    

    public boolean lastNumberRepeats(int[] ray)
    {
      int lastNumber = ray[ray.length-1];
        for (int i = ray.length-1; i > 0; i--)
        {
        if(ray[i] == lastNumber)
              {
                return true;
              }
        }
        return false;
    } 
    }

  
