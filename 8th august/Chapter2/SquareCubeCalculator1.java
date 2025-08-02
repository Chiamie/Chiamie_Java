//A program that calaculates the squares and cubes of numbers from 0 to 10
//Shows the values in a table format
public class SquareCubeCalculator1 {
public static void main(String[] args) {
int digit = 0, digit1 = 1, digit2 = 2, digit3 = 3, digit4 = 4, digit5 = 5, digit6 = 6, digit7 = 7, digit8 = 8, digit9 = 9, num = 10;
int square = digit * digit, square1 = digit1 * digit1, square2 = digit2 * digit2, square3 = digit3 * digit3;
int square4 = digit4 * digit4, square5 = digit5 * digit5, square6 = digit6 * digit6, square7 = digit7 * digit7, square8 = digit8 * digit8;  
int square9 = digit9 * digit9, square10 = num * num;         
        
int cube = digit * digit * digit, cube1 = digit1 * digit1 * digit1, cube2 = digit2 * digit2 * digit2, cube3 = digit3 * digit3 * digit3, cube4 = digit4 * digit4 * digit4;
int cube5 = digit5 * digit5 * digit5, cube6 = digit6 * digit6 * digit6, cube7 = digit7 * digit7 * digit7, cube8 = digit8 * digit8 * digit8, cube9 = digit9 * digit9 * digit9;
int cube10 = num * num * num;

System.out.println("number\tSquare\tCube");
System.out.println(digit + "\t" + square + "\t" + cube);
System.out.println(digit1 + "\t" + square1 + "\t" + cube1);
System.out.println(digit2 + "\t" + square2 + "\t" + cube2);
System.out.println(digit3 + "\t" + square3 + "\t" + cube3);
System.out.println(digit4 + "\t" + square4 + "\t" + cube4);
System.out.println(digit5 + "\t" + square5 + "\t" + cube5);
System.out.println(digit6 + "\t" + square6 + "\t" + cube6);
System.out.println(digit7 + "\t" + square7 + "\t" + cube7);
System.out.println(digit8 + "\t" + square8 + "\t" + cube8);
System.out.println(digit9 + "\t" + square9 + "\t" + cube9);
System.out.println(num + "\t" + square10 + "\t" + cube10);

}
}
