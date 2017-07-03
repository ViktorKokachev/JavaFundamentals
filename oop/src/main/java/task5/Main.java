package task5;

/**
 * Main class for 5th task
 */
public class Main {
    public static void main(String[] args) {
        StudentGroup<Integer> studentGroup = Course.PHYSICS.createGroup();
        Student student = new Student("Viktor", "Kokachev");
    }
}
