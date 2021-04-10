class FibonakkiSeries{

//Generate Fibonacci series
	public static void main(String[] args){

	int num1 = 0;
	int num2 = 1;

	for(int i = 2 ; i < 10 ; i++){

		int sum = num1 + num2;
		num1 = num2;
		num2 = sum;
		System.out.print(num2 + " , ");
		
		

	}
System.out.println();

	}

}
