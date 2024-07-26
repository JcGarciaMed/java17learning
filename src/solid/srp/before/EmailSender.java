package solid.srp.before;

public class EmailSender {
    public void sendEmail(String from, String to) {
        System.out.printf("Email sent to %s from: %s%n", to, from);
    }

    public void saveEmailLog(String recipient, String message) {
        System.out.printf("save email log to %s: %s%n", recipient, message);
    }
}
