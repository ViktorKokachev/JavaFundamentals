package task1;

/*
TODO:
catalog:
-show list of files in <path>
file:
-delete <full path name>
-show <file>
-create file with name in <path>
-write in file
-append to file
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        welcomeCommand(stringBuilder);

    }

    public static void welcomeCommand(StringBuilder stringBuilder) {
        System.out.println("What do you want to do?");
        System.out.println("Type 'showcatalog <fullpath>' to show files in catalog");
        System.out.println("Type 'showfile <fullpath>' to show file");
        System.out.println("Type 'makefile <fullpath>' to show files in catalog");
        System.out.println("Type 'deletefile <fullpath>' to show files in catalog");
        System.out.println("Type 'writetofile <fullpath>' to show files in catalog");
        System.out.println("Type 'appendtofile <fullpath>' to show files in catalog");

        Scanner scanner = new Scanner(System.in);
        String[] inputToArray = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(inputToArray));
    }

    public static void showCatalog () {

    }

    public static void showFile () {

    }

    public static void makeFile () {

    }

    public static void deleteFile () {

    }

    public static void writeToFile () {

    }

    public static void appendToFile () {

    }
}
