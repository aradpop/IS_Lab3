public class ConcreteSubscriber implements NewspaperSubscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    public void newIssueOut(String name) {
        System.out.println("Subscriber " + this.name + " notified of new newspaper with name = " + name);
    }
}