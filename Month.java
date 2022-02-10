import java.util.Scanner;

class Month {
public static void main(String args[]) 
throws java.io.IOException {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number for the month you want to to go to the garden: ");
int month = Integer.parseInt(sc.nextLine());
System.out.println("The month you want to go to the garden is " + month);
 }
}
