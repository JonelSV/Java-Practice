package JavaPractice;

public class MorePractice {

	public static void main(String[] args) {
		
		// printing characters in a string
		
//		String sampleString = "This is becoming tedious";
//		int length = sampleString.length();
//		System.out.printf("Length of the given string is: ", length);
		
////		int position = 0;
//		while (length > 0) {
//			System.out.println(sampleString.charAt(position));
//			
//			length --;
//			position ++;
//		}
	
// TO DUPLICATE CHARACTERS IN A STRING - wrong
		
//		String stringSample = "Hello Universe";
//		System.out.printf("The String is: %s and the duplicate characters are:", stringSample);
//		
//		char[] characters = stringSample.toCharArray();
//		for(int i=0; i < stringSample.length(); i ++) {
//			for(int x = i+1; x < stringSample.length(); x ++) {
//				if(characters[i] == characters [i]) {
//					System.out.println(characters[i] + ",");
//					break;
//				}
//			}
//		};
	
// TO ADD UP NUMBERS
		
//		int sumTotal = 0, number = 1;
//		
//		while(number <= 10) {
//			sumTotal += number;
//			++number;
//			
//		}
//		
//		System.out.println(sumTotal);
//		
// TO ADD SUM OF EVEN NUMBERS
		
		for( int even = 1; even <= 10; even++) {
			if(even%2 == 0) {
				System.out.println(even + " ");
			}
		}
		
		
		
	}

}
