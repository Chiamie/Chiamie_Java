public class Pattern2D {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
    for(int s = 1; s <= 10 - i; s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
    System.out.print('*');
    }
    System.out.println(); //print a newline after each inner loop iteration
}
}
}


