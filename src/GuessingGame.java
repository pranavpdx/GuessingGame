import java.util.Scanner;

/*
 * This program generates a random number and tells the user to guess what it is.
 * Author: Pranav Sharma
 * Date: 9/7/18
 */
public class GuessingGame {
	/*
	 * This constructor executes the actual guessing game code
	 */
	public GuessingGame() {
		// boolean to check if the game should keep running
		boolean playing = true;
		// keeps track of guesses
		int numGuesses = 0;
		Scanner scanner = new Scanner(System.in);
		// keeps running until user says (s)he doesn't want to play anymore
		while (playing == true) {
			// random number generator
			int randomNum = (int) (Math.random() * 51);
			// During the game this loop checks if the number is too high, too low, or the
			// exact same, if same it prints the guesses and asks if user wants to play
			// again
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
			// checks if user wants to keep playing
			String input2 = scanner.nextLine();
			if (input2.equals("yes") || input2.equals("y") || input2.equals("Yes")) {
				playing = true;

			} else {
				playing = false;
				System.out.println("Thank you for playing!!");
			}
		}

	}

	// Main method that calls the constructor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessingGame();
		
	}

}
