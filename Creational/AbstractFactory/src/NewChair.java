public class NewChair implements Chair {
    public boolean hasLegs() {
        return false;
    }

    public void sitOn() {
        System.out.println("Sitting on modern chair.");
    }
}