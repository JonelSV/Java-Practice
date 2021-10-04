package JavaPractice;

import java.util.Scanner;

public class ArrayExercise1 {

	public static void main(String[] args) {
		
		
		// program that fills an array with n(1-20) integers entered by user
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements you want, 1 - 20");
		int n = scan.nextInt();  
		
		while (n > 20 || n <= 0) {
			System.out.println("Invalid number, try again:");
			n = scan.nextInt();
		}
		
		int [] numbers = new int[n]
		
		
		
	}

}
