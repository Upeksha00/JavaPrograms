import java.util.Scanner;
class Prime{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Give the integer you want to check :");
		int x = input.nextInt();

		

		int count = 0;		
		
		//Check about the no of deviding chances
		for(int i = 1; i <= x ; i++){

			if(x % i == 0){
				count = count + 1;
			}
			else
				continue;

		}
		
		//check the no of devided numbers and give the output
		if(count == 2){
			System.out.println("This is a prime number");
		}
		else
			System.out.println("This is not a prime number");


	}


}
