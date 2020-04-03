package Game.Algorithums.Components;

public class Decrementer {
    private int value;
    private int minValue;
    private boolean isValid = true;

    public boolean isValid(){
        return isValid;
    }

    public Decrementer(int value, int minValue) {
        this.value = value;
        this.minValue = minValue;
    }

    public int getValue(){
        if(value > minValue){
            int val = value;
            value--;
            return val;
        } else {
            isValid = false;
        }
        return minValue;
    }
}
