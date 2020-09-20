public class EmailTarget implements LogTarget {
    public void logMessage(String message) {
        System.out.println(String.format("Logging '%s' to email!", message));
    }
}
