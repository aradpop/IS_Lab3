public class Main {
    public static void main(String[] args) {
        Mail mail1 = new AirMailPlane();
        Mail mail2 = new AirMailHelicopter();
        Mail mail3 = new GroundMailTruck();
        Mail mail4 = new GroundMailTrain();

        mail1.setMail("MESSAGE BY PLANE");
        mail2.setMail("MESSAGE BY HELICOPTER");
        mail3.setMail("MESSAGE BY TRUCK");
        mail4.setMail("MESSAGE BY TRAIN");

        mail1.deliverMail();
        mail2.deliverMail();
        mail3.deliverMail();
        mail4.deliverMail();
    }
}