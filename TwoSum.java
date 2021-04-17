import java.util.Scanner;
class TwoSum{
	public static void main(String[] args){

		
		/*Find the two numbers which give the value of the inputed number when adding
		  out of these numbers precent in the array.
		  Ex:-
			int[] numbers = {2, 3, 4, 8};
			given no = 7
			Then the out put = 4 and 3 
			if given = 12
			Then the out put = 4 and 8
		*/
		//This is the array I proveided temporary.For the simpliness
		int[] numbers = {2 , 5 , 7 , 3 , 10};
		//Taking the user input to take the sum of the two numbers
		System.out.print("Give the related sum of the numbers : ");
		Scanner input = new Scanner(System.in);
		int given = input.nextInt();
		
		int sum = 0;
		boolean flag = false;
		
		//This loop will select the first number up to add	
		for(int i = 0 ; i < numbers.length ; i++){
			//This loop will select the second number up to add
			for(int j = i+1 ; j < numbers.length ; j++){
			
				sum = numbers[i] + numbers[j];
			        if(sum == given){
					flag = true;
					System.out.println("The related numbers are : " + numbers[i] + " and " + numbers[j]);

			        }
				//no actual need. On behalf of the simpliness
			        else
					continue;
			}

		}
		//if the provided sum by the user, do't given by two numbers in the array then this print statement will execute
		if(flag == false){
			System.out.println("The numbers are not precent in this array");

		}
				
		




	
	}



}
