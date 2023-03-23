class Main {
  public static void main(String[] args) {

    MilesPerHour object = new MilesPerHour();

    object.invokeMethod();
    
  }
}
/* 45 0 32
96 1 43
100 2 25
50 2 25 */

import java.util.Scanner;

class MilesPerHour {

    Scanner object = new Scanner(System.in);

    public void invokeMethod()
      {
      for (int i = 0; i < 10; i++)
        {
    System.out.print("Enter the distance: ");
    int distance = object.nextInt();
    
    System.out.print("Enter the hours: ");
    double hours = object.nextDouble();
      
    System.out.print("Enter the minutes: ");
    double minutes = object.nextDouble();

    var totalTime = hours + (minutes/60);
    
    System.out.println(distance + " miles in " + ((int) hours) + " hour and "  + ((int) minutes) + " minutes " + " = " + ((int)(distance/totalTime) + " MPH"));
          
      }
    }
}   

/* 45 0 32
96 1 43
100 2 25
50 2 25 */
