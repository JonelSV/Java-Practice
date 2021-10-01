package JavaPractice;

public class MethodsChallenge {

	public static void main(String[] args) {
		
		int playerScore = calculateHighScorePosition(1500);
		
		displayHighScorePosition("Tim", playerScore);
		
		// another way of doing above
		
		displayHighScorePosition("Mark", calculateHighScorePosition(900));
		displayHighScorePosition("Cesar", calculateHighScorePosition(400));
		displayHighScorePosition("Julius", calculateHighScorePosition(50));
		
//		System.out.println("The high score is: " + calculateHighScorePosition(700));
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if(score >= 1000) {
			return 1;
		}else if(score >= 500 && score < 1000) {
			return 2;
		}else if( score >= 100 && score < 500) {
			return 3;
		}else {
			return 4;	
		}
	}

	
	public static void displayHighScorePosition(String playerName, int position) {
		
		System.out.println(playerName  + " managed to get to position: " + position + " on the highschore table");
	}
	
}
