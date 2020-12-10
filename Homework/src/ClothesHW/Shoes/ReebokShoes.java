package ClothesHW.Shoes;

public class ReebokShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надеваю кроссовки Reebok");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю кроссовки Reebok");
    }
}
