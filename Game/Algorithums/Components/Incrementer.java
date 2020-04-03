package Game.Algorithums.Components;

public class Incrementer {
    private int value;
    private int maxValue;
    private boolean isValid = true;

    public boolean isValid(){
        return isValid;
    }

    public Incrementer(int value, int maxValue) {
        this.value = value;
        this.maxValue = maxValue;
    }

    public int getValue(){
        if(value < maxValue){
            int val = value;
            value++;
            return val;
        } else {
            isValid = false;
        }
        return maxValue;
    }
}

