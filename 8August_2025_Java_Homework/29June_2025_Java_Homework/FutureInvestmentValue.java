//Financial application: calaculate future investment value
//Exercise 2.21
import java.util.Scanner;
public class FutureInvestmentValue {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the investment amount: ");
double investamount = input.nextDouble();
System.out.print("Enter the annual interest rate in percentage: ");
double annualinterestrate = input.nextDouble();
System.out.print("Enter the number of years: ");
double numberofyears = input.nextDouble();

double futureinvestmentvalue = investamount * Math.pow((1 + (annualinterestrate / 1200)), numberofyears * 12);
System.out.printf("Accumulated value is $%.2f", futureinvestmentvalue);

}
}