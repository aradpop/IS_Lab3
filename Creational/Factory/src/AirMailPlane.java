public class AirMailPlane extends Mail {
    public Transport createTransport() {
        return new Plane();
    }
}