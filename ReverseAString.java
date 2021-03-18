import java.util.Scanner;

class ReverseAString{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Input the String you want : ");
		String str = input.nextLine();
		for(int i = str.length()-1; i >= 0; i--){
			System.out.println(str.charAt(i));

		}

	}


}
