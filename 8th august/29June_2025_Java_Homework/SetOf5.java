import java.util.Scanner;
public class SetOf5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a set of 5 integers: ");
int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt(), num4 = input.nextInt(), num5 = input.nextInt();

int largest = num1;
if(num2 > largest) largest = num2;
if(num3 > largest) largest = num3;
if(num4 > largest) largest = num4;
if(num5 > largest) largest = num5;
System.out.println("The largest number is " + largest);

int smallest = num1;
if(num2 < smallest) smallest = num2;
if(num3 < smallest) smallest = num3;
if(num4 < smallest) smallest = num4;
if(num5 < smallest) smallest = num5;
System.out.println("The smallest number is " + smallest);

}
}