package task5;

/**
 * Enum that represents all courses that could be attended by students
 */
public enum Course {
    MATH,
    HISTORY,
    BIOLOGY,
    COMPUTER_SCIENCE,
    LITERATURE,
    ASTRONOMY,
    PHYSICS,
    ECOLOGY;

    public <T extends Number> StudentGroup<T> createGroup() {
        return new StudentGroup<T>(this);
    }
}
