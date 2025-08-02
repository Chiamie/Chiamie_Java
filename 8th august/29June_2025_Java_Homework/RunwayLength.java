//Physics: finding runway length
//Exercise 2.12
import java.util.Scanner;
public class RunwayLength {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter takeoff speed in m/s and acceleration m/s.s");
double v = input.nextDouble(), a = input.nextDouble();
double length = (v * v) / (2 * a);
System.out.println("The minimum runway length for this airplane is  " + length);
}
}