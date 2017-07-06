package task1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * CrazyLogger
 */
public class CrazyLogger {
    private StringBuilder logStorage = new StringBuilder();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY : HH-mm");

    public void addLog(String message) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.systemDefault());
        logStorage.append(formatter.format(dateTime));
        logStorage.append(String.format(" - %s;\n", message));
    }

    public String extractByTime () {
        return null;
    }

    public List<String> findList(String s) {
        List<String> result = new ArrayList<>();

        if (logStorage.length() == 0) return result;

        String[] lines = logStorage.toString().split("\n");
        for (String line : lines) {
            if (line.toLowerCase().contains(s.toLowerCase())) {
                result.add(line);
            }
        }

        return result;
    }

    public String findStrings(String s) {
        StringBuilder builder = new StringBuilder();
        List<String> strings = findList(s);
        for (String string : strings) {
            builder.append(string);
        }

        return builder.toString();
    }
}
