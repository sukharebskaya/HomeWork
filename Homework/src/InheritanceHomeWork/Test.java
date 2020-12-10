package InheritanceHomeWork;

public class Test {
    public static void main(String[] args) {
        CivilAirTr plane = new CivilAirTr();
        plane.setWeight(100);
        plane.setBrand("Airbus");
        plane.setMaxSpeed(500);
        plane.setCapacityHP(1000);
        plane.setWingSpan(30);
        plane.setPassengerNum(300);
        plane.setMinAirStripLength(5);
        plane.setBusiness(true);
        System.out.println(plane.capacityCountKLWatt());
        System.out.println(plane.toString());


        MilitaryAirTr militaryPlane = new MilitaryAirTr();
        militaryPlane.setWeight(200);
        militaryPlane.setBrand("MiG");
        militaryPlane.setMaxSpeed(600);
        militaryPlane.setCapacityHP(3000);
        militaryPlane.setWingSpan(40);
        militaryPlane.setMinAirStripLength(3);
        militaryPlane.setCatapult(false);
        militaryPlane.setRocketNum(4);
        System.out.println(militaryPlane.capacityCountKLWatt());
        System.out.println(militaryPlane.toString());


        Car car = new Car();
        car.setBodyType("long");
        car.setPassengerNum(5);
        car.setCapacityHP(300);
        car.setWeight(5);
        car.setTime(2);
        car.setBrand("BMW");
        car.setMaxSpeed(120);
        car.setFuelConsRate(10.0);
        car.rangeOnMaxSpeed(car.getTime());
        System.out.println(car.capacityCountKLWatt());
        System.out.println(car.toString());

        Cargo cargo = new Cargo();
        cargo.setBrand("Iveco");
        cargo.setWeight(10);
        cargo.setMaxSpeed(90);
        cargo.setCapacityHP(260);
        cargo.setFuelConsRate(12);
        cargo.setWheelNum(6);
        cargo.setLoadCapacity(300);
        cargo.checkLoadCapacity(320);
        System.out.println(cargo.capacityCountKLWatt());
        System.out.println(cargo.toString());

    }
}
