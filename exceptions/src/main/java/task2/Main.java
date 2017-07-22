package task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws NoPropertiesFileFoundException, FileNotFoundException {

        Map<String,String> properties = new HashMap<>();
        String file = "/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/exceptions/src/main/resources/prop.properties";
        File propFile = new File(file);


        if (!propFile.exists()) {
            throw new NoPropertiesFileFoundException(file);
        }

        loadProperties(file, properties);


    }

    public static void loadProperties(String file, Map<String,String> prop) throws FileNotFoundException{
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                String tempAr[] = temp.split("=");
                prop.put(tempAr[0].trim(), tempAr[1].trim());
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
