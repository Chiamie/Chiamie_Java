import java.util.Scanner;
public class AgeRestriction {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
final int MINIMUM_AGE = 10;


System.out.println("Enter you age: ");
int userAge = input.nextInt();
if (userAge >= MINIMUM_AGE)
	System.out.println("Welcome to the show!");
else
	System.out.println("Sorry, you are too young!");


}
}
