package assignments2;

public class Calculator {

	
		
		int num1=17, num2=39, num3=74;
		
		public int add(int num1, int num2, int num3)
			{
		int total = num1 + num2 + num3;
		System.out.println("The total of Addition is: " + total);
		return total;
			}
		public int sub(int num1, int num2) {
			int total = num1 - num2;
			System.out.println("The total of Subtracton is: " + total);
			return total;
			}
		public double mul(double num1, double num2) {
			double total = num1 * num2;
			System.out.println("The total of Multipication is: " + total);
			return total;
		}
		public float div(float num1, float num2) {
			float total = num1 / num2;
			System.out.println("The total of Divison is: " + total);
			return total;
		}
		
public static void main(String[] args) {
	Calculator calobj = new Calculator();
	calobj.add(17,39,74);
	calobj.sub(17,39);
	calobj.mul(17,39);
	calobj.div(17,39);
	
}
}
