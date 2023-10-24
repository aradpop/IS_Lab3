public class GreenPrinterDecorator extends PrinterDecorator {
    public GreenPrinterDecorator(Printer printer) {
        super(printer);
    }

    public void printData(String data) {
        super.printData(data);
        System.out.println("\u001B[32m" + data);
    }
}