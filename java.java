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

//Reassigning Instance Fields

public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  // increase price method
  public void increasePrice(double priceToAdd){
  double newPrice = price  + priceToAdd;
  price = newPrice; 
  }
  // main method
  public static void main(String[] args) {
 Store lemonadeStand = new Store("Lemonade", 3.75);
  System.out.println(lemonadeStand.price);
  lemonadeStand.increasePrice(1.5);
  System.out.println(lemonadeStand.price);
    
  }
}

//If-Then-Else

public class Order {
  
  public static void main(String[] args) {
    
    boolean isFilled = false;
    
    // Write an if-then-else statement:
    if(isFilled){
      System.out.println("Order not ready");
    }else{
      System.out.println("Shipping");
    }  
  }  
}

//If-Then-Else-If

public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
	 	// declare conditional statement here
 if (shipping.equals("Regular")) {
      return 0;
 }
 else if (shipping.equals("Express")){
    return 1.75;
} 
 else {
 return .50;
  }
    
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}
