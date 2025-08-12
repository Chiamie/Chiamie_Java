public class LoopingStars {
public static void main (String[] args){

printStarof(5);
}

public static void printStar(){
	int count = 0;
	while(count <=5){
		System.out.println("*");
		count++;
	}
}

public static void printStarof(int size){
	for (int times = 0; times < size; times++){
		printStar();
	}
}



	

}









 

