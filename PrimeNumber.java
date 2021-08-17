package assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 13;
		boolean flag = false;
		
		for (int i = 2; i <= number/2; i++) {
			if (number % i==0) {
				
				 flag = true;
				 break;
			}
			if (flag) {
				System.out.println(number + " - The Number is Composite number");
				
			}
			else {
				System.out.println(number + " - The Number is Prime number");
				break;
			}
			}
		
		
		}
	

}
