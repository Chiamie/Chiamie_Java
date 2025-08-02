//Find the number of years
//Exercise 2.7
import java.util.Scanner;
public class NumberYears {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
int minutes = input.nextInt();
//double numberofyears = (int) (numberofminutes / 1440) * 365;
int numberofyears = (minutes / 1440) / 365;
int remainingdays = (minutes % 1440) % 365;

System.out.print(minutes + "minutes is " + numberofyears + "years and" + remainingdays + "days");
}
}
