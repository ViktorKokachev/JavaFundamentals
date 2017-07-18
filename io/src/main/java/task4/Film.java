package task4;

import java.io.Serializable;
import java.util.*;

/**
 * Class that describes film
 */
public class Film implements Serializable{

    private Set<Actor> actorList = new HashSet<>();
    private String name;

    public Film(String name) {
        this.name = name;
    }

    public void addActor (Actor actor) {
        actorList.add(actor);
    }

    public void print() {
        System.out.println(name);
        for (Actor actor : actorList)
            System.out.print(actor.getFirstName() + " " + actor.getSecondName());
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (!actorList.equals(film.actorList)) return false;
        return name.equals(film.name);
    }

    @Override
    public int hashCode() {
        int result = actorList.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
