//Convert pounds into kilogrms
//Exercise 2.4
import java.util.Scanner;
public class PoundsToKilograms {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number in pounds: ");
double pounds = input.nextDouble();
double poundstokilograms = pounds * 0.454;
System.out.println(pounds + " pounds is " + poundstokilograms + " " + "kilograms");
}
}