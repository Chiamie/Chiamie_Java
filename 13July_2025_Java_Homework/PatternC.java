public class PatternC {
public static void main(String[] args) {
int n = 5;
int i = 1;
while (i <= n) {
   for(int s = n - i; s > 0; s--){
      System.out.print(" ");
   }
   for (int j = i; j >= 1 ; j--) {
      System.out.print(j);
    }
    System.out.println(); //print a newline after each inner loop iteration
 i++;
}
}
}

