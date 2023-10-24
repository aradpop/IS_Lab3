//need to interface with ValueProvider, new added class to project
public class ValueProvider {
    private int value;

    public ValueProvider(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}