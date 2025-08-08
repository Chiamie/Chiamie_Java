public class TaskNine{
public static void main(String[] args){
int sum = 0;

for(int number = 1; number <= 10; number++){
	int product = 1;
  	for(int times = 1; times < 6; times++){ 
 		if(number % 4 == 0){
 			product = product * number;
 			sum += product;
 			int square = sum * sum;
 		if (times == 5)
 			System.out.print(square + " ");
 			 			
 		}
 	} 

 } 

 
 
 
 
 
 
 }
 
 
 
 
 
 
 
 
 
 
 }







