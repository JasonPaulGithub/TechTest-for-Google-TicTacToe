package Game;

import Game.Algorithums.HorizontalAlgorithm;
import Game.Algorithums.LowerDiagonalAlgorithm;
import Game.Algorithums.UpperDiagonalAlgorithm;
import Game.Algorithums.VerticalAlgorithm;
import Game.Grid.Grid;
import Game.Player.Player;
import Game.Player.WinToken;

/**
 * SugarApp, for Google. Coded 12/03/2020
 * @author Jason Burley
 * digital@engineer.com
 **/

public class SugarApp {

    private static int gridLength = 5;

    private static Grid grid = new Grid(gridLength);
    private static Player player1 = new Player(gridLength);
    private static Player player2 = new Player(gridLength);
    private static int turns = 0;
    private static WinToken winToken = new WinToken();
    private static Player currentPlayer;

    public static void main(String[] Args) {

        // Game Loop:
        while (!winToken.getWin()) {
            currentPlayer = determinePlayer();
            turn(currentPlayer);

            if(checkWinningAlgorithms()){
                break;
            }

            if(checkDrawCondition()){
                break;
            }
        }
        // End Game:
        grid.displayGrid();
        printWinMessage();

    }

    private static boolean checkWinningAlgorithms() {
        if (new HorizontalAlgorithm(grid, currentPlayer.name(), winToken).getToken().getWin()) {
            return true;
        }

        if (new VerticalAlgorithm(grid, currentPlayer.name(), winToken).getToken().getWin()) {
            return true;
        }

        if (new UpperDiagonalAlgorithm(grid, currentPlayer.name(), winToken).getToken().getWin()) {
            return true;
        }

        if (new LowerDiagonalAlgorithm(grid, currentPlayer.name(), winToken).getToken().getWin()) {
            return true;
        }
        return false;
    }

    private static boolean checkDrawCondition() {
        if (turns == gridLength * gridLength) {
            winToken.setWin("set to a draw", "both players");
            return true;
        }
        return false;
    }


    public static Player determinePlayer() {
        if ((turns % 2) == 0) {
            return player1;
        } else {
            return player2;
        }
    }

    public static void turn(Player player) {
        player.generateMove(grid);
        if (player.madeValidMove()) {
            grid = player.takeTurn(grid);
            turns++;
        }
    }

    public static void printWinMessage() {
        System.out.println("The winner is " + winToken.getPlayerName() + " by " + winToken.getWinCondition()
                + " in " + turns + " turns!");
    }

}