import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main // SeatingChartRunner
{
 public static void main( String args[] ) throws IOException
 {
  System.out.println("\n\nLab 18.5 Seating Chart");
  System.out.println();
  
  // PUT your name on this lab!
  System.out.println("Written by Justin Naicker");
  System.out.println();
  System.out.println();
  
  // We will create (instantiate) a SeatingChart object with
  // 4 rows and 3 columns.
  SeatingChart seatingChart = new SeatingChart(4, 3);
  System.out.println( );

  // Put in Student objects
  Student s = new Student("Tom", "A");
  if (seatingChart.add(s, 0, 0))
  {
     System.out.println("Added " + s.getName() );
  }
  
  s = new Student("Sue", "P");
  if (seatingChart.add(s, 0, 1))
  {
     System.out.println("Added " + s.getName() );
  }
  
  s = new Student("Sam", "P");
  if (seatingChart.add(s, 1, 0))
  {
     System.out.println("Added " + s.getName() );
  }

  s = new Student("Jill", "P");
  if (seatingChart.add(s, 1, 1))
  {
     System.out.println("Added " + s.getName() );
  }

  s = new Student("Julian", "P");
  if (seatingChart.add(s, 2, 2))
  {
     System.out.println("Added " + s.getName() );
  }

  s = new Student("Diego", "P");
  if (seatingChart.add(s, 1, 1))
  {
    System.out.println("Added Diego");
  }
  else
  {
   System.out.println("Seat is taken.");
  }

  if (seatingChart.add(s, 2, 1))
  {
    System.out.println("Added Diego");
  }
  else
  {
    System.out.println("Seat is taken.");
  }

  System.out.println();
  
  // Prints the seating chart.
  seatingChart.printSeatingChart();
  System.out.println();
  
  // gets the number of students absent
  // The code is "A"
  int numAbsent = seatingChart.getNumberOfStudentsWithCode("A");
  
  // Now we will print it
  System.out.println("Number Absent: " + numAbsent);
  System.out.println();
  
  // gets the number of students present
  // The code is "P"
  int numPresent = seatingChart.getNumberOfStudentsWithCode("P");

  // Now we will print it
  System.out.println("Number Present: " + numPresent);
  System.out.println();

  
  
 } // end of main method

} // end of class Main


import java.util.Scanner;
import static java.lang.System.*;

// define a public class called SeatingChart
public class SeatingChart
{
 // instance variable (attribute, property,
 // field, global variable, record, data elements)
 // define a private instance variable called
 // chart which references a 2D array of
 // Student objects.
 private Student[][] chart;

 // init constructor to create the 
 // seating chart.
 public SeatingChart(int rows, int cols)
 {
     // Create the Student 2D array
     // All cells of the matrix (elements)
     // will be null by default.
     chart = new Student[rows][cols];
 }


  // Adds a Student Object to the grid (seating chart)
  // returns true if successful,
  // else return false.
 public boolean add(Student student, int r, int c)
 {
     // add each student's object to the seating chart
     // check and make sure that the row and col is on
     // the seating chart (call a method).
     // Also make sure that the seat is not already
     // taken.  A seat is available if the value
     // of the r,c position is equal to null.
     
     if (isValid(r,c) && chart[r][c] == null)
     {
        // assign this student to the
        // r,c position of the chart
        chart[r][c] = student;
        
        // return the value of true
        return true;
     }
     else
     {
        return false;
     }
 }


 // Remove the student in the r,c position
 // and return who you removed.
 // return null if the seat is empty
 // or the seat is NOT on the grid.
 public Student remove(int r, int c)
 {
     // Check and see if the r,c position is
     // valid AND (&&) that the r,c element is
     // NOT null.
     if (isValid(r,c) && chart[r][c] != null)
     {
        // Get the memory address of the student
        // in the r,c position.
        Student student = chart[r][c];
        
        // Now, set the r,c position to null to
        // indicate that there is no student in
        // seat.
        chart[r][c] = null;
        
        // Now, return your student
        return student;
     }
     else
     {
        // return null since there was not a 
        // student in this seat or the r,c
        // position was off the chart.
        return null;
     }
 }

  // Print the seating chart in 
  // matrix format.
  // (in Row Major Order)
 public void printSeatingChart()
 {
   // Print each student's name 
   // and Attendance Code
   // You will need two loops!
   // Use nested loops to loop 
   // through the chart (traverse)
   for (int r = 0; r < chart.length;  r++)
   {
      for (int c = 0; c < chart[r].length;  c++)
      {
         // See if the r,c position 
         // is equal to null.  If so,
         // we will print spaces, since
         // it is an empty seat.
         if (chart[r][c] == null)
         {
           // print spaces (done for you)
           System.out.print(formatString(" ",false,12));
           System.out.print("  |  ");
         } // end of if the r,c cell is null
         else
         {
           // print the student's name
           // and attendance code
           // First get the name and the code
           // Remember that each position of the matrix
           // holds a Student object (or null).
           String name = chart[r][c].getName();
           String code = chart[r][c].getAttendanceCode();
           
           System.out.print(formatString(name,true,10));           
           System.out.print(formatString(code,false,2));
           System.out.print("  |  ");
           
         } // end of else
      } // end of inner for c loop
      
      // move cursor to start of next line
      // for the next row
      System.out.println();
      
   } // end of outer for r loop     
     
 } // end of method printSeatingChart()


 // get the number of students with the
 // given attendance code.
 // The attendance code is passed to the
 // parameter variable code.
 public int getNumberOfStudentsWithCode(String code)
 {
   // Loop through the seating chart and count
   //     the number of students that have 
   //     this attendance code.
   // An empty desk will have a null 
   // value in the matrix.
   
   // create a count variable and 
   // set it to zero
   int count = 0;
   
   
   // Use nested loops to loop 
   // through the chart (traverse)
   for (int r = 0; r < chart.length;  r++)
   {
      for (int c = 0; c < chart[r].length;  c++)
      {
         // Make sure the r,c position 
         // is NOT null
         if (chart[r][c] != null)
         {
           // get the attendance code and see if it
           // is equal to code 
           // (Use .equals() NOT == )
           // since the code is a String
           if (chart[r][c].getAttendanceCode().equals(code))
           {
               // add 1 to your count variable
               count++;
           }
         } // end of if the r,c cell is NOT null
      } // end of inner for c loop
   } // end of outer for r loop     
   
   // return your answer
  return count;
 }


 /*
  * check r and c to ensure they are 
  * inside the grid
  */
 private boolean isValid( int r, int c)
 {
   // r must be greater than or equal to 0 
   //     && less than the number of rows
   // c must be greater than or equal to 0 
   //     && less than the number of columns
   
   // if the r,c position is on the grid,
   // return true
   if (r >= 0 && r < chart.length)
     if (c >= 0 && c < chart[0].length)
      return true;
   
   // return the value of false
   return false;
 }

 
 // this method has been done for you
 // except to fill in for the ? which 
 // is the less than sign
 private String formatString(String input, boolean leftJustify, int size) 
 {
   String output = input;
   
   if (leftJustify)
   {
     for (int i = input.length()+1; i<=size; i++)
     {
       output = output + " ";
     }
   }
   else
   {
     for (int i = input.length()+1; i<=size; i++)
     {
       output = " " + output;
     }
   }
   return output;
 } // end of method formatString()
 
} // end of class SeatingChart

import java.util.*;

// FIND ALL OF THE FINISH ME comments
// and add the necessary code

// define the class Student
public class Student
{
 // define a private String variable
 // called name 
 private String name;
 
 // define a private String variable
 // called attendanceCode 
 private String attendanceCode;
 
 // define the constructor for the Student class
 public Student(String name, String attendanceCode)
 {
   // FINISH ME
   // Assign the incoming values 
   // to your instance variables.
   this.name = name;
   
   this.attendanceCode = attendanceCode;                  
 } 
 
 
 public String getName()
 {
   // FINISH ME
   return name;
 }

 
 public String getAttendanceCode()
 {
   // FINISH ME
   return attendanceCode;

 }

 
 // This is a setter method or
 // mutator method
 public void setAttendanceCode(String code)
 {
     // FINISH ME
     // Assign the incoming code to
     // this student's 
     // attendanceCode
     attendanceCode = code;
 }
 
 
 public String toString()
 {
   // FINISH ME
   // return the name, a space, and the 
   // attendance code of this student
      
   return name + " " + attendanceCode; // replace me
 }
  
 
}  // end of class Student
