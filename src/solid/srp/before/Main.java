package solid.srp.before;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail("jcgarciamed@gmail.com", "knoresv@gmail.com");
        emailSender.saveEmailLog("knoresv@gmail.com", "This is a greeting" +
                "message");
    }
}
