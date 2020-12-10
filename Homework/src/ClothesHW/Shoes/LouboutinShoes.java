package ClothesHW.Shoes;

public class LouboutinShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надеваю туфли Louboutin");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю туфли Louboutin");
    }
}
