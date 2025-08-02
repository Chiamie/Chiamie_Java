//Health application: computing BMI
//Exercise 2.14

import java.util.Scanner;
public class ComputeBmi {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter weight in pounds: ");
double weightpounds = input.nextDouble();
System.out.print("Enter height in inches: ");
double heightinches = input.nextDouble();
double bmi = (weightpounds * 0.45359237) / ((heightinches * 0.0254) * (heightinches * 0.0254));
System.out.println("BMI is " + bmi);
}
}