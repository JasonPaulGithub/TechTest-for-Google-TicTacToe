package Game.Grid;

public class Cell {

    private String ownedBy;

    public void setOwner(String player) {
        this.ownedBy = player;
    }

    public String getOwner() {
        return ownedBy;
    }
}
