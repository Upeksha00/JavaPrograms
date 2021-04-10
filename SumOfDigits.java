import java.util.Scanner;
class SumOfDigits{
	
	//Count Sum Of Digits in a Number

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Input a number you want : ");
	String number = input.nextLine();

	char[] numberArray = number.toCharArray();

	System.out.println(numberArray.length);

	}

}
