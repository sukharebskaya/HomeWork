package SpacePortHW;

import SpacePortHW.Objects.*;

public class Run {
    public static void main(String[] args) {
        IStart shuttle = new Shuttle();
        SpacePort.launchSpaceShip(shuttle);
        System.out.println();
        IStart apollo = new Apollo_11(3);
        SpacePort.launchSpaceShip(apollo);

    }
}
