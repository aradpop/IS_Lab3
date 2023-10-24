public class ValueProviderAdapter implements StringProvider {
    private ValueProvider provider;

    public ValueProviderAdapter(ValueProvider provider) {
        this.provider = provider;
    }

    public String getData() {
        return "Number = " + this.provider.getValue();
    }
}