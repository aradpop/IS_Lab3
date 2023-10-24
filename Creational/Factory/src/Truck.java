public class Truck implements Transport {
    public void deliverMail(Mail mail) {
        System.out.println("Mail delivered by truck. Content: " + mail.getMail());
    }
}