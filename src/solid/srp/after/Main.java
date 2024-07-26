package solid.srp.after;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail("jcgarciamed@gmail.com", "knoresv@gmail.com");
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.saveEmailLog("knoresv@gmail.com", "This is a greeting" +
                "message");
    }
}
