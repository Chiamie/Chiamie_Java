//Exercise2.32
//Negative Positive and Zero Values
import java.util.Scanner;
public class Values {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int negatives = 0, positives = 0, zeros = 0;
System.out.print("Enter your first number: ");
int num1 = input.nextInt();
System.out.print("Enter your second number: ");
int num2 = input.nextInt();
System.out.print("Enter your third number: ");
int num3 = input.nextInt();
System.out.print("Enter your fourth number: ");
int num4 = input.nextInt();
System.out.print("Enter your fifth number: ");
int num5 = input.nextInt();
if (num1 > 0) positives++;
if (num1 < 0) negatives++;
if (num1 == 0) zeros++;
if (num2 > 0) positives++;
if (num2 < 0) negatives++;
if (num2 == 0) zeros++;
if (num3 > 0) positives++;
if (num3 < 0) negatives++;
if (num3 == 0) zeros++;
if (num4 > 0) positives++;
if (num4 < 0) negatives++;
if (num4 == 0) zeros++;
if (num5 > 0) positives++;
if (num5 < 0) negatives++;
if (num5 == 0) zeros++;
	System.out.printf("You have %d negative numbers %n", negatives);
	System.out.printf("You have %d positive numbers %n", positives);
	System.out.printf("You have %d zero numbers %n", zeros);

	

}
}