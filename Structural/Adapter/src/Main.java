public class Main {

    public static void printData(StringProvider provider) {
        System.out.println(provider.getData());
    }

    public static void main(String[] args) {
        NumberProvider numberProvider = new NumberProvider(100);
        printData(numberProvider);

        ValueProvider valueProvider = new ValueProvider(101);
        //printData(valueProvider);//nu merge
        ValueProviderAdapter valueProviderAdapter = new ValueProviderAdapter(valueProvider);
        printData(valueProviderAdapter);
    }
}