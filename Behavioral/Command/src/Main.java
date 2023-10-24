public class Main {
    public static void main(String[] args) {
        Button redButton = new Button("RED");
        Button greenButton = new Button("GREEN");
        Button blueButton = new Button("BLUE");

        redButton.setCommand(new PrintRedCommand());
        greenButton.setCommand(new PrintGreenCommand());
        blueButton.setCommand(new PrintBlueCommand());

        redButton.click();
        greenButton.click();
        blueButton.click();
        greenButton.click();
        redButton.click();
    }
}