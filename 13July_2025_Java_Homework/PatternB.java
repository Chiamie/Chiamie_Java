public class PatternB {
public static void main(String[] args) {
int i = 6;
while (i >= 1) {
   for (int j = 1; j <= i; j++) {
      System.out.print(j + " ");
    }
    System.out.println(); //print a newline after each inner loop iteration
 i--;
}
}
}
