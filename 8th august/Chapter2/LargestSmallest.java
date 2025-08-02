//Exercise 2.15: Arithmetic, Smallest and Largest
//Calaculating sum, average, product, maximum and minimum of the three numbers
//Prompted User to input the three numbers

import java.util.Scanner;
public class LargestSmallest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your first integer; ");
int x = input.nextInt();
System.out.print("Enter your second integer; ");
int y = input.nextInt();
System.out.print("Enter your third integer; ");
int z = input.nextInt();
int sum = x + y + z;
System.out.printf("The Sum of your three numbers is %d%n", sum);
int ave = sum / 3;
System.out.printf("The Average of your three numbers is %d%n", ave);
int pro = x * y * z;
System.out.printf("The Product of your three numbers is %d%n", pro);

	//if (x > y > z ) cannot be executed in java because relational operators compare two operands
	//Read as x is greater than y and y is greater than z: 'and' in java is &&
if (x > y && y > z ) 
	System.out.printf("%d is the largest number and %d is the smallest number", x, z);
if (x > z && z > y )
	System.out.printf("%d is the largest number and %d is the smallest number", x, y);
if (y > x && x > z )
	System.out.printf("%d is the largest number and %d is the smallest number", y, z);
if (y > z && z > x )
	System.out.printf("%d is the largest number and %d is the smallest number", y, x);
if (z > x && x > y)
	System.out.printf("%d is the largest number and %d is the smallest number", z, y);
if (z > y && y > x)
	System.out.printf("%d is the largest number and %d is the smallest number", x, z);
}
}