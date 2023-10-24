public class Main {
    public static void main(String[] args) {
        Printer printer1 = new StringPrinter();
        Printer printer2 = new RedPrinterDecorator(printer1);
        Printer printer3 = new GreenPrinterDecorator(printer2);
        Printer printer4 = new BluePrinterDecorator(printer3);
        printer4.printData("TEST");
    }
}