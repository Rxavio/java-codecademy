public class Review{
  public static void main(String[] args) {
    //The main method executes the tasks of the class
    System.out.println("My first Java program from scratch!");
    }

}


// Define your tree class in this file!
public class Tree{
  public static void main(String[] args) {
   //Introduce yourself to users and plant a tree for them! 
 System.out.println("Hey there, I’m Xavier and I’m learning to code in Java!"); 

  System.out.println("I’m going to plant a tree today!"); 

  System.out.println("  *  ");
  System.out.println(" *** ");
  System.out.println(" *** ");
  System.out.println("  *  ");
  System.out.println("  *  ");


  System.out.println(" * ** *");
  System.out.println(" ******");
  System.out.println("  **** ");
  System.out.println("   **  ");
  System.out.println("   **  ");  
  System.out.println(" ~~~~~~~~~ ");  


 
  System.out.println(" *****");
  System.out.println(" *****");
  System.out.println(" *****");
  System.out.println("   *  ");  
   System.out.println("   *  "); 
  System.out.println(" ######## "); 
    }

}


public class MyProfile {
	public static void main(String[] args) {  
    String name = "Xavier"; 
    int age = 77;
    double desiredSalary = 7000000000.99;
    char gender = 'm';
    boolean lookingForJob = true;

	}
}


public class Creator {
	public static void main(String[] args) {
    String name = "James Gosling";
    int yearCreated = 1995;
  System.out.println(name);  
  System.out.println(yearCreated);
	}
}


public class Dog {
  String breed;
  boolean hasOwner;
  int age;
  
  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4);
    Dog nunzio = new Dog("shiba inu", true, 12);
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}


public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }

  public void greetCustomer(String customer) {
  System.out.println("Welcome to the store, " + customer + "!");
}
  
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    lemonadeStand.greetCustomer("kalim");
    
  }
}