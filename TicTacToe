import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main // TicTacToeRunner
{
 public static void main( String args[] ) throws Exception
 {
  System.out.println("\n\nLab Chapter 18 Lab 3 -  TicTacToe    2022");
  System.out.println();
  System.out.println();
  
  System.out.println("My name is Justin Naicker");
  System.out.println();  
  System.out.println();  

   TicTacToe tic = new TicTacToe("XXOOOXOX-");   
   System.out.println(tic.toString());
   System.out.println(tic.getWinner());
   
   tic = new TicTacToe("XOOXOOXX-");   
   System.out.println(tic.toString());
   System.out.println(tic.getWinner());
   
   tic = new TicTacToe("XXXXOOOO-");   
   System.out.println(tic.toString());
   System.out.println(tic.getWinner());

   tic = new TicTacToe("OOXXOXX-O");   
   System.out.println(tic.toString());
   System.out.println(tic.getWinner());

 }
}
// Lab Chapter 18 - Lab 3 TicTacToe    2022

// Uses files Main.java and TicTacToe.java

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
  // instance variable mat to hold the 2D
  // elements
  private char[][] mat;

  // constructor TicTacToe
  // receives the game as a String
  // Example game: "XXOXOOOX-"
 public TicTacToe(String game)
 {
  // create a new char array that 
  // has 3 rows and 3 columns
    mat = new char[3][3];
   
  // REMEMBER:
  // mat will hold the memory address of where
  //    to find the matrix.
  // mat.length is the number of rows 
  //    in the matrix
  // mat[0].length is the number of columns or 
  //    elements on row 0
   
   
  // we will loop through all the rows and columns of the 2D array
  // we will take characters from the String game
  // For example: if game is "XXOOOXXOX", then
  //    the first three characters XXO are the values for row 0
  //    the next three characters OOX are the values for row 1
  //    the final three characters XOX are the values for row 2
  //    A dash (-) will represent that nobody played on that cell 
  
  int i=0; // The position of the next char in the String game
  
  // We will now get the characters from game
  // row by row (Row Major Order) and put them
  // in our 2D array called mat
  // We will loop through all rows (use r for your loop variable)
  for( int r = 0; r < mat.length; r++)
  {
    // we will move across row r (use c for your loop variable)
    for(int c = 0; c < mat[r].length; c++)
   {
    // get the ith character from your game variable
    // Remember that game is a String, so you
    // you need to use the String's charAt() method.
      mat[r][c] = game.charAt(i);
    
     i++; // moves to the next index pos of game
     
   } // end of inner for c loop
   
  } // end of outer for r loop
  
 } // end of constructor TicTacToe

 
 public String getWinner()
 {
  String winner = "";
  
  // handle each row (see if there is a winner on each row)
  for (int r = 0;  r < mat.length;  r++)
  {
   // check this r row for a winner 
   // check element r,0  element r,1 and element r,2 for equality
   
   // YOU CAN'T SAY THIS:
   // if ( mat[r][0] == mat[r][1] == mat[r][2])
    
   // YOU CAN'T SAY THIS:
   // if ( mat[r][0] == mat[r][1] && mat[r][2])
    
   // BOTH SIDES OF AN && STATEMENT MUST BE
   // A boolean result!
    
    if(mat[r][0] == mat[r][1] && mat[r][1] == mat[r][2]) 
   {
    winner = mat[r][0]+" wins horizontally on row " + r;
   }
  }
  
  // Is there a winner on col c
  // loop through the columns (use c)
  for (int c = 0; c < mat[0].length; c++)
  {
   // check this c column 
   // check element 0,c element 1,c, and element 2,c for equality 
      if(mat[0][c] == mat[1][c] && mat[1][c] == mat[2][c]) 
   {
    winner = mat[0][c]+" wins vertically on column " + c;
   }
  }
  
  
  // handle diagonal 1 (upper left to lower right)
  if(mat[0][0] == mat[1][1] && mat[1][1]== mat[2][2])
  {
   winner = mat[0][0]+" wins diagonally!";
  }
  
  
  // handle diagonal 2  (upper right to lower left)
  if(mat[0][2] == mat[1][1] && mat[1][1]== mat[2][0])
  {
   winner = mat[2][0]+" wins diagonally!";
  }

  
  if(winner.length()==0)
     return "cat's game - no winner!\n\n";
  else
  {
     return winner + "\n\n";
  }
  
 } // end of getWinner() method

 
 // we will get the matrix in row major order (row by row)
 // for printing on the console
 public String toString()
 {
  // create a String variable to hold your output
  String output="";
  
  // loop through all the rows (use r for the row)
  for (int r = 0; r < mat.length; r++)
  {
   // loop across row r (use c for the column)
    for (int c = 0; c < mat[r].length; c++)
   {
     // join onto output the r,c element and a space
      output += mat[r][c] + " ";
   }
   // join onto output a new line marker ("\n")
    output += "\n";
  }
  
  // return your output (change this!!!)
  return output;
 } // end of toString() method

} // end of class TicTacToe
