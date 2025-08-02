//Physics:acceleration
//Exercise 2.9
import java.util.Scanner;
public class Acceleration {
public static void main(String [] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the value for initial velocity: ");
double v1 = input.nextDouble();
System.out.print("Enter the value for final velocity: ");
double v2 = input.nextDouble();
System.out.print("Enter the value for time taken to make the change: ");
double t = input.nextDouble();
System.out.printf("The average accereleration is %f%n", (v2 - v1) / t );
}
}