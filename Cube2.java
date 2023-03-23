import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 10; i++)
      {
    System.out.print("Enter a side: ");
    int side = scanner.nextInt();
    System.out.println("Cube Area is:: " + (double)(6*(side*side)));
      }
  }
}

/*112
4
33
50
5
19
111*/
