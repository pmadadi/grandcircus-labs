package lab12;

import java.util.Random;
import java.util.Scanner;

public class RandomPlayer extends Player {

	public RandomPlayer(String playerName) {
		super(playerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		int random = (int) (Math.random() * 3) + 1;
		switch (random) {
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		case 3:
			return Roshambo.SCISSORS;
		}
		return null;

		
	}

	@Override
	public String toString() {
		return "RandomPlayer [generateRoshambo()=" + generateRoshambo() + "]";
	}

	
}
