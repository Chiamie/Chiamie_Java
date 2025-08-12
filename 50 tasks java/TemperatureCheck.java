import java.util.Scanner;
public class TemperatureCheck {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.println("What is the temperature?");
int temperature = input.nextInt();
	if (temperature > 30){
		System.out.println("Hot");
		
	}else if (temperature >= 15 || temperature == 30){
		System.out.println("Nice!");
	} else if (temperature < 15){
		System.out.println("Cold!");
	}


	
	
	
	
}
	          
	














}


















 

