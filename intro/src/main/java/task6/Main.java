package task6;
/**
 * @author Viktor Kokachev
 * @version 1.0
 */


/**
 * Main class for task6 from intro module
 */
public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.addNote("123");
        notepad.addNote("234");
        notepad.addNote("345");
        notepad.addNote("456");
        notepad.addNote("567");
        System.out.println("Before removal: ");
        notepad.showNotes();
        notepad.deleteNote("234");
        System.out.println("After removal:");
        notepad.showNotes();
        notepad.editNote("456", "789");
        System.out.println("After edit: ");
        notepad.showNotes();
    }
}
