package task2;

/**
 * Main class for 2nd task
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasya");
        employee.addTableStuff(new Notepad(Brand.KOH_I_NOOR, Color.GREEN, 30.5, 100));
        employee.addTableStuff(new Pencil(Brand.KOH_I_NOOR, Color.BLUE, 9, true));
        employee.addTableStuff(new Pen(Brand.KOH_I_NOOR, Color.GREEN, 30.5, 0.5));
        employee.countAllPrices();
    }
}
