import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double radius;

    for (int i = 0; i < 10; i++)
      {
      System.out.print("Enter the radius :: ");
      radius = keyboard.nextDouble();
      System.out.println("The volume is: " + ((radius * radius)) * 3.1416);
  }
 
  }
}

/*
7.5
10
72.534
55
101 99.952*/
