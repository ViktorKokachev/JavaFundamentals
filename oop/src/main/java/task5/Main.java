package task5;

/**
 * Main class for 5th task
 */
public class Main {
    public static void main(String[] args) {
        StudentGroup<Integer> physicsGroup = Course.PHYSICS.createGroup();
        StudentGroup<Double> mathGroup = Course.MATH.createGroup();
        Student student = new Student("Viktor", "Kokachev");
        Student student1 = new Student("Vasya", "Pupkin");
        physicsGroup.addStudent(student, 3);
        physicsGroup.addStudent(student1, 4);
        mathGroup.addStudent(student, 4.1);
        mathGroup.addStudent(student1, 5.0);
        //TODO: oupput results
    }
}
