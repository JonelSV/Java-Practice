package JavaPractice;

import java.util.Scanner;

// integer array, 10 is number of elements assigned in the array


public class ArraysTim {
	
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		
		int[] myIntArray = new int[10];
		myIntArray[5] = 33; 
		
		double[] myDoubleArray = new double[5];
		myDoubleArray[3] = 50.22;
		
		
		System.out.println(myIntArray[7]);
		System.out.println(myDoubleArray[3]);
		
// to assign more dynamically to arrays, declare int [] array then define valuse and number of elements at the same time.		
		
		int[] dynamicAssignedArray = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(dynamicAssignedArray[0]);
		System.out.println(dynamicAssignedArray[6]);
		System.out.println(dynamicAssignedArray[8]);
		
// using for loop to dynamically assign values to array
		
		int[] loopArray = new int[15];
		
		for(int i = 0; i < loopArray.length; i ++) {
			loopArray[i] = i * 10;
		}
		
		for (int i = 0; i < loopArray.length; i ++) {
			System.out.println("Element" + i + " , value is " + loopArray[i]);
		}
		
		
// method array call with loopArrary 15 elements inside it.
		methodArray(loopArray);
		
		
		
		
		int[] scanArray = getIntegers(5);
		
		// to confirm
		for (int i = 0; i < scanArray.length; i ++) {
			System.out.println("Element " + i + " typed value was " + scanArray[i]);
		}
		
		
		System.out.println("The average of the array from user input is : " + getAverage(scanArray));
		
		
// for-each method in an array
// for each index , String i, print the values in cars array
		
		String[] cars = {"tesla", "ford", "mazda", "bmw", "audi"};
		
		for(String i : cars) {
			System.out.println(i);
		}
		
		
// MULTI-DIMENSIONAL ARRAYS == array of arrays.	
// to access: create a variable to store new array, then specify FIRST: index of the Array to be accessed, SECOND: index of element to be accessed
		
		int [][] myNumbers = {{1,2,3,4}, {5,6,7}};
		
		int x = myNumbers[1][2];
		System.out.println(x);
		
		// will output 7 since 1 is the second array then 2 is the index of 7 in that second array.
		
		// to print out multi dimensional arrays using for loop.
		// first is to loop through myNumbers
		// then
		int[][] myNumbers2 = {{10,14,12}, {22,33,44}};
		
			for(int i = 0; i<myNumbers2.length; i++) {
				for(int j = 0; j < myNumbers2[i].length; ++j) {
					System.out.println(myNumbers2[i][j]);
				}
			}
		
// ========================below is the end of main line 
	} 
	
	
	
	// creating method to pass array
	
	public static void methodArray(int[] methodPassingArray) {
		
		for(int i = 0; i < methodPassingArray.length; i++) {
			System.out.println("The i is: " + i + " and the value inside the array is :" + methodPassingArray[i]);
		}
	}
	
	// numbers is the number of elements
	// values is defining new int array that takes in the int from numbers, input by user
	// values tell the method how many elements the user wants in the array via scanner
	// \r allows to enter values on the next line
	
	
	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values. \r");
		int[] values = new int[number];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
			
		}
		return values;
	}
	
	// method to average the array
	
	public static double getAverage(int[] array) {
		int sum = 0;
				for (int i = 0; i < array.length; i ++) {
					sum += array[i];
				}
		return (double) sum / (double) array.length;
	
	}
	
	

}
