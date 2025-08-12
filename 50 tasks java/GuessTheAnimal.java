import java.util.Scanner;
public class GuessTheAnimal {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
final String MY_ANIMAL = "dog";


System.out.println("I have aan animal, guess what it is? ");
String userGuess = input.next();
if (MY_ANIMAL.equals(userGuess))
	System.out.println("Correct! Its's a dog!");
else
	System.out.println("Nope! Its's a dog!");


}
}