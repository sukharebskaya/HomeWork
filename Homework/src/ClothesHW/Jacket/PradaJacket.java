package ClothesHW.Jacket;

public class PradaJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Prada");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Prada");
    }
}
