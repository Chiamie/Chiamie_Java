//Convert feet into meters
//Exercise 2.3
import java.util.Scanner;
public class FeetToMeters {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a value in feets: ");
double num = input.nextDouble();

double feetometers = num * 0.305;
System.out.printf("%f feet is %f", num, feetometers);
//System.out.println(num + " feet is" + feetometers);

}
}