package JavaPractice;
import java.util.Scanner;

public class CalculatorMultiMethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Enter the operation you want to perform( +, -, *, /):");
		
		char operator;
		operator = scan.next().charAt(0);
		
		System.out.println("Enter TWO numbers to be calculated");
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
	}
	
	public static double add(double num1, double num2) {
		double output;
		output = num1 + num2;
		return output;
	}
	
		
	public static double subtract(double num1, double num2) {
		double output;
		output = num1 - num2;
		return output;	
	}
	public static double multiply(double num1, double num2) {
		double output;
		output = num1 * num2;
		return output;
	}
	public static double divide(double num1, double num2) {
		double output;
		output = num1 / num2;
		return output;
	}
	

}
