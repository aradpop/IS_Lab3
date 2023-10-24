public class Plane implements Transport {
    public void deliverMail(Mail mail) {
        System.out.println("Mail delivered by plane. Content: " + mail.getMail());
    }
}
