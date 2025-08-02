//Exercise 2.26
// Multiples
import java.util.Scanner;
public class Multiples {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your first Integer: ");
int num1 = input.nextInt();
System.out.print("Enter your second Integer: ");
int num2 = input.nextInt();
int x = num1 * 3;
int y = num2 * 2;
if(y % x == 0)
	System.out.printf("%d is a multiple of %d%n", x, y);
if(y % x != 0)
	System.out.printf("%d is not a multiple of %d%n", x, y);
}
}