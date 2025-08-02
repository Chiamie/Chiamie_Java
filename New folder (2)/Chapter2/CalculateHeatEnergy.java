//Science: calaculating energy
//Exercise 2.10
import jav.util.Scanner;
public class CalculateHeatEnergy {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of water in kilograms: ");
double amountofwater = input.nextDouble();
System.out.print("Enter the initial temperature in degrees celsius: ");
double initialtemp = input.nextDouble();
System.out.print("Enter the final temperature in degrees celsius: ");
double finaltemp = input.nextDouble();

double heatenergy = amount of water * (finaltemp - initialtemp) * 4184;
System.out.println("The energy needed is " + heatenergy + " joules");
}
}