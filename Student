// Lab Chapter 16 ArrayList Set 1, Lab 3
// 3) Main.java and Student.java
      
// FINISH ME
// Name: Your full name goes here

import java.util.*;  //ArrayList, Stack

// FIND ALL OF THE FINISH ME comments 
// There is only one in the Main class

public class Main // ArrayListStudentRunner3 
{ 
  private int    numStudents = 5;
  
  private ArrayList<Student> list; 
  

  public void initialize( ) 
  { 

 // create an ArrayList to hold the Student objects
 list = new ArrayList<Student>();
 
 ArrayList<Integer> grades = new ArrayList<Integer>();
 grades.add(100);
 grades.add(98);
 grades.add(100);
 grades.add(100); 
 Student temp = new Student("Tom", "TL34529", 16, grades);
 list.add(temp);

 grades = new ArrayList<Integer>();
 grades.add(60);
 grades.add(67);
 grades.add(80);
 grades.add(90); 
 temp = new Student("Julie", "JL54738", 17, grades);
 list.add(temp);

 // And now the rest of the students 
 String [] nameList = {"Sue", "Bill", "Sally"}; 
 String [] idList = {"SU12345", "BI54321", "SA98723"}; 
 int [] ageList = {17, 16, 16}; 

 
 // We will create 3 more students for our list
 for (int k=0; k< numStudents-2; k++)
 {
  grades = new ArrayList<Integer>();
  
  // We will put in 4 grades (random)
  for (int i=0; i < 4; i++)
  {
   int x = (int) (Math.random() * 41 + 60);
   grades.add(x);  
  }  // end of for loop for 4 grades
  
  temp = new Student(nameList[k], idList[k], ageList[k], grades);
  list.add(temp);
 } // end of for (outer loop)
    

  }   // end of public void initialize 

  // ***** default constructor *****

  public Main( ) 
  { 
    // initialize variables

    initialize( ); // creates all of the students
    displayScreen(); // displays the students and their info
  }


public void displayScreen()
{
  System.out.println("Student Grades");
  System.out.println();
  // FINISH ME
  System.out.println("Written by Justin Naicker");
  
  for (int i=0; i<list.size(); i++)
  {
  
  int sum = list.get(i).getSum();  // calls the appropriate method in class Student  

  double average = list.get(i).getAverage(); // calls the appropriate method in class Student


  int largest = list.get(i).getHighestGrade(); // calls the appropriate method in class Student
  
  int smallest = list.get(i).getLowestGrade(); // calls the appropriate method in class Student 

  int range = list.get(i).getRange(); // calls the appropriate method in class Student

  int num100s = list.get(i).getCountOf(100);  // calls the appropriate method in class Student

  int numGTE90 = list.get(i).getNumGTE(90);  // calls the appropriate method in class Student

  int numLT70 = list.get(i).getNumLT(70);  // calls the appropriate method in class Student

  
  // let''s print
  System.out.println();
  System.out.println();
  System.out.println("Name: " + list.get(i).getName());
  System.out.println("ID:   " + list.get(i).getId());
  System.out.println("Age:  " + list.get(i).getAge());
  System.out.println();
  System.out.println("Grades:    " + list.get(i).getGradeList());
  System.out.println("Sum:       " + sum);
 
  System.out.println("Avg:       " + average);
  System.out.println("Largest:   " + largest);
  System.out.println("Smallest:  " + smallest);
  System.out.println("Range:     " + range);
  System.out.println("100's:     " + num100s);  
  System.out.println("GTE 90:    " + numGTE90);
  System.out.println("LT 70:     " + numLT70);

  
  }
  
} // end of displayScreen


  // ***** main method *****
  public static void main(String[] arguments) {
    Main arrayListStudent = new Main( );
    
  }


} // end of class Main // ArrayListStudentRunner3

import java.util.*;

public class Student
{
 private String name;
 private String id;
 private int age;
 private ArrayList<Integer> gradeList;
 
 // Constructor Student
 // Fills the variables with values when you create
 // a new Student.
 public Student(String theName, String theId, int theAge, ArrayList<Integer> gradeList)
 {
  name = theName;
   id = theId;
   age = theAge;
   this.gradeList = gradeList;
 } 
 
 
 public String getName()
 {   
  return name;  // or use this.????
 }

 
 public String getId()
 {
  return id; // or use this.??
 }

public int getAge()
 {
  return age; // or use this.???
 }
 
 public ArrayList<Integer> getGradeList()
 {
  return gradeList; // or use this.?????
 }

 
 public void setName(String name)
 {
   // Change the name
   // Remember that this.name is the 
   // instance variable.
   // The parameter variable called name
   // is a temporary variable that will 
   // receive the new name and store it in
   // this.name.
   this.name = name; 
 }

 public void setGradeList(ArrayList<Integer> gradeList)
 {
   // Change the gradeList
   this.gradeList = gradeList; 
 }

 // gets the sum of the grades
 public int getSum()
 {
    int sum = 0;
    for (int i=0; i < gradeList.size(); i++)
    {
       sum += gradeList.get(i);
    }
    return sum;
 }
 
 
 public double getAverage()
 {
    return (double)getSum()/gradeList.size();
 }
 

 public int getHighestGrade()
 {
    // Get the grade in the 0 position.
    // It is the highest grade so far.
    int highestGrade = gradeList.get(0);
    
    // Now let's see if we have something higher.
    // We will look through all the other elements.
    for (int i=0; i < gradeList.size(); i++)
    {
       // Get the grade in the ith position and
       // see if it is higher than our highestGrade
       if (gradeList.get(i) > highestGrade)
       {
           // We have a new highest grade so we will
           // save it in our higestGrade variable.
           highestGrade = gradeList.get(i);
       }
    }
    
    // We will now return our highest grade
    return highestGrade;
 }

 
 public int getLowestGrade()
 {
    // Get the grade in the 0 position.
    // It is the lowest grade so far.
    int lowestGrade = gradeList.get(0);
    
    // Now let's see if we have something lower.
    // We will look through all the other elements.
    for (int i=1; i < gradeList.size(); i++)
    {
       // Get the grade in the ith position and
       // see if it is smaller than our lowestGrade
       if (gradeList.get(i) < lowestGrade)
       {
           // We have a new lowest grade so we will
           // save it in our lowestGrade variable.
           lowestGrade = gradeList.get(i);
       }
    }
    
    // We will now return our lowest grade
    return lowestGrade;
 }

 
 // The range is:
 // highest grade - lowest grade
 public int getRange()
 {    
   return getHighestGrade() - getLowestGrade(); // fix me
 }
 
 // Returns the number of times the value
 // of num appears in the gradeList.
 // Example: 
 // gradeList = 100 90 92 100 87 100 99
 // if num is 100, then you would return
 // 3,since there are 3 100's in the list.
 public int getCountOf(int num)
 {
   int count = 0;
   
   for (int i = 0; i < gradeList.size(); i++)
   {
       if (gradeList.get(i) ==  num)
       {
         count++;
       }  
   }
   
   return count; // fix me
 }
 
 
 // return the number of grades 
 // greater than or equal to num
 public int getNumGTE(int num)
 {
   int count = 0;

  
   for (int i = 0; i < gradeList.size(); i++)
     {
      if (gradeList.get(i) >= num )
      {
        count++;
      }
     }
   
   return count; // fix me   
 }
 

 // return the number of grades 
 // less than num
 public int getNumLT(int num)
 {
    int count = 0;
   
   for (int i = 0; i < gradeList.size(); i++)
     {
      if (gradeList.get(i) < num )
      {
        count++;
      }
     }
     
          
   return count; // fix me   
 }
 

 public String toString()
 {
    return name + " " + id + "  " + age;
 }
 
}  // end of class Student

