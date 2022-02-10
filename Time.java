import java.util.Scanner;

class Time {
public static void main(String args[]) 
throws java.io.IOException {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the time you want to go to the garden(Military Time): ");
int time = Integer.parseInt(sc.nextLine());
System.out.println("The time you want to go to the garden is " + time);
 }
}
