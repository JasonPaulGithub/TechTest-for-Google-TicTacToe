package Game.Player;

// Just a Pojo
public class WinToken {

    private String playerName, winCondition;
    private boolean win = false;

    public String getPlayerName() {
        return playerName;
    }

    public boolean getWin() {
        return win;
    }

    public String getWinCondition() {
        return winCondition;
    }

    public void setWin(String playerName, String winCondition) {
        if(!win){
            this.win = true;
            this.playerName = playerName;
            this.winCondition = winCondition;
        }
    }
}

