/*Write a programe to take a number from the user and output the 
 number of intigers in that number*/

import java.util.Scanner;
class DigitsInNumber{

	public static void main(String[] args){

		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the Number : ");
		String string = input.nextLine();

		System.out.println("The number of digits in this number is : " + string.length());

	}


}
