package HouseCompare;

import java.util.TreeSet;

class HouseComparator implements Comparator<House>{
    @Override
    public int compare(House a, House b) {
        return a.getArea().compareTo(b.getArea());
    }

}
