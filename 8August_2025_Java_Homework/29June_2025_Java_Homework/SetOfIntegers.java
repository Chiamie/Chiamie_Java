//A program that reads a set of integers
//Prints the sum of the even and odd numbers
import java.util.Scanner;
public class SetOfIntegers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter 8 integers: ");
int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt(), num4 = input.nextInt();
int num5 = input.nextInt(), num6 = input.nextInt(), num7 = input.nextInt(), num8 = input.nextInt();

int evensum = 0;
if(num1 % 2 == 0) evensum += num1;
if(num2 % 2 == 0) evensum += num2;
if(num3 % 2 == 0) evensum += num3;
if(num4 % 2 == 0) evensum += num4;
if(num5 % 2 == 0) evensum += num5;
if(num6 % 2 == 0) evensum += num6;
if(num7 % 2 == 0) evensum += num7;
if(num8 % 2 == 0) evensum += num8;
	System.out.println("Sum of even numbers: " + evensum);
	
int oddsum = 0;
if(num1 % 2 == 1) oddsum += num1;
if(num2 % 2 == 1) oddsum += num2;
if(num3 % 2 == 1) oddsum += num3;
if(num4 % 2 == 1) oddsum += num4;
if(num5 % 2 == 1) oddsum += num5;
if(num6 % 2 == 1) oddsum += num6;
if(num7 % 2 == 1) oddsum += num7;
if(num8 % 2 == 1) oddsum += num8;
	System.out.println("Sum of odd numbers: " + oddsum);
}
}