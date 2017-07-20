package task1;

public class CommandNotFoundException extends Throwable {

    public CommandNotFoundException(String string) {
        System.out.printf("%s wasn't found. Type correct command\n", string);
    }
}
