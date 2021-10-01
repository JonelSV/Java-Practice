package JavaPractice;
import java.util.Scanner;

public class MethodsTim {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a boolean, int, int, int");
		boolean userInputBoolean;
		int userInputInt;
		int userInputInt2;
		int userInputInt3;
		userInputBoolean = scan.nextBoolean(); 
		userInputInt = scan.nextInt();
		userInputInt2 = scan.nextInt();
		userInputInt3 = scan.nextInt();
		
		
//		calculateScore(true, 300, 5, 100);
		calculateScore(userInputBoolean, userInputInt, userInputInt2, userInputInt3);
		System.out.println("Enter another set of values for High Score computation");
		scan.next();
		int highScore = calculateHighScore(userInputBoolean, userInputInt, userInputInt2, userInputInt3);
		System.out.println("The high Score is : " + highScore);
		
		
		
		scan.close();
	}
	
	public static void calculateScore(boolean isGameover, int score, int rounds, int bonus) {
		
		
		
		if(isGameover) {
			int finalScore = score + (rounds * bonus);
			finalScore += 2000;
			System.out.println("The final Score is " + finalScore);
		
		}else {
			System.out.println("Game is not yet over");
		}
		
	}
	
	public static int calculateHighScore(boolean isGameover, int score, int rounds, int bonus) {
		
		
		
		if(isGameover) {
			int highScore = score + (rounds * bonus);
			highScore += 10000;
			return highScore;
		}else {
			return -1;
		}
		
	}
	
	
	
}
