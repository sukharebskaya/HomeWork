package ClothesHW;
import ClothesHW.Jacket.*;
import ClothesHW.Pants.*;
import ClothesHW.Shoes.*;

public class Run {
    public static void main(String[] args) {
        IJacket jacket1 = new PradaJacket();
        IJacket jacket2 = new PumaJacket();
        IPants pants1 = new ArmaniPants();
        IPants pants2 = new NikePants();
        IShoes shoes1 = new LouboutinShoes();
        IShoes shoes2 = new ReebokShoes();

        Human partyHuman = new Human("Anna",jacket1,pants1,shoes1);
        partyHuman.putClothesOn();
        partyHuman.takeClothesOff();
        System.out.println();

        Human sportHuman = new Human("Jack",jacket2,pants2,shoes2);
        sportHuman.putClothesOn();
        sportHuman.takeClothesOff();

    }
}
