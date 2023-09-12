package chapter2;

public class Calculator2 {
	
	int a = 5;
	
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		
		double num1 = 10;
		double num2 = 50;
		
		System.out.println(num1 + " + " + num2 + " = " + sum(num1,num2));
		System.out.println(num1 + " - " + num2 + " = " + subtraction(num1,num2));
		System.out.println(num1 + " * " + num2 + " = " + multiply(num1,num2));
		System.out.println(num1 + " / " + num2 + " = " + divide(num1,num2));
		
	}

}
