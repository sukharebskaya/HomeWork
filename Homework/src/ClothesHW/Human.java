package ClothesHW;

import ClothesHW.Jacket.IJacket;
import ClothesHW.Pants.IPants;
import ClothesHW.Shoes.IShoes;

public class Human implements IHuman{
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human() {
    }

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putClothesOn(){
        jacket.putOn();
        shoes.putOn();
        pants.putOn();

    }

    @Override
    public void takeClothesOff() {
        jacket.takeOff();
        shoes.takeOff();
        pants.takeOff();

    }

}
