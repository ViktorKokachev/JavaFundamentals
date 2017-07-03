package task5;
import java.util.ArrayList;

/**
 * Class for student entity
 */
public class Student <T extends Number> {
    String firstName;
    String secondName;
    ArrayList<Course> courseList;

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }
}
