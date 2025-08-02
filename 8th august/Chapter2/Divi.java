//Exercise 2.25
// Divisible by 3
import java.util.Scanner;
public class Divi {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
int num = input.nextInt();
if (num % 3 == 0)
	System.out.printf("%d is divisible by 3", num);
if (num % 3 != 0)
	System.out.printf("%d is not divisible by 3", num);
}
}