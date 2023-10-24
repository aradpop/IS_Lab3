public class PrintBlueCommand implements Command {
    private String data;

    public void execute() {
        System.out.println("\u001B[34m" + data);
    }

    public void setData(String data) {
        this.data = data;
    }
}