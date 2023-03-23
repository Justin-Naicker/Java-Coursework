class Main {
  public static void main(String[] args) {
    StarsAndStripes object = new StarsAndStripes();
    object.printASmallBox();
    object.printTwoBlankLines();
    object.printALargeBox();
    
  }
}


class StarsAndStripes {

    public StarsAndStripes()
      {
      System.out.println("StarsAndStripes\n\n");
      }
    
  public void printTwentyStars()
    {
      System.out.println("********************");
    }

  public void printTwentyDashes()
  {
    System.out.println("--------------------");
  }

  public void printTwoBlankLines()
  {
    System.out.println(" ");
    System.out.println(" ");
  }

  public void printASmallBox()
  {
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
  }

  public void printALargeBox()
  {
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
    printTwentyStars();
    printTwentyDashes();
  }
}
