public class Train implements Transport {
    public void deliverMail(Mail mail) {
        System.out.println("Mail delivered by train. Content: " + mail.getMail());
    }
}