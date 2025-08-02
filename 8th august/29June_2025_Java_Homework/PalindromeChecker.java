//A program to check if an input is a Palindrome
import java.util.Scanner;
public class PalindromeChecker {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a word: ");
String number = input.next();
String reversed = "";
int a = number.length()-1;
if(a >= 0) {
a--;
reversed += number.charAt(a);
	if(number.equals(reversed)) {
	System.out.println(number + " is a Palindrome");
	} else {System.out.println(number + " is not a Palindrome");
  	  }
}
}
}

