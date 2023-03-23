import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main // MatrixSumming1Runner
{
 public static void main( String args[] ) throws Exception
 {

  System.out.println("Lab Chapter 18 -  Matrix Summing 1    2022");
  System.out.println();
  System.out.println();
  
  // ***** fill in your name
  System.out.println("My name is Justin Naicker");
  System.out.println();  
  System.out.println();  

  MatrixSumming1.printMatrix();
  System.out.println( "\nThe sum of the matrix is :: " + MatrixSumming1.sum() );
   
 }
}
/*

Lab Chapter 18 -  Matrix Summing 1    2022


My name is ????????  ????????????????


 1 2 3 4 5
 6 7 8 9 0
 6 7 1 2 5
 6 7 8 9 0
 5 4 3 2 1

The sum of the matrix is :: 111

*/

// Lab Chapter 18 -  Set 1 Matrix Summing 1    2022

// Uses files Main.java and MatrixSumming1.java

// If a 2D matrix is called m
// m.length is the number of rows
// m[0].length is the number of columns on row zero
// m[r][c] allows access to the value in the r,c position

import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {
              { 1, 2, 3, 4, 5},    // m[0]
              { 6, 7, 8, 9, 0},    // m[1]
              { 6, 7, 1, 2, 5},    // m[2]
              { 6, 7, 8, 9, 0},    // m[3]
              { 5, 4, 3, 2, 1}};   // m[4]

    // find the sum of all of the numbers 
    // in the array called m
    public static int sum(  )
    {
        // create a variable to hold the sum
        // and set it to 0

        int sum = 0;
      
        // loop through all the rows
        // REMEMBER:
        // your matrix is called m
        // m.length is the number of rows
        // m[0].length is the number of elements on row 0
        // m[r][c] is one element on row r and column c
        // REMEMBER:
        // Drink your Royal Crown cola (use r and c)
        
        for (int r = 0; r < m.length; r++)
        {
            // loop through all of the columns on this row
            for (int c = 0; c < m[r].length; c++)
            {
               sum = sum + m[r][c];
              
            }
        }
        
        // return your sum
        return sum;
    } // end of method sum(  )
    
    
    // print the matrix in formatted form
    // row by row
    public static void printMatrix()
    {
        // loop through all of the rows
        for (int r = 0; r < m.length; r++)
        {
            // loop through all of the columns on this row
            for (int c = 0; c < m[r].length; c++)
            {
                System.out.print(m[r][c] + " ");
                
            }
            
            // move the cursor to the next line
            // since we are at the end of the row
            System.out.println();
            
        }
        
        // move the cursor to the next line
        
    } // end of method printMatrix()
    
}  // end of public class MatrixSumming1



