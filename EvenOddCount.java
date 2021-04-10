import java.util.Scanner;
class EvenOddCount{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Input a number you want : ");
	String number = input.nextLine();

	//converting this string in to a char array
	char[] numberArray = number.toCharArray();

	int oddCount = 0;
	int evenCount = 0;
	
	for(int i = 0 ; i < numberArray.length ; i++){
		if(Character.getNumericValue(numberArray[i]) % 2 == 0){
			evenCount++;
		}
		else{
			oddCount++;
		}

	}
	System.out.println("The number of even values : " + evenCount);
	System.out.println("The number of odd values : " + oddCount);

	
		

	}

}
