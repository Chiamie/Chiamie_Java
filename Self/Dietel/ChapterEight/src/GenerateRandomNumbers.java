import java.security.SecureRandom;
import java.util.Scanner;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom numberGenerator = new SecureRandom();
        int randomNumber = numberGenerator.nextInt(10, 100);
    }
}
