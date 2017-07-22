package task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
- Как ведет себя map-коллекция если в нее добавить элемент с ключом, который уже присутствует?
- Происходит запись нового элемента по ключу вместо старого.
 */

public class Main {

    public static void main(String[] args) throws NoPropertiesFileFoundException, FileNotFoundException, NoSuchKeyInPropertiesFIleException {

        Map<String,String> properties = new HashMap<>();
        String file = "/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/collections/src/main/resources/prop.properties";
        File propFile = new File(file);
        String key = "db.host";


        if (!propFile.exists()) {
            throw new NoPropertiesFileFoundException(file);
        }

        loadProperties(file, properties);

        if (!properties.containsKey(key)) {
            throw new NoSuchKeyInPropertiesFIleException(key);
        }

        System.out.printf("Value: %s", properties.get(key));


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
