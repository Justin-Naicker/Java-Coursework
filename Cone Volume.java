import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int radius, height;

    for (int i = 0; i < 10; i++)
      {
      System.out.print("Enter the radius :: ");
      radius = keyboard.nextInt();
      System.out.print("Enter the height :: ");
      height = keyboard.nextInt();
      System.out.println("The volume is: " + ((radius * radius) * height) * (0.33333) * 3.14159);
  }
  }
}

/*

44 43 93 13 15 77 1.5 3 1.5 5
  */
