package task3and4;

/**
 * Main class for 3rd task
 */
public class Main {

    public static void main(String[] args) {
        BeginnerSet beginnerSet = new BeginnerSet();
        beginnerSet.addItem(new Notepad(Brand.ERICH_KRAUSE, Color.BLACK, 30, 100, false));
        beginnerSet.addItem(new Pen(Brand.STABILO, Color.RED, 5, 15, 0.8));
        beginnerSet.addItem(new Pencil(Brand.STABILO, Color.YELLOW, 40, 20, true));
        beginnerSet.addItem(new Ruler(Brand.PILOT, Color.GREY, 5, 30, true));

        System.out.println("Before sorting:");
        for (TableStuff tableStuff : beginnerSet.getBeginnerList()) {
            System.out.println(tableStuff.toString());
        }
    }


}
