import java.util.Scanner;

public class GuessingGame {

	public GuessingGame() {
		try {
		boolean playing = true;
		int numGuesses = 0;
		Scanner scanner = new Scanner(System.in);
		while (playing == true) {
			int randomNum = (int) (Math.random() * 51);
			while (playing == true) {
				System.out.println("Guess what the random number is (0-50)");
				String input = scanner.nextLine();
				int guess = Integer.parseInt(input);
				if (guess > randomNum) {
					System.out.println("Your number is too high");
					numGuesses++;
				} else if (guess < randomNum) {
					System.out.println("Your number is too low");
					numGuesses++;
				} else if (guess == randomNum) {
					numGuesses++;
					System.out.println("Congratulations! You guessed the number.");
					System.out.println("It took you " + numGuesses + " tries");
					System.out.println("Would you like to play again");
					numGuesses = 0;
					playing = false;
					
				}
			}
			String input2 = scanner.nextLine();
			if (input2.equals("yes") || input2.equals("y") || input2.equals("Yes") || input2.equals("YES")) {
				playing = true;

			} else {
				playing = false;
				System.out.println("Thank you for playing with us");
			}
		}
		}catch(Exception E) {
			System.out.println("It looks like you didn't type a number... restarting");
			startAgain();
		}
	}
	
	
	private void startAgain() {
		new GuessingGame();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new GuessingGame();
	}

}
