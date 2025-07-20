public class Pattern2C {
public static void main(String[] args) {

for (int i = 1; i <= 10; i++) {
    for(int s = 0; s < i; s++) {
        System.out.print(" ");
    }
    for (int j = 10; j >= i; j--) {
        System.out.print("j");
    }
    System.out.println(); //print a newline after each inner loop iteration
}
}
}

