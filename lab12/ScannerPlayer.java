package lab12;

import java.util.Scanner;

public class ScannerPlayer extends Player {
	Scanner sc = new Scanner(System.in);

	public ScannerPlayer(String playerName) {
		super(playerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		System.out.println("rock,paper, or scissors?(R/P/S)");
		String userInput = sc.next();
		char firstLetter = userInput.charAt(0);
		if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
			switch (firstLetter) {
			case 'R':
				return Roshambo.ROCK;
			case 'P':
				return Roshambo.PAPER;
			case 'S':
				return Roshambo.SCISSORS;
			}
		}
		return generateRoshambo();
	}
}
