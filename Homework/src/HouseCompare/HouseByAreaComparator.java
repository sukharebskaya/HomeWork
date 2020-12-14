package HouseCompare;

import java.util.Comparator;
import java.util.TreeSet;

class HouseByAreaComparator implements Comparator<House> {
    @Override
    public int compare(House a, House b) {
        if (a.getArea() > b.getArea())
            return 1;
        if (a.getArea() < b.getArea())
            return 1;
        else
            return 0;
    }

}
