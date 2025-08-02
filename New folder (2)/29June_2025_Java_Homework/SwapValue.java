//A program that allows user input two integer values
//The values are swapped
import java.util.Scanner;
public class SwapValue {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter two integers: ");
int num1 = input.nextInt(), num2 = input.nextInt();

num1 = num1 * num2; 
num2 = num1 / num2;
num1 = num1 / num2;

System.out.print("Num1 is now: " + num1 + " while Num2 is now: " + num2);
}
}
