// Lab Chapter 15 Array References, Lab 1
// 1) Main.java and 
//    Monsters.java and Monster.java
//
// USE THE GIVEN DATA WHEN YOU RUN YOUR
// PROGRAM TO TURN IT IN.
//
// CHECK YOUR OUTPUT
//
// FINISH ME 
// Name: 


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main // MonsterLabRunner
{
   public static void main( String args[] )
   {
       System.out.println("MonsterLabRunner");
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line

       // FINISH ME
       System.out.println("Chapter 15 - Set 1 Lab 1  Written by Justin Naicker");
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line
        
       // Create a new Scanner object
       Scanner keyboard = new Scanner(in);
  
       out.print("How many monsters are in the herd? :: ");
       
       // read in the next int from the keyboard
       int size = keyboard.nextInt();
       
       // create a Monsters object and pass it your size
       Monsters herd = new Monsters(size);

       // loop through the herd (0 ... LT size
       for(int i = 0; i < size; i ++)
       {
           out.print("\nEnter the ht :: ");
           // read in the next int
           int ht = keyboard.nextInt();
           keyboard.nextLine(); // clears the input buffer
           
           out.print("Enter the wt :: ");
           // read in the next int
           int wt = keyboard.nextInt();
           keyboard.nextLine(); // clears the input buffer
           
           out.print("Enter the age :: ");
           // read in the next int
           int age = keyboard.nextInt();
           keyboard.nextLine(); // clears the input buffer
           
           herd.add(i,new Monster(ht,wt,age));
           out.print("\n");
       }  
       
       System.out.println("HERD :: "+herd); // calls herd.toString()
       System.out.println("SMALLEST :: "+herd.getSmallest());
       System.out.println("LARGEST :: "+herd.getLargest());  
       System.out.println("HERD :: "+herd); // calls herd.toString() 
   }  
   
} // end of class Main

/*
How many monsters are in the herd? :: 3

Enter the ht  :: 6
Enter the wt  :: 7 
Enter the age :: 5


Enter the ht  :: 6
Enter the wt  :: 8
Enter the age :: 2


Enter the ht  :: 1
Enter the wt  :: 1
Enter the age :: 1

HERD :: [height: 6  weight: 7  age:5, height: 6  weight: 8  age: 2, height: 1  weight: 1  age:1]
SMALLEST :: height: 1  weight: 1  age: 1
LARGEST :: height: 6  weight: 8  age: 2
HERD :: [height: 6  weight: 7  age:5, height: 6  weight: 8  age: 2, height: 1  weight: 1  age:1]


*/

// Lab Chapter 15 Array References, Lab 1
// 1) Main.java and Monsters.java and Monster.java

// FINISH ME
// Name: Your full name goes here

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster {
  // declare your instance variables
  // declare private int variables height, weight, and age

  private int height;
  private int weight;
  private int age;

  // init constructor
  public Monster(int height, int weight, int age) {
    // init your instance variables
    this.height = height;
    
    this.weight = weight;
    
    this.age = age;

  }

  // the order
  // height is 1st, weight is 2nd, and age is 3rd
  public boolean isBigger( Monster other )
     {
        // is this monster bigger than other?
       
        // compare height
        // height is the height of this monster
        if( height > other.height ) // greater than
            return true;
        if( height < other.height ) // less than
            return false;
        
        
        // Look at how the height is done above
        // compare weight
        if( weight > other.weight ) // greater than
            return true;
        if( weight < other.weight ) // less than
            return false;
        
        
        
        // compare age
        if( age > other.age ) // greater than
            return true;
        if( age < other.age ) // less than
            return false;
        
        
        
        return false;
    }

  // the order
  // height is 1st, weight is 2nd, and age is 3rd
  public boolean isSmaller( Monster other )
     {
        // is this monster smaller than other?
       
        // compare height
        if( height < other.height ) // less than
            return true;
        if( height > other.height ) // greater than
            return false;
        
        // compare weight

        if( weight < other.weight ) // less than
            return true;
        if( weight > other.weight ) // greater than
            return false;
        
 
        
        
        // compare age

        if( age < other.age ) // less than
            return true;
        if( age > other.age ) // greater than
            return false;
        
 
        
        
        
        return false;
    }

  public String toString() {
    return "height: " + height + "  weight: " + weight + "  age: " + age;
  }

} // end of class Monster



// Lab Chapter 15 Array References, Lab 1
// 1) Main.java and Monsters.java and Monster.java

// FINISH ME
// Name: Your full name goes here

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// this class holds a list of Monster objects
public class Monsters {
  // instance variable to hold the list of Monster objects
  private Monster[] monsters;

  public Monsters() {
    // call setMonsters and pass it 1 for the default number of monsters
    setMonsters(1);
  }

  public Monsters(int size)
    {
        // call setMonsters and pass it size for the number of monsters
        setMonsters(size);
    }

  public void setMonsters(int size)
    {
        // create a new Monster array with size elements
        monsters = new Monster[size];
    }

  public void add(int index, Monster m)
    {
        if(index < monsters.length)
            monsters[index] = m;
    }

  public Monster get(int index)
    {
        // return the Monster in 
        // the index position
        return monsters[index];
    }

  public Monster getLargest( )
    { 
      // let big = the monster in the 0 position
      // Create a variable called big
      // of the type Monster
      Monster big = monsters[0];
        
        // loop through all the other monsters in the list
        // to see if you can find a bigger monster and if
        // so, update big
        // is this ith Monster bigger than monster big????
        // call a method in the Monster class
        for(int i = 0; i < monsters.length; i++)
        {
             if( monsters[i].isBigger(big) )
                big = monsters[i];
        }
        
        
        // return the biggest or largest Monster object
        return big;
    }

  public Monster getSmallest( )
    {
        // find the smallest Monster in the monsters list
        // Create a variable called small
        // of the type Monster
        Monster small = monsters[0];
        
        // loop through all the other monsters in the list
        // to see if you can find a smaller monster and if
        // so, update small
        for(int i = 0; i < monsters.length; i++)
        {
            if( monsters[i].isSmaller( small ) )
              small = monsters[i];
        }  
        
        return small;
    }

  public String toString() {
    return "" + Arrays.toString(monsters);
  }

} // end of class Monsters

