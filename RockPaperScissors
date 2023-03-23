import java.util.Scanner;


public class Main // RPSRunner
{
  public static void main(String args[])
  {
    System.out.println("Rock, Paper, Scissors");
    System.out.println();
    
    // PLEASE PUT YOUR NAME ON YOUR LAB
    System.out.println("Written by Justin Naicker");
    System.out.println();
    System.out.println();
    
    
    // Create a Scanner object and pass it
    // System.in
    Scanner keyboard = new Scanner(System.in);
    
    // The variable play is set to "Y" to let us
    // play the game.
    String play = "Y";
    
    // while play is "Y" or play is "y" we will play
    while (play.equals("Y") ||play.equals("y"))
    {
       // Prompt the user to enter R, P, or S
       System.out.println("Enter in R, P or S:: ");
       
       // Read in the user input
       String input = keyboard.next();
             
       // Create a RockPaperScissors object and pass it the user input
       RockPaperScissors test = new RockPaperScissors(input);
       
       System.out.println();
       System.out.println(test.toString());
       System.out.println();
     
       System.out.println(test.determineWinner()+"\n");
       System.out.println();

       // Prompt the user to see if they want to play again (Y,N)
       System.out.println("Would you like to play again?:: ");

       // Read in the user response
       play = keyboard.next();
       
       System.out.println();
    } // end of while 

    System.out.println();
    System.out.println("Thank you for playing RPS!");
    System.out.println();
    
  } // end of method main()
  
} // end of class Main


// Define a class called RockPaperScissors
class RockPaperScissors
{
  // instance variables (always retain the data)
  // Also known as fields, properties, attributes,
  // global variables (global to the object), records
  
  // Declare an instance variable called 
  // playerChoice of type String.
  // Don't forget to make it private!
  private String playerChoice;

  // Declare an instance variable called 
  // computerChoice of type String.
  // Don't forget to make it private!
  private String computerChoice;



  // Write a default constructor.
  // REMEMBER, a constructor has the same name
  // as the class.
  // Set playerChoice to the empty String.
  // Set computerChoice to the empty String.  
  
  public RockPaperScissors()
  {
    playerChoice = "";
    computerChoice = "";
  } // end of constructor RockPaperScissors()


  // Constructor to initialize your instance variables.
  // REMEMBER, a constructor has the same name
  // as the class.
  public RockPaperScissors(String player)
  {
    // this will get a random number between 0 and 2 inclusive
    int choice = (int)(Math.random()*3);

    
    // if the choice is 0, then 
    // set computerChoice to "R";
    
    // else if the choice is 1, then 
    // set computerChoice to "P";
    
    // else if the choice is 2, then 
    // set computerChoice to "S";
    
    if (choice == 0)
    {
      computerChoice = "R";
    }
    else if (choice == 1)
    {
      computerChoice = "S";
    }
    else if (choice == 2)
    {
      computerChoice = "P";
    }
      
    
    
    // Set the playerChoice to 
    // the value of player.
    playerChoice = player;
  } // end of constructor RockPaperScissors()

  
  public String determineWinner()
  {
    // The String winner will hold 
    // the info about who won. 
    // Define a variable called winner
    // and set it to the empty String.
    // This is a local variable that belongs
    // only to this method.
    String winner = "";
    
    
    if(computerChoice.equals(playerChoice))
    {
      winner = "Draw Game!";
    }
    
    else if(computerChoice.equals("R"))
    {
      if (playerChoice.equals("P"))
      {
        // The player wins, so set the winner
        // variable to say that the player wins and 
        // how they won (Paper covers Rock)
        
      winner = "Player Wins, PAPER covers ROCK";

      }
      else if(playerChoice.equals("S"))
      {
        // The computer wins, so set the winner
        // variable to say that the computer wins and 
        // how they won (Rock breaks scissors)

        winner = "Computer Wins, ROCK breaks SCISSORS";
        
      }
    } // end of else if(computerChoice.equals("R"))
    
    else if(computerChoice.equals("P"))
    {
    if (playerChoice.equals("R"))
    {
      winner = "Computer Wins, PAPER covers ROCK";
        
    }  
      else if (playerChoice.equals("S"))
      {
        winner = "Player Wins, SCISSORS cuts PAPER";
        
      }
    } // end of else if(computerChoice.equals("P"))
    
    else if(computerChoice.equals("S"))
    {
       if (playerChoice.equals("R"))
       {
         winner = "Player Wins, ROCK breaks SCISSORS";
        
       }
      else if (playerChoice.equals("P"))
      {
        winner = "Computer Wins, SCISSORS cuts PAPER";
        
      }
    } // end of else if computerChoice.equals("S")
    
    // return your winner
    return winner;
  } // end of method determineWinner()

  
  // The toString() method returns information about the
  // instance variables.
  public String toString()
  {
    String output = "";
    output += "Player choice:   " + playerChoice+"\n";
    output += "Computer choice: " + computerChoice;
    return output;
  } // end of method toString()
  
} // end of class RockPaperScissors 

