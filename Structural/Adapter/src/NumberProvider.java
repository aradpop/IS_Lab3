public class NumberProvider implements StringProvider {
    private int data;

    public NumberProvider(int data) {
        this.data = data;
    }

    public String getData() {
        return "Number = " + this.data;
    }
}