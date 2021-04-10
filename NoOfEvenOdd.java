import java.util.Scanner;
class NoOfEvenOdd{

	public static void main(String[] args){

	//How to check wheter a given numbers digits are even or odd
	Scanner input = new Scanner(System.in);
	System.out.println("Input a number you want : ");
	String number = input.nextLine();

	//convert this in to a char array
	char[] numberArray = number.toCharArray();

	//checking the charactors one by one
	for(int i = 0 ; i < numberArray.length ; i++){
	
		if(Character.getNumericValue(numberArray[i]) % 2 == 0){
			System.out.println(numberArray[i] + "is even");
		}
		else 
			System.out.println(numberArray[i] + "is odd");

	}

	}

}
