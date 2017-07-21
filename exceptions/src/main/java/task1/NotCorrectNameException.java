package task1;

public class NotCorrectNameException extends Throwable{
    public NotCorrectNameException(String[] strings) {

        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s).append(" ");
        }

        System.out.printf("Name %sin not correct.\n", sb.toString());
    }
}
