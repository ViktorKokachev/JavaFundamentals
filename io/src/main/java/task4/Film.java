package task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class that describes film
 */
public class Film {

    private Set<Actor> actorList = new HashSet<>();
    private String name;

    public Film(String name) {
        this.name = name;
    }

    public void addActor (Actor actor) {
        actorList.add(actor);
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
