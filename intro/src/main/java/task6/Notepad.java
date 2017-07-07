package task6;

import java.util.ArrayList;

/**
 * Class that describes notepad
 */
public class Notepad {
    private Note[] noteArray = new Note[2];
    int capacity = 0;
    int buffersize = 2;


    public void addNote(String s) {
        if (capacity == noteArray.length) {
            Note[] tempArray = new Note[noteArray.length + buffersize];
            for (int i = 0; i < noteArray.length; i++) {
                tempArray[i] = noteArray[i];
            }
            tempArray[noteArray.length] = new Note(s);
            noteArray = tempArray;
            capacity++;
        }
        else {
            noteArray[capacity] = new Note(s);
            capacity++;
        }
    }

    public void deleteNote(String s) {
    }

    public void editNote(String s1, String s2) {
    }

    public void showNotes() {
        for (int i = 0; i < capacity; i++)
            System.out.print(noteArray[i].getNote() + " ");
        System.out.println();
    }
}
