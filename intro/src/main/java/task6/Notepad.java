package task6;

/**
 * Created by kpkshke on 26.06.17.
 * Class that describes notepad
 */
public class Notepad {
    private Note[] noteArray;

    public Notepad(Note[] noteArray) {
        this.noteArray = noteArray;
    }

    public Note[] getNoteArray() {

        return noteArray;
    }

    public void setNoteArray(Note[] noteArray) {
        this.noteArray = noteArray;
    }

    public void addNote(Note note) {


    }

    public void deleteNote(int number) {

    }

    public void deleteNote(Note note) {

    }

    public void editNote(int number) {

    }

    public void editNote(Note note) {

    }

    public void showNotes() {
        for (Note note : this.getNoteArray()) {
            System.out.println(note);
        }
    }
}
