import java.util.Scanner;
class TwoSum{
	public static void main(String[] args){

		
		/*Find the two numbers which give the value of the inputed number when adding
		 these numbers 
			int[] numbers = {2, 3, 4, 8};
			given no = 7
			Then the no which gives as the out put = 4 and 3 
			if given = 12
			Then the no which gives as the out put = 4 and 8
		*/
		
		int[] numbers = {2 , 5 , 7 , 3 , 10};
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
			        else
					
					continue;
			}

		}
		if(flag == false){
			System.out.println("The numbers are not precent in this array");

		}
				
		




	
	}



}
