import java.util.ArrayList;

public class NewspaperPublisher {
    private ArrayList<NewspaperSubscriber> subscribers = new ArrayList<NewspaperSubscriber>();

    public void subscribe(NewspaperSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(NewspaperSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void publish(String name) {
        for (NewspaperSubscriber subscriber : this.subscribers)
            subscriber.newIssueOut(name);
    }
}