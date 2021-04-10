import java.util.Scanner;
class NumberOddEven{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Input the Number : ");
		String string = input.nextLine();

		for(int i = string.length()-1 ; i > 0 ; i--){

			int x = Integer.parseInt(string.charAt(i));
			if(x % 2 == 0)
				System.out.println(string.charAt(i) + " is a even");
			else
				System.out.println(string.charAt(i) + " is a odd");
		}

	}


}
