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
		
		switch(operator) {
		case '+':
			System.out.println("The sum is: " + add(num1, num2));
			break;
		case '-':
			System.out.println("The difference is: " + subtract(num1, num2));
			break;
		case '*':
			System.out.println("The product is: " + multiply(num1, num2));
			break;
		case '/':
			System.out.println("The qoutient is: " + divide(num1, num2));
			break;
		default:
			System.out.println("INVALID entry, Please try again");
		}
		
		System.out.println("Press y to exit the program");
		char exit;
		exit = scan.next().charAt(0);
		
		if(exit == 'y') {
		System.exit(0);
		}else {
			System.out.println("Invalid Entry, please try again");
		}
		
		
		scan.close();
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
