//Exercise 2.28
//Diameter, Circumfrence and Area of a circle
 import java.util.Scanner;
 public class CircleCalculator {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the radius of the circle: ");
 double r = input.nextInt();   //assigning an integer value to a double variable; the integer value from the input source is converted to a decimal number.
 System.out.printf(" The diameter of the circle is %.2f%n ", (2 * r));
 System.out.printf(" The circumference of the circle is %.2f%n ", 2 * Math.PI * r);
 System.out.printf(" The area of the circle is %.2f%n ", Math.PI * r * r);
 }
 }