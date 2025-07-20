// WEEKEND SNACK: FUNCTIONS - 6/7/2025
public class Kata {
public static void main(String[] args) {

long squares = square(5);
System.out.println(squares);

long factorial = factorialOf(5);
System.out.println(factorial);

System.out.println(isSquare(144));

System.out.println(isSquares(225));

System.out.println(factorOf(25));

float quotient = divide(5, 3);
System.out.println(quotient);

int difference = subtract(8, 5);
System.out.println(difference);

System.out.println(isPrimeNumber(9));

System.out.println(isEven(121));

boolean palindrome = isPalindrome(45654);
System.out.println(palindrome);
}




public static long square(int number) {
	int squares = number * number;
	return squares;
}

public static long factorialOf(int number) {
	int factorial = 1;
	for(int i = number; i >= 1; i--) {
		factorial *= i;
	}	
	return factorial;
}

public static boolean isSquare(int number) {
	int unitDigit = number % 10;
	if(unitDigit == 0 || unitDigit == 1 || unitDigit == 4 || unitDigit == 5 || unitDigit == 6 || unitDigit == 9)
		return true;
	else
		return false;
}

public static boolean isSquares(int number) {
	if(Math.sqrt(number) % 1 == 0)
 		return true;
	else 
 		return false;
}

public static int factorOf(int number) {
	int count = 0;
	for(int i = 1; i <= number; i++){
	if(number % i == 0)
		count++;
	}
	return count;
}

public static float divide(int number, int number2) {
	int quotient;
	if(number2 == 0){
	  quotient = 0;
	}else{
	   quotient = number / number2;
	}
	  return quotient;
}

public static int subtract(int number1, int number2) {
	int difference, minuend, subtrahend;
	if(number2 > number1){
	  minuend = number2;
	  subtrahend = number1;
	}else{
	   minuend = number1;
	   subtrahend = number2;
	}
	difference = minuend - subtrahend;
	  return difference;
}

public static boolean isPrimeNumber(int number) {
	if(number == 2){
	  return true;
	} else {
	   for(int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
   			if(number % divisor == 0)
			return false;
	   }
	}
			return true;
}

public static boolean isEven(int number) {
	if(number % 2 == 0) {
	  return true;
	} else {
	} return false;	 
}

public static boolean isPalindrome(int number) {
if(number < 1000 || number > 99999) {
 return false;
} else {
	if((number % 10 == number / 10000) && ((number % 100) / 10 == (number / 1000) % 10)) {
	  return true;
	} else {
 	} return false;	 
}
}

}