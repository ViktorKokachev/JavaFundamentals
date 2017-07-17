package task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Main class for 3rd task
 */
public class Main {

    public static void main(String[] args)  {

        List<String> content = new ArrayList<>();

        File source = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/cyrillicinput.txt");
        File output = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/cyrillicoutput.txt");

        StringBuilder text = readUTF8CyrillicFile(source);
        System.out.printf(text.toString());
        writeUTF16CyrillicFile(output, text);
    }

    public static StringBuilder readUTF8CyrillicFile (File file) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), "UTF-8")))
        {
            String s;
            StringBuilder result = new StringBuilder();
            while ((s = in.readLine()) != null) {
                result.append(s).append("\n");
            }

            return result;
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return new StringBuilder();
        }
    }

    public static void writeUTF16CyrillicFile(File file, StringBuilder content) {
        try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), "UTF-16")))
        {
            out.write(content.toString());
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
