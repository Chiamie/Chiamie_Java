import java.util.Scanner;
public class RandomNumber_UserInputGuess {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int random = (int) (Math.random() * Integer.MAX_VALUE);
int guess;
//Boolean userGuess = true;
do {
    System.out.print("I have a number, what could it be? ");
    guess = input.nextInt();
    
    if(guess > random)
        System.out.println("Too high, try again.");
        
    if(guess < random)
        System.out.println("Too low, try again.");

    } while (guess != random);
        System.out.print("Correct Guess!");
        //(userGuess)userGuess = false;

}
}





