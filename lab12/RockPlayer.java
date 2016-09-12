package lab12;

public class RockPlayer extends Player {

	public RockPlayer(String playerName) {
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	@Override
	public String toString() {
		return "RockPlayer [generateRoshambo()=" + generateRoshambo() + "]";
	}

}
