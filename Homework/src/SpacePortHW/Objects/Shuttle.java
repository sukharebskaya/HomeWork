package SpacePortHW.Objects;

public class Shuttle implements IStart {

    @Override
    public boolean prelaunchCheck() {
        int x= (int)(Math.random() *  11);
        if (x>3){return true;}
        else return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
