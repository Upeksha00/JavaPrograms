import java.util.Scanner;
class Factorial{
	
	//How to find the factorial of a given number
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int x = input.nextInt();

	int factorial = 1;	
	
	for(int i = x; i > 0 ; i--){
		
		factorial = factorial * i;
	
	}
	System.out.println(factorial);
	

	}

}
