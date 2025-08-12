import java.util.Scanner;
public class PrintYourName {
public static void main (String[] args){

printYourNameAbout(3);
}

public static void printThis(){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your name: ");
	String name = input.next();
	for(int times = 0; times < 3; times++){
		System.out.println(name);
	}
}

public static void printYourNameAbout(int size){
	for(int times = 0; times < size; times++){
		printThis();
	}
}


	
	

	          
	


}









 

