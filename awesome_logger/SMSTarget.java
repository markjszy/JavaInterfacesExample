public class SMSTarget implements LogTarget {
    public void logMessage(String message) {
        System.out.println(String.format("'%s' sent via text!", message));
    }
}
