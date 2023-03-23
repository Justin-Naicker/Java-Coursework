import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main // MatrixSumming4Runner
{
 public static void main( String args[] ) throws Exception
 {

  System.out.println("\n\nLab Chapter 18 -  Lab 4 Matrix Summing 4    2022");
  System.out.println();
  System.out.println();

  System.out.println("My name is Justin Naicker");
  System.out.println();  
  System.out.println();  

  MatrixSumming4.printMatrix();
   
 }
}

// Lab Chapter 18 -  Lab 4 Matrix Summing 4    2022

// Uses files Main.java and MatrixSumming4.java
// You will be finding the sum of a row 
// and the sum of a column.

// If a 2D matrix is called m
// m.length is the number of rows
// m[0].length is the number of columns on row zero
// m[r][c] allows access to the value in the r,c position


class MatrixSumming4
{
    private static int[][] m = {
              { 1, 2, 3, 4, 5},
              { 6, 7, 8, 9, 0},
              { 6, 7, 1, 2, 5},
              { 6, 7, 8, 9, 0},
              { 5, 4, 3, 2, 1}};

    // find the sum of all of the numbers 
    // in the given row of the array m
    public static int sumOfRow(int row)
    {
        // create a variable to hold the sum
        // and set it to 0
        int sum = 0;
      
        // loop through the row (row)
        // REMEMBER:
        // your matrix is called m
        // m.length is the number of rows
        // m[0].length is the number of elements on row 0
        // m[r][c] is one element on row r and column c
        // REMEMBER:
        // Drink your Royal Crown cola (use c)
        
        // loop through all of the columns on this row
        for (int c = 0; c < m[row].length; c++)
        {
                // add to your sum
              sum += m[row][c];
        }
        
        // return your sum
        return sum;
    } // end of method sumOfRow(  )
    

    // find the sum of all of the numbers 
    // in the given column (col)
    // of the array m
    public static int sumOfColumn(int col)
    {
        // create a variable to hold the sum
        // and set it to 0
        int sum = 0;
      
        // loop through the column (col)
        // REMEMBER:
        // your matrix is called m
        // m.length is the number of rows
        // m[0].length is the number of elements on row 0
        // m[r][c] is one element on row r and column c
        // REMEMBER:
        // Drink your Royal Crown cola (use r)
        // (since you will be looping through the rows

        // move down column col
        // Your col will stay the same
        // NOTE: Your row will change each time
        for (int r = 0;  r < m.length;  r++)
        {
                // add to your sum
              sum += m[r][col];
        }
        
        // return your sum
        return sum;
    } // end of method sumOfColumn(  )
    

    // print the matrix in formatted form
    // row by row and print the sum of
    // each row at the end of each row.
    // Print the sum of each column on 
    // the last line of output
    public static void printMatrix()
    {
        // loop through all of the rows
        for (int r = 0; r < m.length; r++)
        {
            // loop through all of the columns on this row
            for (int c = 0; c < m[r].length; c++)
            {
                // print a space and the element at the r,c position       
              System.out.print(" " + m[r][c]);
                // USE A print, NOT a println
                
            } // end of inner for loop
            
          
            // get the sum of this row
            // (call a method)
            // and then print it
          System.out.print(" " + sumOfRow(r));
            // move the cursor to the next line
          System.out.println();
            // since we are at the end of the row
            
        } // end of outer for loop
        
        
        // print the sum of each column
        // call a method
        for (int c = 0; c < m[0].length; c++)
        {
             // get the sum of column c
             // call a method
              
          
             // print the sum of column c
            System.out.print( sumOfColumn(c) + " ");
          
        } // end of for c loop
        
        
        // move the cursor to the next line
        
    } // end of method printMatrix()
    
}  // end of class MatrixSumming4
