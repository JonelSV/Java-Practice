package ArraysExerciseTim;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		private static Scanner scanner = new Scanner(System.in);
		
		
		
		int [] myIntegers = getIntegers(5);
	}

	
	public static int[] getIntegers(int capacity) {
		int[] array = new int [capacity];
		System.out.println("Enter " + capacity + " integer valuse : \r");
		for(int i = 0; i < array.length; i++) {
			  array[i] = scanner.nextInt();
		}
		return array;
	}
	
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("ELEMENT " + i + "contents " + array [i]);
			
		}
	}
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {{
			sortedArray[i] = array[i];
		}
	}
	
}
