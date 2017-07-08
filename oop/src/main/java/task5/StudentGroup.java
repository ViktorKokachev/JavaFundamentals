package task5;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for student group
 */
public class StudentGroup <T extends Number>{
    private Course courseOfGroup;
    private Map<Student, T> markMap;

    public StudentGroup(Course courseOfGroup) {
        this.courseOfGroup = courseOfGroup;
        markMap = new HashMap<>();
    }

    public void addStudent(Student student, T mark){
        markMap.put(student, mark);
        student.addGroup(this);
    }

    public void studentOut(Student student) {
        StringBuilder sb = new StringBuilder(courseOfGroup.toString());
        sb.append(" ")
                .append(student.getFirstName())
                .append(" ")
                .append(student.getSecondName())
                .append(" ")
                .append(markMap.get(student));
        System.out.println(sb);
    }
}
