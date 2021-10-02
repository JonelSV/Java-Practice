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
		
		
	
	}

}
