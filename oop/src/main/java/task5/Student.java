package task5;
import java.util.ArrayList;

/**
 * Class for student entity
 */
public class Student {
    private String firstName;
    private String secondName;
    private ArrayList<StudentGroup> groupList;

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        groupList = new ArrayList<>();
    }
}
