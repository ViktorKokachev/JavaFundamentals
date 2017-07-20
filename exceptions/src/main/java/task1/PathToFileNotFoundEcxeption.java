package task1;

public class PathToFileNotFoundEcxeption extends Throwable {

    public PathToFileNotFoundEcxeption(String string) {
        System.out.printf("Path %s wasn't found. \nType correct path", string);
    }
}
