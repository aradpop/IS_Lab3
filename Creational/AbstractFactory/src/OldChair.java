public class OldChair implements Chair {
    public boolean hasLegs() {
        return true;
    }

    public void sitOn() {
        System.out.println("Sitting on old chair.");
    }
}