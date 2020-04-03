package Game.Grid;

import Game.Player.Move;

import java.util.HashMap;

public class Grid {

    private final int x, y;
    private HashMap<Integer, HashMap<Integer, Cell>> grid = new HashMap<>();

    public String getCellOwner(int x, int y){
        return grid.get(x).get(y).getOwner();
    }

    public int getX() {
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Grid(int gridLength) {
        this.x = gridLength;
        this.y = gridLength;
        populateGrid();
    }

    private void populateGrid() {
        for (int x = 0; x < this.x; x++) {
            HashMap<Integer, Cell> cellMap = new HashMap<>();
            for (int y = 0; y < this.y; y++) {
                cellMap.put(y, new Cell());
            }
            grid.put(x, cellMap);
        }
    }

    public Boolean checkValidMove(Move move) {
        if(grid.get(move.x()).get(move.y()).getOwner() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void displayGrid() {
        for (int x = 0; x < this.x; x++) {
            for (int y = 0; y < this.y; y++) {
                Cell cell = grid.get(x).get(y);
                System.out.println("x = " + x + " y = " + y + " Owner = " + cell.getOwner());
            }
        }
    }

    public void makeMove(Move move) {
        this.grid.get(move.x()).get(move.y()).setOwner(move.player());
    }

}