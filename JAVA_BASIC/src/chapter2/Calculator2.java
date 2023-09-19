package chapter2;

import java.util.Scanner;

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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력해주세요 : ");
		double num1 = sc.nextDouble();
		System.out.print("연산자를 입력해주세요 : ");
		String op = sc.next();
		System.out.print("두 번째 숫자를 입력해주세요 : ");
		double num2 = sc.nextDouble();
		double result = 0;
		
		if(op.equals("+")) {
			result = sum(num1, num2);
		} else if(op.equals("-")) {
			result = subtraction(num1, num2);
		} else if(op.equals("*")) {
			result = multiply(num1, num2);
		} else if(op.equals("/")) {
			result = divide(num1, num2);
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		
	}

}
