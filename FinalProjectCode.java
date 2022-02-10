import java.util.Scanner;

//introduces the user to the program
class Introduction {
  System.out.println("Welcome to the Moreno Valley Community Garden Program!);
}

// tells the user to input their name and displays what they typed
class Name {
 public static void main(String args[])
 throws java.io.IOException {
 chars na;
 System.out.println("Enter your first and last name: ");
 na = (chars) System.in.read();
 System.out.println("Name: " + na);
 }
}

// tells the user to input their name phone number and displays what they typed
class Number {
 public static void main(String args[])
 throws java.io.IOException {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter your phone number: ");
 int number = Integer.parseInt(sc.nextLine());
 System.out.println("Phone Number: " + number);
 }
}

// tells the user to input their email address and displays what they typed
class EmailAddress {
 public static void main(String args[])
 throws java.io.IOException {
 chars ea;
 System.out.println("Enter your email address: ");
 ea = (chars) System.in.read();
 System.out.println("Email Address: " + ea);
 }
}

// tells the user to put the month they want to go to the garden and displays what they typed
class Month {
public static void main(String args[]) 
throws java.io.IOException {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number for the month you want to to go to the garden: ");
int month = Integer.parseInt(sc.nextLine());
System.out.println("The month you want to go to the garden is " + month);
 }
}

// tells the user to put the day they want to go to the garden and displays what they typed
class Day {
public static void main(String args[]) 
throws java.io.IOException {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the day of the month you want to go to the garden: ");
int day = Integer.parseInt(sc.nextLine());
System.out.println("The day of the month you want to go to the garden is " + day);
 }
}

// tells the user to put the time they want to go to the garden and displays what they typed
class Time {
public static void main(String args[]) 
throws java.io.IOException {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the time you want to go to the garden(Military Time): ");
int time = Integer.parseInt(sc.nextLine());
System.out.println("The time you want to go to the garden is " + time);
 }
}

// asks the user how much they are willing to donate and will display the number they put
class Donations {
public static void main(String args[])
throws java.io.IOException {
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the corresponding number for how much you will be willing to donate to the garden. 0 = Nothing, 1 = $1, 2 = $5, 3 = $10, 4 = $20, 5 = $50, 6 = $100");
int x = Integer.parseInt(sc.nextLine());
for(x = 0;x<7; x++) {
 if(x==1)
  System.out.println("You are willing to donate $1");
 else if(x==2)
   System.out.println("You are willing to donate $5");
 else if(x==3)
  System.out.println("You are willing to donate $10");
 else if(x==4)
  System.out.println("You are willing to donate $20");
 else if(x==5)
  System.out.println("You are willing to donate $50");
 else if(x==6)
  System.out.println("You are willing to donate $100");
 else
 System.out.println("You do not want to donate today");
  }
 }
}
