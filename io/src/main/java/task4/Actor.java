package task4;

/**
 * Class that describes actor
 */
public class Actor {
    private String firstName;
    private String secondName;

    public Actor(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
