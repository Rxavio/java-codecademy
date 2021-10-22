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


//Nested Conditional Statements

public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;
  
  public Order(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
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
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      // Add your code here
      if (couponCode .equals("ship50")){
        return .85;
      }
      else{
       return 1.75; 
      }
  
    } else {
      return .50;
    }
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express", "ship50");
    Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
    
    book.ship();
    chemistrySet.ship();
  }
}

//switch
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
    double shippingCost;
   	 	// declare switch statement here
     switch (shipping) {

    case "Regular": 
    shippingCost = 0;
    break; 

     case "Express": 
    shippingCost = 1.75;
    break; 
    default:
     shippingCost = .50;
     }

    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}

//A Simple Car Loan Payment Calculator
public class CarLoan {
	public static void main(String[] args) {
    /*
  write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan
 program will include the following:

Car loan amount
Interest rate of the loan
Length of the loan (in years)
Down payment
    */
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment =2000;

if (loanLength <= 0 || interestRate <= 0) {
  System.out.println("Error! You must take out a valid car loan."); 
}
else if (downPayment > carLoan) {
System.out.println("The car can be paid in full.");
}
else{
  int remainingBalance=carLoan - downPayment;
  int months=loanLength * 12;
  int monthlyBalance=remainingBalance / months;
  int interest=monthlyBalance * interestRate/100;
  int monthlyPayment=monthlyBalance + interest;
  System.out.println(monthlyPayment);
}
}
}
//Continents and Cities

public class Continents {
	public static void main(String[] args) {
/*
Write a Continents.java program that will print out a continent and the largest city in that continent, based on the value of an integer.
*/
int continent = 4;
switch (continent){
  case 1:
System.out.println("North America: Mexico City, Mexico");
break;
case 2:
System.out.println("South America: Sao Paulo, Brazil");
break;
case 3:
System.out.println("Europe: Moscow, Russia");
break;
case 4:
System.out.println("Africa: Lagos, Nigeria");
break;
case 5:
System.out.println("Asia: Shanghai, China");
break;
case 6:
System.out.println("Australia: Sydney, Australia");
break;
case 7:
System.out.println("Antarctica: McMurdo Station, US");
break;
default:
System.out.println("Undefined continent!");
}
}
}


//LEARN JAVA: ARRAYS Review
import java.util.Arrays;

public class Classroom {
  
  public static void main(String[] args){
String [] students={"Sade","Alexus","Sam","Koma"};
double[] mathScores=new double[4];
mathScores[0]=94.5;
mathScores[2]=76.8;
System.out.println("The number of students in the class is "+ mathScores.length);
    
  }
}

//String[] args

import java.util.Arrays;

public class Newsfeed {
  
  String[] topics;
  
  public Newsfeed(String[] initialTopics) {
		topics = initialTopics;
  }
  
  public static void main(String[] args) {
		Newsfeed feed;
    if (args[0].equals("Human")) {
      
      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new Newsfeed(humanTopics);
      
    } else if(args[0].equals("Robot")) {
      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Newsfeed(robotTopics);
      
    } else {
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Newsfeed(genericTopics);
    }
        
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}

//LEARN JAVA: ARRAYS Length

import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public int getNumTopics(){
    return topics.length;
    
  }
  
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
   
  }
}

//Creating an Empty Array

import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;
  
  public Newsfeed(){
    // Initialize favoriteArticles here:
    favoriteArticles = new String[10];
    
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    // Add newArticle to favoriteArticles:
 favoriteArticles[favoriteIndex] = newArticle;
    
    
  }
    
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");
    
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
  }
}
//Get Element By Index

import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public String getTopTopic(){
   return topics [0];
    
  }
  
  public void viewTopic(int topicIndex){  
     views[topicIndex] = views[topicIndex] + 1;

    
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
System.out.println("The top topic is "+ sampleFeed.getTopTopic());

    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
  }
}

//LEARN JAVA: ARRAYLISTS Adding an Item
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
 ArrayList<String> toDoList = new ArrayList<String>();
 
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = "code array2";
    String toDo3 = "code array3";
    // Add to-dos to toDoList
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    System.out.println(toDoList);  
  }
  
}

//ArrayList Size
import java.util.ArrayList;
class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
     System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());
    
      
    // Print the name of the detective with the larger to-do list:
    System.out.println("Poirot");
    
  }
  
}



//Accessing an Index
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));

    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's second to-do:
  System.out.println(poirotsToDos.get(1));
     
  }
  
}
//LEARN JAVA: ARRAYLISTS Changing a Value
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Set each to-do below:
sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
poirotsToDos.set(3, "listen to Captain Hastings for amusement");
    
    
    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());
  }
  
}
//Removing an Item
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    sherlocksToDos.remove("visit the crime scene");
    
    // Calculate to-dos until case is solved:
    
      
    // Change the value printed:
    System.out.println("PRINT THE ANSWER HERE");

  }
  
}

//Desert Island Playlist

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    // creating playlist
ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    // adding songs to playlist
desertIslandPlaylist.add("my universe");//removed
desertIslandPlaylist.add("no guidance");
desertIslandPlaylist.add("look at me now");
desertIslandPlaylist.add("loyal");
desertIslandPlaylist.add("dont check on me");//removed
desertIslandPlaylist.add("heat");
desertIslandPlaylist.add("go crazy");
  // printing playlist
   // System.out.println(desertIslandPlaylist);
    
    // checking playlist size
     //System.out.println(desertIslandPlaylist.size());

       // removing songs
desertIslandPlaylist.remove("my universe");
 desertIslandPlaylist.remove("dont check on me");

 System.out.println(desertIslandPlaylist.size());
 System.out.println(desertIslandPlaylist);

    // swapping songs
int indexA = desertIslandPlaylist.indexOf("no guidance");
int indexB = desertIslandPlaylist.indexOf("heat");

String tempA = "no guidance";
desertIslandPlaylist.set(indexA, "heat");

// System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
  
  }
  
}

//LEARN JAVA: ARRAYLISTS Review

import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {ArrayList<String> toDoTest = new ArrayList<String>();

  toDoTest.add("test1");
  toDoTest.add("test2");
  toDoTest.add("test3");
 System.out.println(toDoTest.size());
 System.out.println(toDoTest.get(2));

 toDoTest.set(0, "Lucy1");
System.out.println(toDoTest.get(0));
 toDoTest.remove(2);
 System.out.println(toDoTest);
System.out.println(toDoTest.indexOf("Lucy1"));

    
  }
  
}
//LEARN JAVA: METHODS Returns

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
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  // get price with tax method
public double getPriceWithTax(){
double totalPrice = price + price * 0.08;
return totalPrice;
  }
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
 double lemonadePrice= lemonadeStand.getPriceWithTax(); 
 System.out.println(lemonadePrice); 
  }
}

//Adding Parameters

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



//LEARN JAVA: METHODS The toString() Method
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
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

public String toString(){
return "This store sells " + productType + " at a price of " + price + ".";
  }
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);

    System.out.println(cookieShop);
    System.out.println(lemonadeStand);

  }
}
//LEARN JAVA: METHODS Review

public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+balance);
  }
  
  public void deposit(int amountToDeposit){
    balance = amountToDeposit + balance;
    System.out.println("You just deposited " + amountToDeposit);
  }
  
  public int withdraw(int amountToWithdraw){
    balance = balance - amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public String toString(){
    return "This is a savings account with " + balance + " saved.";
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    System.out.println(savings);
  }       
}


/*
A Basic Calculator
In this project, you will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

Add two integers
Subtract two integers
Multiply two integers
Divide two integers
Apply the modulo operator on two integers
*/
public class Calculator{
// constructor method
public Calculator() {
  }
//add
public int add(int a, int b){
int sum=a+b;
return sum;
  } 
  //sub 
public int subtract(int a, int b){
int difference=a-b;
return difference;
  }
  //mult
 public int multiply(int a, int b){
int product=a*b;
return product ;
  }
  //div
public int divide(int a, int b){
int quotient=a/b;
return quotient ;
  }
 //div
public int modulo(int a, int b){
int result=a%b;
return result ;
  }
 public static void main(String[] args){
 Calculator  myCalculator = new Calculator ();
 System.out.println(myCalculator.add(5, 7));
 System.out.println(myCalculator.subtract(45, 11));
  System.out.println(myCalculator.multiply (5, 7));
   System.out.println(myCalculator.divide (35, 7));
System.out.println(myCalculator.modulo (5, 2));

} 
}

//JAVA I Build A Droid

public class Droid{
 String name;
 int batteryLevel;

 public Droid (String droidName) {
  name = droidName;
  batteryLevel = 100;
    }
public String toString(){
    return ("Hello, I'm the droid:" + name);
  }  

 public void performTask(String task){
    System.out.println(name + " is performing  task " + task);
    batteryLevel -=10;
      }  
public void energyReport(){
        System.out.println("The current battery level is: " + batteryLevel);
        }

  public void energyTransfer(){    
    System.out.println("The current battery level is: " + batteryLevel);
  }    

 public static void main(String[] args) {
  Droid codey  = new Droid("Codey");
  System.out.println(codey);

  codey.performTask ("dancing.");
   codey.energyReport();
    codey.energyTransfer();
 
  }
}
//LEARN JAVA: LOOPS

// Importing the Random library
import java.util.Random;

class LuckyFive {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // Repeat while roll isn't 5
    while (dieRoll != 5) {
  // code goes here
    System.out.println(dieRoll);
		dieRoll = randomGenerator.nextInt(6) + 1;
 }
 }
}

//Incrementing While Loops
class Coffee {
  
  public static void main(String[] args) {
    
    // initialize cupsOfCoffee
    int cupsOfCoffee = 1;
    
    // add while loop with counter
    while (cupsOfCoffee <= 100) {
 System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);

   cupsOfCoffee++;
 
}
    
        
    
  }
  
}

//for 

for (int i = 0; i < 5; i++) {
 
  // code that will run
  System.out.println(i);
 
}


//LEARN JAVA: LOOPS Iterating Over Arrays and ArrayLists

import java.util.ArrayList;

class CalculateTotal {
  
  public static void main(String[] args) {
    
ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    //System.out.println(expenses.size());
    
    double total = 0;
    
 // Iterate over expenses
 for (int i = 0; i < expenses.size(); i++) {
   total += expenses.get(i);
}
 System.out.println(total);  
  }
  
}

//LEARN JAVA: LOOPS break and continue

class Numbers {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      // Add your code below
      // System.out.println(i);
      if (i%5!=0) {
    continue;
  }
     System.out.println(i);
  
    }
  }
}
