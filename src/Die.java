public class Die {
    private int type;
    private int value;

    public Die(int type){
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
