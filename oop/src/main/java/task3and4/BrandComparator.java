package task3and4;

import java.util.Comparator;

/**
 * Comparator for brand sorting
 */
public class BrandComparator implements Comparator<TableStuff> {
    @Override
    public int compare(TableStuff o1, TableStuff o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
