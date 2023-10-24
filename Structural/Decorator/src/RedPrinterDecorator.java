public class RedPrinterDecorator extends PrinterDecorator {
    public RedPrinterDecorator(Printer printer) {
        super(printer);
    }

    public void printData(String data) {
        super.printData(data);
        System.out.println("\u001B[31m" + data);
    }
}