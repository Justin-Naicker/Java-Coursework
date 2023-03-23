// Lab Chapter 15 Array References, Lab 2
// 2) Main.java and Doggies.java and Dog.java
      
// FINISH ME

import java.util.*; // we can use any class in the util folder

public class Main // DoggiesRunner
{
   public static void main( String[] args )
   {
       System.out.println("DoggiesRunner");
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line

       // FINISH ME
       System.out.println("Chapter 15 - Set 1 Lab 2  Written by Justin Naicker");
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line
       
       // creates room for 3 doggies
       Doggies pack = new Doggies(3); // or new Doggies()

       pack.add("Rover",16);
       pack.add("Old Yeller", 18);       
       pack.add("Lassie",7);
       pack.add("Boy",1);
       
       
       // changes the dog in the zero position to have a name of "Bob"
       pack.setName(0, "Bob");
       System.out.println("Rover is now " + pack.get(0).getName() + ".");
       
       // changes the dog in the zero position to have an age of 2
       pack.setAge(0, 15);
       System.out.println("Bob is now " + pack.get(0).getAge() + " years old.");
       System.out.println();
       
       pack.printPups();
       
       System.out.println("pack :: "+pack); // calls pack.toString()
       System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
       System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());
       
       System.out.println(); // prints a blank line
       System.out.println(); // prints a blank line
       
       
   }  // end of method main
   
} // end of class

/*
Chapter 15 - Set 1 Lab 2  Written by xxxxx xxxxx


Sorry no room for Boy.  Index out of bounds.
Rover is now Bob.
Bob is now 15 years old.

Name: Bob   Age: 15
Name: Old Yeller   Age: 18
Name: Lassie   Age: 7

pack :: [Name: Bob   Age:15, Name: Old Yeller   Age:18, Name: Lassie   Age:7]
NAME OF OLDEST :: Old Yeller
NAME OF YOUNGEST :: Lassie

*/

// Lab Chapter 15 Array References, Lab 2
// 2) Main.java and Doggies.java and Dog.java
      
// FINISH ME
// Name: Rosco Davis


public class Dog 
{
    // instance variables (always holds the data)
    private String name;
    private int age;

    
    
    // init constructor that initializes our instance variables
    // age and name (Remember the constructor has the same name
    // as the class and NO return type.)
    public Dog(String name, int age) 
    {
        // Remember that inside this method, name and age 
        // are temporary local variables that receive the
        // data that we then store in our instance variables.
        // You must use this.name and this.age to refer to 
        // your instance variables inside this constructor.

      this.name = name;
      this.age = age;

      
    } 

    
    // accessor or getter method that retrieves the data
    public String getName()
    {
        // ???????
        return name; // replace me
    }
    

    // mutator or modifier or setter method
    // This allows us to change the name after creating the object
    public void setName(String name)
    {
      // ??????
      this.name = name;
        
    }
    

    // accessor or getter method that retrieves the data
    public int getAge()
    {
        return age; // ????????
    }
          
    
    // mutator or modifier or setter method
    // This allows us to change the age after creating the object
    public void setAge(int age)
    {
      // ?????????
      this.age = age;

    }
          

    // You should always write a toString() method for a class.
    // It should return the value of the instance variables.
    public String toString()
    {
        // ???????
        return "Name: " + name + "   Age:" + age;
    } 
}

// Lab Chapter 15 Array References, Lab 2
// 2) Main.java and Doggies.java and Dog.java
      
// FINISH ME
// Name: Your full name goes here


import java.util.Arrays;

public class Doggies
{
    // pups will refer to or point to an array of Dog objects.
    // Currently we don't have an array, only a variable that
    // can point to an array of Dog objects.  Right now, 
    // pups contains the special value of null.
    private Dog[] pups;

    // numPups tells us how many pups we actually have
    // in the array.
    int numPups = 0;
 

    // default constructor 
    // We have overloaded constructors!
    // creates an array that can refer to 10 Dog objects
    // and sets numPups to zero.
    public Doggies()
    {
        // point pups at a new array of Dog objects
        // make sure you set up 10 Dog variables for your array
       pups = new Dog[10];

        
        // set your numPups to zero

        numPups = 0;

    }


    // init constructor
    // We have overloaded constructors!
    // creates an array that can refer to size Dog objects
    // and sets numPups to zero.
    public Doggies(int size)
    {
        // point pups at a new array of Dog objects
        // make sure you set up size Dog variables for your array

        pups = new Dog[size];

        
        // set your numPups to zero

        numPups = 0;

    }

    
    public void add(String name, int age)
    {
        // put a new Dog in the array at the next available position 
        // make sure we have an empty slot
        if (numPups < pups.length)
        {
             // create a new Dog and put them in the 

             Dog pup = new Dog(name, age);
             // numPups position
             pups[numPups] = pup;
             
          
             // add 1 to numPups
             numPups += 1;
             
        }
        else
        {
             System.out.println("Sorry no room for " + name + ".  Index out of bounds.");
        }
    }

    
    public String getNameOfOldest()
    {
        // Get the name of the pup in the zero position of pups
        // You will need to call a method (pups[0].????) since 
        // the name field in the Dog class is private.
        String oldestName = pups[0].getName();

      
        // get the age of the pup in the zero position of pups        
        int oldestAge = pups[0].getAge();

        
        // loop through all of the pups

          
        for(int i = 0; i < pups.length; i++)
        {
          
             // for each pup, see if the age is greater than the oldest age
             // if so, update oldestName and oldestAge
             if (pups[i].getAge() > oldestAge)
             {
                  // update the oldestName and oldestAge
                  oldestName = pups[i].getName();
                  oldestAge = pups[i].getAge();               
             }
        }
        
        
        // return the name of the oldest pup
        return oldestName; // fix me!!!!
    } 

    
    public String getNameOfYoungest()
    {
        // ????? fix me
        // see how I did the name of 
        // the oldest
        String youngestName = pups[0].getName();

      
        // get the age of the pup in the zero position of pups        
        int youngestAge = pups[0].getAge();

        
        // loop through all of the pups

          
        for(int i = 0; i < pups.length; i++)
        {
          
             // for each pup, see if the age is greater than the oldest age
             // if so, update oldestName and oldestAge
             if (pups[i].getAge() < youngestAge)
             {
                  // update the oldestName and oldestAge
                  youngestName = pups[i].getName();
                  youngestAge = pups[i].getAge();               
             }
        }
        
        
        // return the name of the oldest pup
        return youngestName; // fix me!!!!; // just kidding
    }

    
    // sets the name of the dog in the spot position to a different name
    public void setName(int spot, String name)
    {
        if (spot >= 0 && spot < pups.length)
        {
             pups[spot].setName(name);
        }     
    }
    

    // sets the name of the dog in the spot position to a different name
    public void setAge(int spot, int age)
    {
        if (spot >= 0 && spot < pups.length) // greater than or equal (GTE)
        {
             pups[spot].setAge(age);
        }     
    }


    // set the dog in the spot position
    // this replaces the current dog 
    // with the new Dog referenced by pup
    public void set(int spot, Dog pup)
    {
        if (spot >= 0 && spot < pups.length) // less than
        {
            pups[spot] = pup;
        }
    }
    

    // get the dog in the spot position
    public Dog get(int spot)
    {
        // ?????
        return pups[spot];
    }
    
    
    // prints all the pups one per line
    public void printPups()
    {
        // loop through all of the pups
        // and print each pup's name and age  (call methods)
      
        for(int i = 0; i < pups.length; i++)
        {
             System.out.println( "Name: " + pups[i].getName() + "   Age: " + pups[i].getAge() );
        }
        
        System.out.println();
    }
    
    
    // returns a list of all the pups
    public String toString()
    {
        return "" + Arrays.toString(pups);
    }
 
    
} // end of class Doggies


