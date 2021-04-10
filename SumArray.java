import java.util.Arrays;
class SumArray{

	public static void main(String[] args){

		String name = "Upeksha";
		char[] charArr = name.toCharArray();
		System.out.println(Arrays.toString(charArr));		

		int[] numbers = {3, 5, 6, 8, 10};

		int sum = 0;
		for(int i = 0 ; i < numbers.length ; i++){
			sum = sum + numbers[i];

		}	
		System.out.println("The sum of the array : " + sum);

 	}

}
