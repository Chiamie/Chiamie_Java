//Class Work
import java.util.Scanner;
public class Scores {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your first integer: ");
int num1 = input.nextInt();
System.out.print("Enter your second integer: ");
int num2 = input.nextInt();
System.out.print("Enter your third integer: ");
int num3 = input.nextInt();
System.out.print("Enter your fourth integer: ");
int num4 = input.nextInt();
System.out.print("Enter the fifth integer: ");
int num5 = input.nextInt();

int largest = num1;
if(largest < num2) largest = num2;
if(largest < num3) largest = num3;
if(largest < num4) largest = num4;
if(largest < num5) largest = num5;
	System.out.println("Largest: " + largest);
	
int secondlargest = -2_147_483_648;	//This is the smallest value an int variable can hold
if(num1 != largest && num1 > secondlargest) secondlargest = num1;
if(num2 != largest && num2 > secondlargest) secondlargest = num2;
if(num3 != largest && num3 > secondlargest) secondlargest = num3;
if(num4 != largest && num4 > secondlargest) secondlargest = num4;
if(num5 != largest && num5 > secondlargest) secondlargest = num5;
	System.out.printf("%d is the second largest", secondlargest);





//if(largest > num2 && num2 > num3 && num2 > num4 && num2 > num5)
	//System.out.printf("%d is the second largest", num2);
//if(largest > num3 && num3 > num2 && num3 > num4 && num3 > num5)
	//System.out.printf("%d is the second largest", num3);
//if(largest > num4 && num4 > num2 && num4 > num3 && num4 > num5)
	//System.out.printf("%d is the second largest", num4);
//if(largest > num5 && num5 > num2 && num5 > num3 && num5 > num4)
	//System.out.printf("%d is the second largest", num5);
	
}
}




	




