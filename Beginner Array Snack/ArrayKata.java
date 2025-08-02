import java.util.Arrays;
public class ArrayKata {
public static void main(String[] args){

int[] scores = {5, 6, 4, 9, 3, 8, 2};
System.out.println(maximumIn(scores));
System.out.println(minimumIn(scores));
System.out.println(sumOf(scores));
System.out.println(sumOfEvenNumbersIn(scores));
System.out.println(sumOfOddNumbersIn(scores));
System.out.println(Arrays.toString(maximumAndMinimumOf(scores)));
System.out.println(Arrays.toString(evenNumbersIn(scores)));
System.out.println(Arrays.toString(oddNumbersIn(scores)));
System.out.println(Arrays.toString(squareNumbersIn(scores)));


}
public static int maximumIn(int[] ArrayOfIntegers){
	int largest = ArrayOfIntegers[0];
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] > largest)
			largest = ArrayOfIntegers[element];
	}
	return largest;
}


public static int minimumIn(int[] ArrayOfIntegers){
	int smallest = ArrayOfIntegers[0];
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] < smallest)
			smallest = ArrayOfIntegers[element];
	}
	return smallest;
}


public static int sumOf(int[] ArrayOfIntegers){
	int sum = 0;
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		sum += ArrayOfIntegers[element];
	}
	return sum;
}

public static int  sumOfEvenNumbersIn(int[] ArrayOfIntegers){
	int evenSum = 0;
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] % 2 == 0)
			evenSum += ArrayOfIntegers[element];
	}
	return evenSum;
}


public static int  sumOfOddNumbersIn(int[] ArrayOfIntegers){
	int oddSum = 0;
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] % 2 != 0)
			oddSum += ArrayOfIntegers[element];
	}
	return oddSum;
}


public static int[] maximumAndMinimumOf(int[] ArrayOfIntegers){
	int maximum = ArrayOfIntegers[0];
	int minimum = ArrayOfIntegers[0];
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] > maximum)
			maximum = ArrayOfIntegers[element];
		else if (ArrayOfIntegers[element] < minimum)
			minimum = ArrayOfIntegers[element];
	}
	int[] maximumAndMinimum = {maximum, minimum};
	return maximumAndMinimum;
}

public static int noOfOddNumbersIn(int[] ArrayOfIntegers){
	int count = 0;
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] % 2 != 0)
			count++;
	}
	return count;
}

		
public static int noOfEvenNumbersIn(int[] ArrayOfIntegers){
	int count = 0;
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] % 2 == 0)
			count++;
	}
	return count;
}

public static int[] evenNumbersIn(int[] ArrayOfIntegers){
	int count = 0;
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] % 2 == 0)
			count++;
	}
	int evenNumberCount = 0;
	int[] evenNumbersInArrayOfIntegers = new int[count];
	for(int element : ArrayOfIntegers){
		if(element % 2 == 0){
			evenNumbersInArrayOfIntegers[evenNumberCount] = element;
			evenNumberCount++;
		}
	}
	return evenNumbersInArrayOfIntegers;
}


public static int[]  oddNumbersIn(int[] ArrayOfIntegers){
	int count = 0;
	for(int element = 0; element < ArrayOfIntegers.length; element++){
		if(ArrayOfIntegers[element] % 2 != 0)
			count++;
	}
	int oddNumberCount = 0;
	int[] oddNumbersInArrayOfIntegers = new int[count];
	for(int element : ArrayOfIntegers){
		if(element % 2 != 0){
			oddNumbersInArrayOfIntegers[oddNumberCount] = element;
			oddNumberCount++;
		}
	}
	return oddNumbersInArrayOfIntegers;
}

public static int[] squareNumbersIn(int[] ArrayOfIntegers){
	int elementCount = 0;
	int[] squareNumbersInArrayOfIntegers = new int[ArrayOfIntegers.length];
	for(int element : ArrayOfIntegers ){
		squareNumbersInArrayOfIntegers[elementCount] = element * element;
		elementCount++;
	}
	return squareNumbersInArrayOfIntegers;
}




















}