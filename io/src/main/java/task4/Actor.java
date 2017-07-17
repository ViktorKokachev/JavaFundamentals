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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        if (!getFirstName().equals(actor.getFirstName())) return false;
        return getSecondName().equals(actor.getSecondName());
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getSecondName().hashCode();
        return result;
    }
}
