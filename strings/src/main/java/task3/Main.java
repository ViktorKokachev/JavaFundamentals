package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

/**
 * Mainclass for third task
 */
public class Main {
    public static void main(String[] args) throws URISyntaxException, UnsupportedEncodingException {
        InputStreamReader reader = new InputStreamReader(Main.class.getClassLoader().
                getResourceAsStream("text.html"), "windows-1251");

        try (BufferedReader br = new BufferedReader(reader)) {

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

