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

        switch (inputToArray[0]) {
            case "showcatalog":
                showCatalog();
                break;
            case "showfile":
                showFile();
                break;
            case "makefile":
                makeFile();
                break;
            case "deletefile":
                deleteFile();
                break;
            case "writetofile":
                writeToFile();
                break;
            case "apendtofile":
                appendToFile();
                break;
            default:
                System.out.println("ALLE");
                break;

            }
        }


    public static void showCatalog () {
        System.out.println("do showcatalog");
    }

    public static void showFile () {
        System.out.println("do showfile");
    }

    public static void makeFile () {
        System.out.println("do makefile");
    }

    public static void deleteFile () {
        System.out.println("do deletefile");
    }

    public static void writeToFile () {
        System.out.println("do writetofile");
    }

    public static void appendToFile () {
        System.out.println("do apendtofile");
    }
}
