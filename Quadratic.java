import java.util.Scanner;

class Main {
    public static void main(String[] args) {

    QuadraticRunner object = new QuadraticRunner();

     object.invokeMethod();
 
  }
}


/*
5 -8 3 
3 2 -7 
9 6 1
*/

import java.util.Scanner;

class QuadraticRunner {

 Scanner scanner = new Scanner(System.in);
 
  
    public void invokeMethod()
  {

  for (int i = 0; i < 10; i++)
    {
    System.out.print("Enter a:: ");   
    int a = scanner.nextInt();
    System.out.print("Enter in b:: ");
    int b = scanner.nextInt();
    System.out.print("Enter in c:: ");
    int c = scanner.nextInt();
    
    int obj1 = (b*b) - (4*a*c);
    System.out.println("Root 1: " + ((-1 * b) + (Math.sqrt(obj1)))/(2*a));
    System.out.println("Root 1: " + ((-1 * b) - (Math.sqrt(obj1)))/(2*a));
    System.out.println(" ");
    }
  }
}

/*
5 -8 3 
3 2 -7 
9 6 1
*/
