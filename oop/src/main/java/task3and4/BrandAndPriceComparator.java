package task3and4;

import java.util.Comparator;

/**
 * Comparator for brand and price sorting
 */
public class BrandAndPriceComparator implements Comparator<TableStuff>{

    Comparator<TableStuff> brandComparator = new BrandComparator();

    @Override
    public int compare(TableStuff o1, TableStuff o2) {
        int res = brandComparator.compare(o1, o2);
        return (res == 0) ? o1.compareTo(o2) : res;
    }
}
