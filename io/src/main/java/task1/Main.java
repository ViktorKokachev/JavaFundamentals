package task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Main class for first task
 */

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> keyWordCounter = new HashMap<>();
        File keywords = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/keywords");
        File source = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/code.java");

        readKeyWords(keywords, keyWordCounter);
        System.out.println(keyWordCounter);
        readSourceFile(source, keyWordCounter);
        System.out.println(keyWordCounter);

    }

    private static void readKeyWords (File file, Map<String,Integer> keyWordCounter) {
        String[] lines = readFromFileToStringBuilder(file).toString().split("\\n");

        for(String string : lines) {
            keyWordCounter.put(string, 0);
        }
    }

    private static void readSourceFile (File file, Map<String,Integer> keyWordCounter) {
        String[] strings = readFromFileToStringBuilder(file).toString().split("\\s");

        for (String string : strings) {
            if (keyWordCounter.containsKey(string)) {
                keyWordCounter.put(string, keyWordCounter.get(string) + 1);
            }
        }
    }

    private static StringBuilder readFromFileToStringBuilder (File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {

            final int bufferSize = 1024;
            final char[] buffer = new char[bufferSize];
            final StringBuilder out = new StringBuilder();

            InputStreamReader in = new InputStreamReader(fileInputStream);
            for (; ; ) {
                int rsz = in.read(buffer, 0, buffer.length);
                if (rsz < 0)
                    break;
                out.append(buffer, 0, rsz);
            }

            return out;
        }

        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            return new StringBuilder();
        }
    }
}
