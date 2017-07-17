package task4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Class that handles with film collection
 */
public class FilmCollection implements Serializable{
    private Set<Film> collection = new HashSet<>();

    public void addFilm(Film film) {
        collection.add(film);
    }

    public void serializeIt(File file) throws IOException, ClassNotFoundException{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(this);
    }

    public static FilmCollection deserializeIt(File file) throws IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        return (FilmCollection) objectInputStream.readObject();
    }
}
