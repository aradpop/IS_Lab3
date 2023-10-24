public class Button {
    private String name;
    private Command command;

    public Button(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        this.command.setData(this.name);
        this.command.execute();
    }
}
