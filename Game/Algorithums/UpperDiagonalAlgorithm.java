package Game.Algorithums;

import Game.Algorithums.Components.Incrementer;
import Game.Grid.Grid;
import Game.Player.WinToken;

public class UpperDiagonalAlgorithm extends Algorithm {

    public UpperDiagonalAlgorithm(Grid grid, String playerName, WinToken winToken) {
        super(grid, playerName, winToken);
        winCondition = "Upper-Diagonal Axis";
    }

    @Override
    public void runAlgorithm() {
        Incrementer inc1 = new Incrementer(0, grid.getX() - 1);
        Incrementer inc2 = new Incrementer(0, grid.getX() - 1);

        while (inc1.isValid() && inc2.isValid()) {
            list.add(grid.getCellOwner(inc1.getValue(), inc2.getValue()));
        }
    }
}
