package task6;


/**
 * Class that describes notepad
 */
public class Notepad {
    private Note[] noteArray = new Note[2];
    int size = 0;
    int buffersize = 2;

    /**
     * Func that adds note to notepad
     * @param s
     *      note that adds to notepad
     */
    public void addNote(String s) {
        if (size == noteArray.length) {
            Note[] tempArray = new Note[noteArray.length + buffersize];
            for (int i = 0; i < noteArray.length; i++) {
                tempArray[i] = noteArray[i];
            }
            tempArray[noteArray.length] = new Note(s);
            noteArray = tempArray;
            size++;
        }
        else {
            noteArray[size] = new Note(s);
            size++;
        }

        System.out.println("Size: " + size);
    }

    /**
     * Func that deletes note from notepad
     * Note: deletes only one entry of note to notepad
     * @param s
     *      note that deletes notepad
     */
    public void deleteNote(String s) {

        int ind = findIndex(s);

        if (ind == -1) {
            System.out.println("Your note is not in notepad!");
        }
        else {
            for (int i = ind; i < size - 1; i++) {
                noteArray[i] = noteArray[i + 1];
            }
            noteArray[size - 1] = null;
            size--;
        }
    }

    /**
     * Func that edits note in notepad
     * Note: edits only one entry of note to notepad
     * @param s1
     *      note that edites notepad
     * @param s2
     *      result note
     */
    public void editNote(String s1, String s2) {
        int ind = findIndex(s1);

        if (ind == -1) {
            System.out.println("Your note is not in notepad!");
        }
        else {
            noteArray[ind] = new Note(s2);
        }

    }

    /**
     * Func that print all notes from notepad
     */

    public void showNotes() {
        for (int i = 0; i < size; i++)
            System.out.print(noteArray[i].getNote() + " ");
        System.out.println();
    }

    private int findIndex(String s) {
        int ind = -1;
        for (int i = 0; i < size; i++) {
            if (noteArray[i].getNote().equals(s)) {
                return i;
            }
        }
        return ind;
    }
}
