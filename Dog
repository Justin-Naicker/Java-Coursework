

class Main {
  public static void main(String[] args) {
    System.out.println("Dog Years");
    System.out.println(); 
    System.out.println(); 


    System.out.println("Lab C3-01 Written by Justin Naicker");
    System.out.println(); 
    System.out.println();  
    
    Dog d = new Dog( "rover" );

System.out.println( d.getPeopleAge( 7 ) );
d.increaseAgeByOne();
d.increaseAgeByOne();
System.out.println( d.getPeopleAge( 11 ) );
System.out.println( d.getName() );
d.increaseAgeByOne();
d.increaseAgeByOne();
d.increaseAgeByOne();
d.increaseAgeByOne();
System.out.println( d.getPeopleAge( 8 ) );
Dog g = new Dog( "bob", 3 );
System.out.println( g.getName() );
System.out.println( g.getPeopleAge( 5 ) );
System.out.println(g.toString());

    
  }
}

class Dog{

private int age;
  private String name;
  
   
  public Dog( String n )  
  {
    age = 1;
    name = n;
  }

  public Dog( String n, int a )  
  {
    age = a;
    name = n;
  }

  public void increaseAgeByOne()
  {
    age = age + 1;
  }

  public int getPeopleAge( int peopleYears )
  { 
    return peopleYears * age;  // change me
  }

public int getAge()    
  {      
    return age;   // change me
  }

  public String getName()    
  {   
    return name;   // change me
  }

  public String toString()    
  {
    return "Dog - " + this.name + " " + this.age;
  }
  
  
}
