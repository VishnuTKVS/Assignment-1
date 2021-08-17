package assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 153;
		int original;
		int remainder;
		int calculated = 0;
		original = number;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			calculated = calculated + (remainder * remainder * remainder);

		}

		if (calculated == original){
		
			System.out.println("The Number is Armstrong Number");
		}
			else {
				System.out.println("The Number is Not an Armstrong Number");
			}
	}
}
