import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  Distance object = new Distance();
    object.invokeMethod();
  }
}

/*1 1 2 1 
1 1 -2 2 
1 1 0 0*/

import java.util.Scanner;

class Distance {

  Scanner scanner = new Scanner(System.in);

  public void invokeMethod()
  {
    for (int i = 0; i < 10; i++)
      {
  System.out.print("Enter in your X1 value: ");
  int x1 = scanner.nextInt();
  System.out.print("Enter in your Y1 value: ");
  int y1 = scanner.nextInt();
  System.out.print("Enter in your X2 value: ");
  int x2 = scanner.nextInt();
  System.out.print("Enter in your Y2 value: ");
  int y2 = scanner.nextInt();

  System.out.println("Distance == " + (Math.sqrt((x2 - x1)*(x2-x1) + ((y2-y1)*(y2-y1)))));
  }
  }
}
/*1 1 2 1 
1 1 -2 2 
1 1 0 0*/
