package Game.Algorithums;

import Game.Grid.Grid;
import Game.Player.WinToken;

import java.util.ArrayList;
import java.util.Collections;

abstract class Algorithm {

    Grid grid;
    String playerName, winCondition;
    WinToken winToken;
    ArrayList<String> list = new ArrayList<>();

    public Algorithm(Grid grid, String playerName, WinToken winToken) {
        this.grid = grid;
        this.playerName = playerName;
        this.winToken = winToken;
    }

    public WinToken getToken(){
        runAlgorithm();
        int occ = Collections.frequency(list, playerName);
        if (occ == grid.getX()) {
            winToken.setWin(playerName, winCondition);
            return winToken;
        }
        return winToken;
    }

    public void runAlgorithm() {
    }
}

