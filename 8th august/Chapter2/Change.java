//an application that reads data from user
//the data is not read into memory
import java.util.Scanner;
public class Change {
public static void main(String[] args) {
Scanner joy = new Scanner(System.in);
System.out.print("Enter a number: ");
System.out.printf("The square is %d" * "%d", joy.nextInt(), joy.nextInt());
}
}