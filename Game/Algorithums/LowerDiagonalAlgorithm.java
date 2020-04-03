package Game.Algorithums;

import Game.Algorithums.Components.Decrementer;
import Game.Algorithums.Components.Incrementer;
import Game.Grid.Grid;
import Game.Player.WinToken;

public class LowerDiagonalAlgorithm extends Algorithm {

    public LowerDiagonalAlgorithm(Grid grid, String playerName, WinToken winToken) {
        super(grid, playerName, winToken);
        winCondition = "Lower-Diagonal Axis";
    }

    @Override
    public void runAlgorithm() {
        Decrementer dec = new Decrementer(grid.getX() - 1, 0);
        Incrementer inc = new Incrementer(0, grid.getY() - 1);

        while (dec.isValid() && inc.isValid()) {
            list.add(grid.getCellOwner(dec.getValue(), inc.getValue()));
        }
    }
}