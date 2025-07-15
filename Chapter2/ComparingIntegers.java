import java.util.Scanner; 
public class ComparingIntegers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a wholenumber: ");
int number = input.nextInt();

if (number > 100)
	System.out.printf("%d*%d and %d are > 100 %n", number, number, number);

if (number < 100)
	System.out.printf("%d*%d and %d are < 100 %n", number, number, number);

if (number == 100)
	System.out.printf("%d*%d and %d are == 100 %n", number, number, number);

if (number != 100)
	System.out.printf("%d*%d and %d are != 100 %n", number, number, number);
}
}


