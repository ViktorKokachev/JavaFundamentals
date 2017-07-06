package task2;

import java.util.Scanner;

/**
 * Created by kpkshke on 06.07.17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Choose your language:");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int input = in.nextInt();
        System.out.println("Your input is: " + input);
    }
}
