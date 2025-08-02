//Geometery: area of a triangle
//Exercise 2.19
import java.util.Scanner;
public class AreaTriangle {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the value of x1: ");
double x1 = input.nextDouble();
System.out.print("Enter the value of x2: ");
double x2 = input.nextDouble();
System.out.print("Enter the value of x3: ");
double x3 = input.nextDouble();
System.out.print("Enter the value of y1: ");
double y1 = input.nextDouble();
System.out.print("Enter the value of y2: ");
double y2 = input.nextDouble();
System.out.print("Enter the value of y3: ");
double y3 = input.nextDouble();

double side1 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
double side3 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

double semiperimeter = (side1 + side2 + side3) / 2;
double area = Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
System.out.printf("The area of the triangle is %f", area);
}
}