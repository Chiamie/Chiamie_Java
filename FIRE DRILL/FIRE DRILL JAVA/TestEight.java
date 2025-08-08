public class TaskEight{
public static void main(String[] args){
int sum = 0;

for(int number = 1; number <= 10; number++){
	int product = 1;
  	for(int row = 0; row < 5; row++){ 
 		if(number % 4 == 0){
 			product = product * number;
 			sum += product; 	
 		}
 	} 

 } System.out.print(sum + " ");

 
 
 
 
 
 
 }
 
 
 
 
 
 
 
 
 
 
 }






