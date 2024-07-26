package solid.srp.after;

public class EmailSender {
    public void sendEmail(String from, String to) {
        System.out.printf("Email sent to %s from: %s%n", to, from);
    }
}
