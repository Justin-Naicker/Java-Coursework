import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("The Perimeter of a Triangle");
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line

    // FINISH ME
    System.out.println("Lab C3-02 Written by Justin Naicker");
    System.out.println(); // prints a blank line
    System.out.println(); // prints a blank line
    
  Main triangle = new Main();

  Scanner keyboard = new Scanner(System.in);
  
for (int i = 0; i < 25; i++)
  {
    System.out.print("Enter in the A side:: ");
    int a = keyboard.nextInt();
    System.out.print("Enter in the B side:: ");
    int b = keyboard.nextInt();
    System.out.print("Enter in the C side:: ");
    int c = keyboard.nextInt();

    Triangle tri = new Triangle(a, b, c);

    tri.calcPerimeter();
    System.out.print(a + " ");
    System.out.print(b + " ");
    System.out.print(c + " ");
     System.out.println(" ");
    System.out.println("The area is " + tri.getArea() + " square units." );
  }
  }
}


/*

3  7  10
3  8  9
3  9  11
  */
  
  import java.util.Scanner;

class Triangle
  {

    Scanner keyboard = new Scanner(System.in);
    private double perimeter; 
    private int sideA, sideB, sideC;
    private double area;
    
   public Triangle(int a, int b, int c) {
      sideA = a;
      sideB = b; 
      sideC = c;  
   }

    public void calcPerimeter() {
          perimeter = (sideA + sideB + sideC);
      }

   
    public double getArea() {
      double s = perimeter/2;
       area = (Math.sqrt(s * (s-sideA) * (s-sideB) * (s-sideC) ));

      return area;
      }
  }

/*

3  7  10
3  8  9
3  9  11
  */
