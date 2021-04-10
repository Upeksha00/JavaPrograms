//There are things to improve in this code..... Specioly the output is very sarcastic..
import java.util.Scanner;
import java.util.Arrays;
class DuplicateElementsInArray{

	static public void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers do you want to take in to the array: ");
		int x = scanner.nextInt();
		System.out.println("****** Provide the inputs one by one in to the array ****** ");
		
		//crating a array called numbers 
		int[] numbers = new int[x];
		
		//calling the method 
		DuplicateElementsInArray duplicate = new DuplicateElementsInArray();
		numbers = duplicate.getInputIntArray(x);
		
		//toString() is a static method in Arrays class.There fore have to call using the class name
		System.out.println("The array you provided is : " + Arrays.toString(numbers));
		
		//calling the checkDuplicate() method
		DuplicateElementsInArray.checkDuplicate(numbers);
		
		
		
		
		

	}
	public static int[] getInputIntArray(int x){
		int[] numbers = new int[x];

		Scanner input = new Scanner(System.in);
		for(int i = 0 ; i < x ; i++){

			numbers[i] = input.nextInt();
		}
		
		return numbers;
	
	}
	public static void checkDuplicate(int[] numbers){
		//Checking the duplicate numbers in this array
		
		for(int i = 0 ; i < numbers.length ; i++){
			for(int j =0 ; j < numbers.length; j++){
				if(i == j){
					continue;
				}
				else if(numbers[i] == numbers[j]){
					
					System.out.println(numbers[i] + " is a duplicate number");
				}
					
			}

		}
	}


}
