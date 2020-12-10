package SpacePortHW;

import SpacePortHW.Objects.IStart;

public class SpacePort {
    public static void launchSpaceShip(IStart spaceShip){
        boolean x = spaceShip.prelaunchCheck();
        if(x==false) {System.out.println("Предстартовая проверка провалена"); return;}
        else spaceShip.startEngine();
        System.out.println("10...9...8...7...6...5...4...3...2...1... Пуск");
        spaceShip.start();
    }

}
