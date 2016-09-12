package lab12;

import java.util.Scanner;

public class RoshamboGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Player opponent = null;
		Roshambo opponentChoice;
		String ch = "y";
		while (ch.equals("y")) {
			System.out.println("Welcome to Rock Paper Scissors");
			System.out.println("Enter your name");
			String userInput = sc.next();
			System.out.println("Do you want to play with random or rock?");
			String choice = sc.next();

			switch (choice) {
			case "random":
				opponent = new RandomPlayer("Random player");
				 opponentChoice = opponent.generateRoshambo();
				break;
			case "rock":
				opponent = new RockPlayer("Rock player");
				 opponentChoice = opponent.generateRoshambo();
				break;
			default:
				throw new IllegalArgumentException("Please type random or rock.");

			}
		   
			ScannerPlayer player = new ScannerPlayer("Scanner Player");
			Roshambo userChoice = player.generateRoshambo();
		    System.out.println(userInput + " : " + userChoice);
		    System.out.println("opponent" + " : " + opponentChoice);
		    
			
			

			if (userChoice == opponentChoice) {
				System.out.println("Draw!");
			} else if (userChoice == Roshambo.PAPER && opponentChoice == Roshambo.ROCK) {
				System.out.println(userInput + " : " + "Wins!");
			} else if (opponentChoice == Roshambo.PAPER && userChoice == Roshambo.ROCK) {
				System.out.println(opponent + " : " + "Wins!");
			} else if (userChoice == Roshambo.PAPER && opponentChoice == Roshambo.SCISSORS) {
				System.out.println(userInput + " : " + "Wins!");
			} else if (opponentChoice == Roshambo.PAPER && userChoice == Roshambo.ROCK) {
				System.out.println(opponent + " : " + "Wins!");
			} else if (userChoice == Roshambo.SCISSORS  && opponentChoice == Roshambo.ROCK) {
				System.out.println(userInput + " : " + "Wins!");
			} else if (opponentChoice == Roshambo.SCISSORS  && userChoice == Roshambo.ROCK) {
				System.out.println(opponent + " : " + "Wins!");
			}
			
			System.out.println("Continue (y/n):");
			ch = sc.next();
			
		}
		sc.close();
		System.out.println("Bye");

	}

}
