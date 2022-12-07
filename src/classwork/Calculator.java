package classwork;


public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculato calc = new Calculato();
//		Calculator.sum(10,20);
		calc.sum(10, 20);
	}
}

class Calculato{
	public void sum(int value1, int value2) {
		int result = value1 + value2;
		System.out.println("The sum is " + result);
		
	}
	public void minus(int value1, int value2) {
		int result = value1 - value2;
		System.out.println("The substratction is:" + result);
		
	}
	public void Multiply(int value1, int value2) {
		int result = value1 * value2;
		System.out.println("The sum is :" + result);
		
	}
}