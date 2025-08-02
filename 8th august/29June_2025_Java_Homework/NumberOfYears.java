//Find the number of years
//Exercise 2.7
import java.util.Scanner;
public class NumberOfYears {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of minutes: ");

int minutes = input.nextInt();
int day = minutes / 1440;
int remainingminutes = minutes % 1440;
int numberofyears = day / 365;
int remainingdays = day % 365;

System.out.print(minutes + "minutes is " + numberofyears + "years and" + remainingdays + "days");
}
}