import java.util.List;
import java.util.ArrayList;

public class AwesomeLogger {
    private List<LogTarget> logTargets;

    public AwesomeLogger() {
        logTargets = new ArrayList<>();
    }

    public void addLogTarget(LogTarget logTarget) {
        logTargets.add(logTarget);
    }

    public void logEverywhere(String message) {
        for (var logTarget : logTargets) {
            logTarget.logMessage(message);
        }
    }
}