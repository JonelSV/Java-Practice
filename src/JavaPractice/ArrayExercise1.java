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
		
		// 1. initialize an integer array called numbers that will take in the n(input) as a new Array
		// 2. create a method that will fill the arrays then print it
		
		
		int [] numbers = new int[n];
		fillArray(numbers);
		printArrayOfNumbers(numbers);
		
		
	}
	
	private static void printArrayOfNumbers(int[] numbers) {
		System.out.println();
		
	}

	// private access modifier does not matter since it is being accessed in the same class ( ArrayExercises)
	// void because we are not returning anything. Just filling the array above with user input

	private static void fillArray(int[] numbers) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i ++);
			numbers[i]  = scan.nextInt();
		
	}

}
