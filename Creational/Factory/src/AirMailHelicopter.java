public class AirMailHelicopter extends Mail {
    public Transport createTransport() {
        return new Helicopter();
    }
}
