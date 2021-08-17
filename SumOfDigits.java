package assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int number = 8309;
		int quotient = 1;
		int sum = 0; 
		int reminder = 0;
		
		while (quotient!=0) {
			quotient = number/10;
			reminder = number%10;
			number = quotient;
			sum = sum + reminder;
			
		}	
		
System.out.println("Sum Of Digits = " + sum);
		
	}

}
