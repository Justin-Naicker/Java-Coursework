import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
  
 public static void main( String args[] )
 {
  System.out.println("Lab Chapter 18 -  Matrix Summing 2    2022");
  System.out.println();
  System.out.println();
  
  System.out.println("My name is Justin Naicker");
  System.out.println();  
  System.out.println();  

  MatrixSumming2 matrix = new MatrixSumming2();
  
  System.out.println(matrix.toString());
  System.out.println( "The sum of the matrix cells around cell 0,0 is :: " + matrix.getSum(0,0) );
  System.out.println( "The sum of the matrix cells around cell 0,1 is :: " + matrix.getSum(0,1) );
  System.out.println( "The sum of the matrix cells around cell 1,0 is :: " + matrix.getSum(1,0) );
  System.out.println( "The sum of the matrix cells around cell 1,1 is :: " + matrix.getSum(1,1) ); 
 }
}

import java.util.*;
import java.io.*; 

public class MatrixSumming2
{
    private int[][] m = {{5,6},{7,8},{3,4}};

    public int getSum( int row, int col )
    {
      int sum = 0;
      
      
      for (int r = row-1; r <= row + 1; r++)
      {
        for (int c = 0; c <= m[1].length; c++)
        {
            if (isValid(r,c))
                 sum = sum + m[r][c];
        }
      }
     
      
     // fix me 
     return sum;
    }

    public boolean isValid(int r, int c)
  {
       if (r >= 0 && r < m.length && c >= 0 && c < m[r].length)
           return true;
       
       
       return false; 
    }

  
    public String toString()
    {
        String output = "";
        
        for (int r = 0; r < m.length; r++)
        {
            for (int c = 0; c < m[r].length; c++)
            {
                output = output + " " + m[r][c];
            }
            output += "\n";
        }
        
        return output;
    }
    
}




