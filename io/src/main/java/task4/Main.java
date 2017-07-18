package task4;

import java.io.File;
import java.io.IOException;

/**
 * Main class for whole app
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException{
        File file = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/serialization.txt");

        FilmCollection filmCollection = new FilmCollection();
        Film film1 = new Film("Spider-Man");
        film1.addActor(new Actor("Tobey", "Maguire"));
        filmCollection.addFilm(film1);
        filmCollection.serializeIt(file);

        FilmCollection filmCollection1 = filmCollection.deserializeIt(file);

        filmCollection1.print();

    }


}
