package SpacePortHW.Objects;

public class Apollo_11 implements IStart{
    static int crew;

    public Apollo_11 (){}
    public Apollo_11 (int crew){
        this.crew = crew;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    @Override
    public boolean prelaunchCheck() {
    if (this.crew!=3)
        return false;
    else return true;
    }

    @Override
    public void startEngine() {
        System.out.println("Ground Control to Major Tom\n" + "Commencing countdown, engines on");
    }

    @Override
    public void start() {
        System.out.println("Земля в иллюминаторе видна");
    }
}
