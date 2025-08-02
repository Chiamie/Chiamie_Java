import java.util.Scanner;
public class Arithmetic {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first integer: ");
int number1 = input.nextInt();
System.out.print("Enter second integer: ");
int number2 = input.nextInt();
int square1 = number1 * number1;
int square2 = number2 * number2;
int sumSquares = square1 + square2;
int diffSquares = square1 - square2;
System.out.println(square1);
System.out.println(square2);
System.out.println(sumSquares);
System.out.println(diffSquares);
}
}
