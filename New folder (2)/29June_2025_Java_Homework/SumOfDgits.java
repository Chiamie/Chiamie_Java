//Sum the digits in an integer
//Exercise 2.6
import java.util.Scanner;
public class SumOfDgits {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer from 0 and 1000: ");
int number = input.nextInt();

int number1;
if(number >= 0) number1 = number;
if(number <= 1000) number1 = number;

int digit1 = number / 100;
int digit2 = (number % 100) / 10;
int digit3 = (number % 10);
System.out.printf("The sum of the digits of your number is %d", digit1 + digit2 + digit3);
}
}

