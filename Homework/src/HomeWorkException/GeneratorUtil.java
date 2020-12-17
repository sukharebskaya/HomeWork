package HomeWorkException;

import java.util.ArrayList;
import java.util.Random;

public class GeneratorUtil {
    public static void speedGenerator() throws  SpeedGeneratorException{
    int min = 100;
    int max = 250;
    int rnd = rnd(min,max);
    if(rnd >= 100 && rnd <150) System.out.println("Your car is in speed limit bound");
    else if (rnd >= 150 && rnd < 200) throw new SpeedGeneratorException(rnd, " : You broke speed limit, you are driving over 150 km per hour");
    else System.out.println("Your driving license, please");
    }
    public static void priceGenerator() throws PriceGeneratorException{
    int min = 20000;
    int max = 100000;
    int rnd = rnd(min,max);
    if(rnd>20000 && rnd<50000) System.out.println("Car price in diapason between 20k and 50k");
    else if (rnd>=50000 && rnd < 70000) throw new PriceGeneratorException(rnd,": Exception - Car price between 50k and 70k");
    else System.out.println("Car price in diapason between 70k and 100k");
    }
    public static void brandGenerator() throws BrandGeneratorException{
        ArrayList <String> brandList = new ArrayList<>(5);
        brandList.add("Audi");
        brandList.add("Honda");
        brandList.add("BMW");
        brandList.add("Alfa Romeo");
        brandList.add("Lada");
        int brandIndex = (int)(Math.random()*5);
        if (brandIndex == 0) {throw new BrandGeneratorException(brandIndex, ": Generated wrong number for car brand");}
        System.out.println(brandList.get(brandIndex));

    }

    //метод для генерирования рандомного числа
    public static int rnd(int min, int max){
        max-=min; //получение случайного множителя
        return (int)(Math.random() * ++max) + min;
    }
}
