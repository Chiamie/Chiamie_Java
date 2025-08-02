//Exercise 2.24
// Print a program that displays the largest and smallest Integers
import java.util.Scanner;
public class Smallarge {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your first interger: ");
int num1 = input.nextInt();
System.out.print("Enter your second integer: ");
int num2 = input.nextInt();
System.out.print("Enter your third integer: ");
int num3 = input.nextInt();
System.out.print("Enter your fourth integer: ");
int num4 = input.nextInt();
System.out.print("Enter your fifth integer: ");
int num5 = input.nextInt();

int largest = num1;
if (num2 > largest) largest = num2;
if (num3 > largest) largest = num3;
if (num4 > largest) largest = num4;
if (num5 > largest) largest = num5; 
System.out.println(largest);

int smallest = num1;
if (num2 < smallest) smallest = num2;
if (num3 < smallest) smallest = num3;
if (num4 < smallest) smallest = num4;
if (num5 < smallest) smallest = num5;
System.out.println(smallest);
}
}
