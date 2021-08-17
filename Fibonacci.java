package assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int range = 8; 
		int firstNumber = 0; 
		int secondNumber = 1;
		int series =0;
		
		System.out.println("The first number is " + firstNumber);
		System.out.println("The second number is " + secondNumber);
		
		for (int i = 0; i <range; i++) {
			
			series = firstNumber + secondNumber;
			firstNumber=secondNumber;
			secondNumber = series;
			
			System.out.println("The Fibonacci Series is : " + series);
		}
		
	}

}
