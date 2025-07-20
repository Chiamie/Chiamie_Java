import java.util.Scanner;
public class SumOf2Numbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number1 = input.nextInt();
System.out.print("Enter an integer: ");
int number2 = input.nextInt();
int sum = number1 + number2;
System.out.println("The sum is " + sum);
System.out.println("Do you wish to perform this operation again: ");
String response = input.next();

do {
   number1 = input.nextInt();
   number2 = input.nextInt();
   if(response.equalsIgnoreCase("Yes"))
     sum = number1 + number2;
     System.out.print("The sum is " + sum);
} while(!response.equalsIgnoreCase("Yes"));
}
}



