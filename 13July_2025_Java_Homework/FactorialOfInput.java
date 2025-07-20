import java.util.Scanner;
public class FactorialOfInput {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number to get its factorial: ");
int number = input.nextInt();
int Factorial = number;
int product = 1;
while(Factorial >=1) {
    product *= Factorial;
    Factorial--;
}
System.out.print(number + "! is: " + product);
}
}