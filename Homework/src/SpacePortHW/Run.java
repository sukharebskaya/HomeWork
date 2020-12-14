package SpacePortHW;

import SpacePortHW.Objects.*;

public class Run {
    public static void main(String[] args) {
        IStart shuttle = new Shuttle(); //если сгенерируется ноль, то словит ошибку
        try {
            SpacePort.launchSpaceShip(shuttle);
        } catch (PreLaunchCheckException e) {
            System.out.println(e.getGeneratedNumber()+" - "+e.getMessage());
        }
        System.out.println();

        IStart apollo = new Apollo_11(2); // если количество членов команды !=3, то словит ошибку
        try {
            SpacePort.launchSpaceShip(apollo);
        } catch (PreLaunchCheckException e) {
            System.out.println(e.getGeneratedNumber()+" - "+e.getMessage());
        }

    }
}
