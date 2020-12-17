package SpacePortHW;

import SpacePortHW.Objects.IStart;
import SpacePortHW.Objects.PreLaunchCheckException;

public class SpacePort {
    public static void launchSpaceShip(IStart spaceShip)throws PreLaunchCheckException{
        boolean failureOrLaunch = spaceShip.prelaunchCheck();
        if(failureOrLaunch==false) {throw new PreLaunchCheckException(failureOrLaunch, " the result of a prelaunch check");}
        else spaceShip.startEngine();
        System.out.println("10...9...8...7...6...5...4...3...2...1... Пуск");
        spaceShip.start();
    }

}
