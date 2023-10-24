public abstract class Mail {
    private String mailText;

    public abstract Transport createTransport();

    public void setMail(String text) {
        this.mailText = text;
    }

    public String getMail() {
        return this.mailText;
    }

    public void deliverMail() {
        Transport transport = createTransport();
        transport.deliverMail(this);
    }
}