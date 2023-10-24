public class Main {
    public static void main(String[] args) {
        NewspaperSubscriber sub1 = new ConcreteSubscriber("Ion");
        NewspaperSubscriber sub2 = new ConcreteSubscriber("Vasile");
        NewspaperSubscriber sub3 = new ConcreteSubscriber("Gheorghe");

        NewspaperPublisher publisher = new NewspaperPublisher();

        publisher.subscribe(sub1);
        publisher.subscribe(sub2);
        publisher.subscribe(sub3);

        publisher.publish("First edition");

        publisher.unsubscribe(sub2);
        publisher.publish("Second edition");
    }
}