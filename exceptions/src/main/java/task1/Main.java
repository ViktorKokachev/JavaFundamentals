package task1;

/*
TODO:
-delete file
-write in file
-append to file
 */

import java.io.*;
import java.nio.file.NoSuchFileException;
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
        System.out.println("Type 'makefile <fullpath>' to make new file in <fullpath>");
        System.out.println("Type 'deletefile <fullpath>' to delete file in <fullpath>");
        System.out.println("Type 'writetofile <fullpath>' to write to file in <fullpath>. Input your text data in the next step.");
        System.out.println("Type 'appendtofile <fullpath>' to append data to file in <fullpath>. Input your text data in the next step.");
        System.out.println("Type 'stop' to stop the app");

        Scanner scanner = new Scanner(System.in);
        String[] inputToArray = scanner.nextLine().split(" ");

        if (inputToArray[0].equals("stop")) {
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
                System.out.println("There are no files in this catalog");
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
        File folder = new File(path);
        if (!folder.isFile()) {
            try {
                throw new PathToFileNotFoundEcxeption(path);
            }
            catch (PathToFileNotFoundEcxeption e) {
                System.out.println("Returning to beginning...");
            }
        }

        else {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                System.out.println(sb);
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void makeFile (String path) {
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
            System.out.println("Input name of the .txt file");
            Scanner scanner = new Scanner(System.in);
            String[] name = scanner.nextLine().split(" ");
            if (name.length != 1 || nameContainsIllegalCharacters(name[0])) {
                try {
                    throw new NotCorrectNameException(name);
                } catch (NotCorrectNameException e) {
                    System.out.println("Returning to beginning...");
                }

            } else {
                StringBuilder sb = new StringBuilder(path)
                        .append(File.separator)
                        .append(name[0])
                        .append(".txt");

                try {
                    File file = new File(sb.toString());

                    if (file.createNewFile()){
                        System.out.println("File is created!");
                    } else {
                        System.out.println("File already exists.");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void deleteFile (String path) {
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
            System.out.println("Input name of the .txt file");
            Scanner scanner = new Scanner(System.in);
            String[] name = scanner.nextLine().split(" ");
            if (name.length != 1 || nameContainsIllegalCharacters(name[0])) {
                try {
                    throw new NotCorrectNameException(name);
                } catch (NotCorrectNameException e) {
                    System.out.println("Returning to beginning...");
                }

            } else {
                StringBuilder sb = new StringBuilder(path)
                        .append(File.separator)
                        .append(name[0])
                        .append(".txt");

                try {
                    File file = new File(sb.toString());
                    if(file.delete()) {
                        System.out.println(file.getName() + " is deleted!");
                    } else {
                        System.out.println("Delete operation is failed.");
                        throw new SuchFileDoesNotExistException(sb.toString());
                    }
                } catch(SuchFileDoesNotExistException e) {
                    System.out.println("Returning to beginning...");
                }
            }
        }
    }

    public static void writeToFile (String path) {
        System.out.println("do writetofile");
    }

    public static void appendToFile (String path) {
        System.out.println("do apendtofile");
    }

    private static boolean nameContainsIllegalCharacters (String inputStr)
    {
        final char[] ILLEGAL_CHARACTERS = { '/', '\n', '\r', '\t', '\0', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':' };

        for (int i = 0; i < ILLEGAL_CHARACTERS.length; i++)
        {
            if (inputStr.indexOf(ILLEGAL_CHARACTERS[i]) != -1)
            {
                return true;
            }
        }
        return false;
    }

}


