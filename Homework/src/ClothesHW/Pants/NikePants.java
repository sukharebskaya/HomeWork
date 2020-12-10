package ClothesHW.Pants;

public class NikePants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Nike");
    }
}
