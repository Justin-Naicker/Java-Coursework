import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  int x1, y1, x2, y2;
    System.out.println("Justin Naicker");
    System.out.println("");
    System.out.println("Slope.java");
    System.out.println("");
    System.out.println("Slope of a line");
    System.out.println("");

    for (int i = 0; i < 4; i++)
      {
        System.out.println("");
    System.out.print("Enter x1: ");
    x1 = scanner.nextInt();
    System.out.print("Enter y1: ");
    y1 = scanner.nextInt();
    
    System.out.println("");

    System.out.print("Enter x2: ");
    x2 = scanner.nextInt();
    System.out.print("Enter y2: ");
    y2 = scanner.nextInt();

    System.out.print("The slope of the line is " + (double)((y2-y1)/(x2-x1)));
        System.out.println("");
      }
  }
}
