import java.util.Scanner;
public class RaisedToPowerOfAnother1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");
int number1 = input.nextInt();
System.out.println("Enter another number: ");
int number2 = input.nextInt();

int base = number1;
int exponent = number2;
int result = 1;
for(int i = 0; i < exponent; i++) {
   result *= number1;   
}
System.out.println(number1 + "^" + number2 + " is: " + result);
}
}

