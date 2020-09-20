public class RunDemo {
    public static void main(String[] args) {
        var awesomeLogger = new AwesomeLogger();
        awesomeLogger.addLogTarget(new SMSTarget());
        awesomeLogger.addLogTarget(new EmailTarget());
        awesomeLogger.addLogTarget(new BannerInTheSky());

        awesomeLogger.logEverywhere("Here is a message!");
    }
}
