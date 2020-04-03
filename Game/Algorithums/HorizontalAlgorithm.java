package Game.Algorithums;

import Game.Grid.Grid;
import Game.Player.WinToken;

public class HorizontalAlgorithm extends Algorithm {

    public HorizontalAlgorithm(Grid grid, String playerName, WinToken winToken) {
        super(grid, playerName, winToken);
        winCondition = "Horizontal Axis";
    }

    public void runAlgorithm() {
        for (int x = 0; x < grid.getX(); x++) {
            for (int y = 0; y % grid.getY() == 0; y++) {
                list.add(grid.getCellOwner(y, x));
            }
        }
    }
}
