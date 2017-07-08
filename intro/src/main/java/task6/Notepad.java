package task6;


/**
 * Class that describes notepad
 */
public class Notepad {
    private Note[] noteArray = new Note[2];
    int size = 0;
    int buffersize = 2;


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

    public void editNote(String s1, String s2) {
        int ind = findIndex(s1);

        if (ind == -1) {
            System.out.println("Your note is not in notepad!");
        }
        else {
            noteArray[ind] = new Note(s2);
        }

    }

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
