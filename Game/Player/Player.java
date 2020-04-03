package Game.Player;

import Game.Grid.Grid;

public class Player {

    private Move move;
    private String name;
    private int maxGuess;
    private Boolean validMove = false;

    public String name() {
        return name;
    }

    public Player(int gridSize) {
        this.maxGuess = gridSize;
        String hashTag = String.valueOf(this.hashCode());
        name = "Mr Robot " + hashTag.substring(0, 3);
    }

    public void generateMove(Grid grid){
        Move move = new Move(name, maxGuess);
        if (this.validMove = grid.checkValidMove(move)){
            this.move = move;
        };
    }

    public Boolean madeValidMove() {
        return this.validMove;
    }

    public Grid takeTurn(Grid grid) {
        grid.makeMove(move);
        return grid;
    }

}
