//Financial application: Calculate interest
//Exercise 2.20
import java.util.Scanner;
public class CalculateInterest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter balance and interest rate: ");
double balance = input.nextDouble();
double annualinterestrate = input.nextDouble();

double interest = balance * (annualinterestrate / 1200);
System.out.println("The interest is " + interest);
}
} 