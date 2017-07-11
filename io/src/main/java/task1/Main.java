package task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Main class for first task
 */

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> keyWordCounter = new HashMap<>();
        File keywords = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/keywords");

        readKeyWords(keywords, keyWordCounter);


    }

    private static void readKeyWords (File file, Map<String,Integer> keyWordCounter) {
        try (FileInputStream in1 = new FileInputStream(file)) {

            final int bufferSize = 1024;
            final char[] buffer = new char[bufferSize];
            final StringBuilder out = new StringBuilder();

            InputStreamReader in = new InputStreamReader(in1);
            for (; ; ) {
                int rsz = in.read(buffer, 0, buffer.length);
                if (rsz < 0)
                    break;
                out.append(buffer, 0, rsz);
            }

            String[] lines = out.toString().split("\\n");

            for(String string : lines) {
                keyWordCounter.put(string, 0);
            }
        }

        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
