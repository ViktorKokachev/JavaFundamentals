package task1;

public class SuchFileDoesNotExistException extends Throwable{
    public SuchFileDoesNotExistException(String string) {
        System.out.printf("File with path %s wasn't found. \nType correct path\n", string);
    }
}
