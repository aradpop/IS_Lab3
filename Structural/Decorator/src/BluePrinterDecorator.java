public class BluePrinterDecorator extends PrinterDecorator {
    public BluePrinterDecorator(Printer printer) {
        super(printer);
    }

    public void printData(String data) {
        super.printData(data);
        System.out.println("\u001B[34m" + data);
    }
}