package Game.Player;

import java.util.Random;

public class Move {

    private final String playerName;
    private int maxGuess;
    private int x;
    private int y;

    public String player() {
        return playerName;
    }
    public int x() {
        return x;
    }
    public int y() {
        return y;
    }

    public Move(String playerName, int maxGuess) {
        this.playerName = playerName;
        this.maxGuess = maxGuess;
        generate();
    }

    public void generate() {
        Random random = new Random();
        this.x = random.nextInt(maxGuess);
        this.y = random.nextInt(maxGuess);
    }
}
