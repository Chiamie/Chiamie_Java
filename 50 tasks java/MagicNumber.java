import java.util.Scanner;
public class MagicNumber {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
final int NUMBER = 42;
System.out.println("I have a number, guess what it is?");
int number = input.nextInt();
while (number != -1){
	if (number == NUMBER){
		System.out.println("You found the magic number!");
		break;
	}else {
		System.out.println("Keep looking!");
		System.out.println("I have a number, guess what it is?");
		number = input.nextInt();
	}

	
	
	
	
}
	          
	














}














}









 
