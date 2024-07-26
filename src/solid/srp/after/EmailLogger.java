package solid.srp.after;

public class EmailLogger {
    public void saveEmailLog(String recipient, String message) {
        System.out.printf("save email log to %s: %s%n", recipient, message);
    }
}
