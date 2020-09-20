public class BannerInTheSky implements LogTarget {
    @Override
    public void logMessage(String message) {
        System.out.println(String.format("Writing '%s' in the sky!", message));
    }
}
