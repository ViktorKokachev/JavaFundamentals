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

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            welcomeCommand();
            System.out.println();
        }

    }

    public static void welcomeCommand() {
        System.out.println("What do you want to do?");
        System.out.println("Type 'showcatalog <fullpath>' to show files in catalog <fullpath>");
        System.out.println("Type 'showfile <fullpath>' to show file with full path <fullpath>");
        System.out.println("Type 'makefile <fullpath>' to make new file with <fullpath>");
        System.out.println("Type 'deletefile <fullpath>' to delete file with <fullpath>");
        System.out.println("Type 'writetofile <fullpath>' to write to file with <fullpath>. Input your text data in the next step.");
        System.out.println("Type 'appendtofile <fullpath>' to append data to file with <fullpath>. Input your text data in the next step.");
        System.out.println("Type 'stop' to stop the app");

        Scanner scanner = new Scanner(System.in);
        String[] inputToArray = scanner.nextLine().split(" ");

        if (inputToArray[0].equals("stop")) {
            scanner.close();
            System.exit(0);
        }

        else {
            if (inputToArray.length != 2) {
                try {
                    throw new CommandNotFoundException(inputToArray[0]);
                } catch (CommandNotFoundException e) {
                    welcomeCommand();
                }
            } else {
                switch (inputToArray[0]) {
                    case "showcatalog":
                        showCatalog(inputToArray[1]);
                        break;
                    case "showfile":
                        showFile(inputToArray[1]);
                        break;
                    case "makefile":
                        makeFile(inputToArray[1]);
                        break;
                    case "deletefile":
                        deleteFile(inputToArray[1]);
                        break;
                    case "writetofile":
                        writeToFile(inputToArray[1]);
                        break;
                    case "apendtofile":
                        appendToFile(inputToArray[1]);
                        break;
                    default:
                        try {
                            throw new CommandNotFoundException(inputToArray[0]);
                        } catch (CommandNotFoundException e) {
                            welcomeCommand();
                        }
                    }
                }
            }
        }


    public static void showCatalog (String path) {

        File folder = new File(path);
        if (!folder.isDirectory()) {
            try {
                throw new CatalogNotFoundEcxeption(path);
            }
            catch (CatalogNotFoundEcxeption e) {
                System.out.println("Returning to beginning...");
            }
        }
        else {
            File[] listOfFiles = folder.listFiles();

            if (listOfFiles.length == 0) {
                System.out.println("There is no files in this catalog");
            }
            else {
                for (File file : listOfFiles) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            }
        }
    }

    public static void showFile (String path) {
        System.out.println("do showfile");
    }

    public static void makeFile (String path) {
        System.out.println("do makefile");
    }

    public static void deleteFile (String path) {
        System.out.println("do deletefile");
    }

    public static void writeToFile (String path) {
        System.out.println("do writetofile");
    }

    public static void appendToFile (String path) {
        System.out.println("do apendtofile");
    }

}


