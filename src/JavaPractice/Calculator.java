package JavaPractice;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		char operator;
		
		double numberInput1, numberInput2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the operation you want to be performed (+, -, *, /): ") ;
		
		// input.next = takes in the input of the user and charAt to take first index and stores it in operator variable.
		
		operator = input.next().charAt(0);
	
		System.out.println("Enter TWO numbers that the calculation operation will work on");
		
		numberInput1 = input.nextDouble();
		numberInput2 = input.nextDouble();
			
		input.close();
		
		// switch case for operations
		// printf = print format, %f = format float (can have 2 decimal places eg. %.2f + %.2f = %.2f  ::::> 10.31 + 10.31 = 20.62 
		// :::> printf(format type, args can be multiple)
		// %c ::> character
		
		
		switch (operator) {
		case '+' : 
			System.out.printf("%.2f + %.2f = %.2f", numberInput1, numberInput2, (numberInput1 + numberInput2));
			break;
		case '-' : 
			System.out.printf("%.2f - %.2f = %.2f", numberInput1, numberInput2, (numberInput1 - numberInput2));
			break;
		case '*' : 
			System.out.printf("%.2f * %.2f = %.2f", numberInput1, numberInput2, (numberInput1 * numberInput2));
			break;
		case '/' : 
			
			if(numberInput2 != 0)
				System.out.printf("%.2f / %.2f = %.2f", numberInput1, numberInput2, (numberInput1 / numberInput2));
			else
				System.out.println("Please enter a number greater than zero");
			break;
		default: 
			System.out.printf("%c is an invalid operator. Please try again", operator);
		}
		
	}
	
	
	

}
