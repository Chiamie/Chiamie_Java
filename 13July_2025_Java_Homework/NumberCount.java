import java.util.Scanner;
public class NumberCount {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int positiveCount = 0, negativeCount = 0, zeroCount = 0;

boolean continueInput = true;

while (continueInput) {
   System.out.println("Enter an integer: ");
   int data = input.nextInt();
   
   if(data > 0) {
      positiveCount++;
   } else if(data < 0) {
      negativeCount++;
   } else {
      zeroCount++;
   }
      
   System.out.println("Do you want to enter another number: ");
   String response = input.next().toLowerCase();
      
   if(!response.equals("yes") &&  !response.equals("no")) {						// while can be subsituted for if
      System.out.println("Invalid input. Please enter 'yes' or 'no': ");
      response = input.next().toLowerCase();
   }
   
   if(response.equals("no")) 
      continueInput = false;

}            
System.out.println("Your input has " + positiveCount + " positive numbers " + negativeCount + " negative numbers" + " and " + zeroCount + " zeros");
}
}


