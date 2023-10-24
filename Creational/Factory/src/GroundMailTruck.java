public class GroundMailTruck extends Mail {
    public Transport createTransport() {
        return new Truck();
    }
}
