//A program that calaculates the squares and cubes of numbers from 0 to 10
//Shows the values in a table format
public class SquareCubeCalculator {
public static void main(String[] args) {
int digit = 0, digit1 = 1, digit2 = 2, digit3 = 3, digit4 = 4, digit5 = 5, digit6 = 6, digit7 = 7, digit8 = 8, digit9 = 9, num = 10;
int square = digit * digit, square1 = digit1 * digit1, square2 = digit2 * digit2, square3 = digit3 * digit3;
int square4 = digit4 * digit4, square5 = digit5 * digit5, square6 = digit6 * digit6, square7 = digit7 * digit7, square8 = digit8 * digit8;  
int square9 = digit9 * digit9, square10 = num * num;         
        
int cube = digit * digit * digit, cube1 = digit1 * digit1 * digit1, cube2 = digit2 * digit2 * digit2, cube3 = digit3 * digit3 * digit3, cube4 = digit4 * digit4 * digit4;
int cube5 = digit5 * digit5 * digit5, cube6 = digit6 * digit6 * digit6, cube7 = digit7 * digit7 * digit7, cube8 = digit8 * digit8 * digit8, cube9 = digit9 * digit9 * digit9;
int cube10 = num * num * num;

System.out.println("number" + "   " + "square" + "   " + "cube");
System.out.println(digit + "         " + square + "         " + cube);
System.out.println(digit1 + "         " + square1 + "         " + cube1);
System.out.println(digit2 + "         " + square2 + "         " + cube2);
System.out.println(digit3 + "         " + square3 + "         " + cube3);
System.out.println(digit4 + "         " + square4 + "         " + cube4);
System.out.println(digit5 + "         " + square5 + "         " + cube5);
System.out.println(digit6 + "         " + square6 + "         " + cube6);
System.out.println(digit7 + "         " + square7 + "         " + cube7);
System.out.println(digit8 + "         " + square8 + "         " + cube8);
System.out.println(digit9 + "         " + square9 + "         " + cube9);
System.out.println(num + "        " + square10 + "       " + cube10);

}
}