package JavaPractice;

// integer array, 10 is number of elements assigned in the array


public class ArraysTim {

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
		
		
		
		
		
		
	}
	
	// creating method to pass array
	
	public static void methodArray(int[] methodPassingArray) {
		
		for(int i = 0; i < methodPassingArray.length; i++) {
			System.out
		}
	}
	
	
	

}
