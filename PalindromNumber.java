import java.util.Scanner;
class PalindromNumber{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number : ");
		String string = input.nextLine();

		//reversing this string 
		StringBuffer sb = new StringBuffer(string);
		sb.reverse();


		//checking wheter the given number is equls to it's reverse
		//The equls method is the method which checks the content of two numbers
		String reversedString = new String(sb);
		if(string.equals(reversedString)){
			System.out.println("This is a palindrom number");
		}
		else
			System.out.println("This is not a palindrom number");

	}

}
