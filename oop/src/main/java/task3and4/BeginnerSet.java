package task3and4;

import java.util.ArrayList;

/**
 * Class for beginner set
 */
public class BeginnerSet {

    private ArrayList<TableStuff> beginnerList;

    public BeginnerSet() {
        this.beginnerList = new ArrayList<>();
    }

    public void addItem(TableStuff tableStuff) {
        beginnerList.add(tableStuff);
    }

    public ArrayList<TableStuff> getBeginnerList() {
        return beginnerList;
    }

    public void sortStuffByBrand() {

    }

    public void sortStuffByPrice() {

    }

    public void sortStuffByPriceAndBrand() {

    }
}
