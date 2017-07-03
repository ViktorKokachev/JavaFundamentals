package task5;

import java.util.Map;

/**
 * Class for student group
 */
public class StudentGroup <T extends Number>{
    private Course courseOfGroup;
    private Map<Student, T> markMap;

    public StudentGroup(Course courseOfGroup) {
        this.courseOfGroup = courseOfGroup;
    }

    public void addStudent(Student student, T mark){
        markMap.put(student, mark);
        student.addGroup(this);
    }
}
