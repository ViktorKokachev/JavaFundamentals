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
}
