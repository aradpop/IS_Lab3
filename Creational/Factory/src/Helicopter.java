public class Helicopter implements Transport {
    public void deliverMail(Mail mail) {
        System.out.println("Mail delivered by helicopter. Content: " + mail.getMail());
    }
}