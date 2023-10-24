public class GroundMailTrain extends Mail {
    public Transport createTransport() {
        return new Train();
    }
}