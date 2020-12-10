package ClothesHW.Jacket;

public class PumaJacket implements IJacket{

    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Puma");
    }
}
