package task2;

import java.util.ArrayList;

/**
 * Class that represents employee & count total price of his tablestuff
 */
public class Employee {
    private String name;
    private ArrayList <TableStuff> TableStuffList = new ArrayList<>();

    public Employee (String name) {
        this.name = name;
    }

    public void addTableStuff(TableStuff tableStuff) {
        TableStuffList.add(tableStuff);
    }

    public void countAllPrices () {
        double sum = 0;
        for (TableStuff tableStuff : TableStuffList) {
            sum += tableStuff.getPrice();
        }
        System.out.printf("Total cost for %s is %.2f $\n", name, sum);
    }
}
