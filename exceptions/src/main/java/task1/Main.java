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
        welcomeCommand();

    }

    public static void welcomeCommand() {
        System.out.println("What do you want to do?");
        System.out.println("Type 'showcatalog <fullpath>' to show files in catalog <fullpath>");
        System.out.println("Type 'showfile <fullpath>' to show file with full path <fullpath>");
        System.out.println("Type 'makefile <fullpath>' to make new file with <fullpath>");
        System.out.println("Type 'deletefile <fullpath>' to delete file with <fullpath>");
        System.out.println("Type 'writetofile <fullpath>' to write to file with <fullpath>. Input your text data in the next step.");
        System.out.println("Type 'appendtofile <fullpath>' to append data to file with <fullpath>. Input your text data in the next step.");

        Scanner scanner = new Scanner(System.in);
        String[] inputToArray = scanner.nextLine().split(" ");

        if (inputToArray.length != 2) {
            try {
                throw new CommandNotFoundException(inputToArray[0]);
            }
            catch (CommandNotFoundException e) {
                welcomeCommand();
            }
        }
        else {
            switch (inputToArray[0]) {
                case "showcatalog":
                    showCatalog(inputToArray);
                    break;
                case "showfile":
                    showFile(inputToArray);
                    break;
                case "makefile":
                    makeFile(inputToArray);
                    break;
                case "deletefile":
                    deleteFile(inputToArray);
                    break;
                case "writetofile":
                    writeToFile(inputToArray);
                    break;
                case "apendtofile":
                    appendToFile(inputToArray);
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


    public static void showCatalog (String[] inputToArray) {


        System.out.println("do showcatalog");
    }

    public static void showFile (String[] inputToArray) {
        System.out.println("do showfile");
    }

    public static void makeFile (String[] inputToArray) {
        System.out.println("do makefile");
    }

    public static void deleteFile (String[] inputToArray) {
        System.out.println("do deletefile");
    }

    public static void writeToFile (String[] inputToArray) {
        System.out.println("do writetofile");
    }

    public static void appendToFile (String[] inputToArray) {
        System.out.println("do apendtofile");
    }
}


