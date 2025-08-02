//Cost of driving
//Exercise 2.23
import java.util.Scanner;
public class CostOfDriving {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the driving distance: ");
double drivingdistance = input.nextDouble();
System.out.print("Enter the fuel efficiency in miles per gallon: ");
double fuelefficiency = input.nextDouble();
System.out.print("Enter the fuel price per gallon: ");
double fuelprice = input.nextDouble();

double costofdriving = (drivingdistance / fuelefficiency) * fuelprice;
System.out.println("The cost of driving is " + costofdriving);
}
}
