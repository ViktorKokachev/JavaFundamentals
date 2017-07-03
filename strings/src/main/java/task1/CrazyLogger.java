package task1;

import java.time.format.DateTimeFormatter;

/**
 * CrazyLogger
 */
public class CrazyLogger {
    private StringBuilder logStorage = new StringBuilder();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY : HH-mm");

    public void addLog() {
    }

    public String extractByTime () {
        return null;
    }

    public String extractByMessage () {
        return null;
    }
}
