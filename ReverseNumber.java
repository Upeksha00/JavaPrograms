//Reverse A Number
import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number : ");
		String number = input.nextLine();
		
		//First way by using a for loop
		for(int i = number.length()-1 ; i >=0 ; i--){
			System.out.print(number.charAt(i));
		}

		//using an inbuilt method

		StringBuffer sb = new StringBuffer(number);
                sb.reverse();
		System.out.println("\n" + sb);
		

	}

}
