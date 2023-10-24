//base decorator, no printing added
public class PrinterDecorator implements Printer {
    private Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    public void printData(String data) {
        this.printer.printData(data);
    }

}