package HouseCompare;

import java.util.Comparator;
import java.util.TreeSet;

public class HouseCompareRun {
    public static void main(String[] args) {
        Comparator<House> comparator = new HouseByAreaComparator();
        TreeSet <House> myHouseList = new TreeSet<>(comparator);

        House house1 = new House(50,50000,"Minsk",false);
        House house2 = new House(60,200000,"Washington",false);
        House house3 = new House(30,28000,"Gomel",true);

        myHouseList.add(house1);
        myHouseList.add(house2);
        myHouseList.add(house3);

        for(House h: myHouseList)
            System.out.println(h);

    }

}
