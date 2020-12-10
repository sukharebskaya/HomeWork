package ClothesHW.Pants;

public class ArmaniPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Armani");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Armani");
    }
}
