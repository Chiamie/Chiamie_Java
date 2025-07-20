import java.util.Scanner;
public class UserInputLarge_Small {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int largest = Integer.MIN_VALUE;
int smallest = Integer.MAX_VALUE;
Boolean numberCollection = true;
while(numberCollection) {
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    if(number > largest)
        largest = number;
    if(number < smallest)
        smallest = number;

    
    System.out.print("Do you have more numbers to enter: ");
    String response = input.next();
    
    if(!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
        System.out.print("Enter a valid input: ");
        response = input.next();
    }
    if(response.equalsIgnoreCase("no")) 
        numberCollection = false;
}
System.out.print("The largest number is " + largest + " while the smallest number is " + smallest);
}
}




