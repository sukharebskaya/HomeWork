package InheritanceHomeWork;

import java.util.Objects;

public abstract class GroundTransport extends Transport{
    private int wheelNum;
    private double fuelConsRate; //litre/100 km

    public int getWheelNum() {
        return wheelNum;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }

    public double getFuelConsRate() {
        return fuelConsRate;
    }

    public void setFuelConsRate(double fuelConsRate) {
        this.fuelConsRate = fuelConsRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GroundTransport that = (GroundTransport) o;
        return wheelNum == that.wheelNum && Double.compare(that.fuelConsRate, fuelConsRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheelNum, fuelConsRate);
    }

    @Override
    public String toString() {
        return " wheels Number =" + wheelNum +
                ", fuel Consumption Rate=" + fuelConsRate +
                super.toString();
    }
}
class Car extends GroundTransport{
    private String bodyType;
    private int passengerNum;
    private int time;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return passengerNum == car.passengerNum && Objects.equals(bodyType, car.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType, passengerNum);
    }

    @Override
    public double capacityCountKLWatt() {
        double result = getCapacityHP()*0.74;
        return result;
    }
    public void rangeOnMaxSpeed(int time){
        int range = getMaxSpeed()*time;
        double fuelAmount = fuelAmountCount(range);
        System.out.println("За время "+getTime()+" часа(-ов), автомобиль "+this.getBrand()+", двигаясь с максимальной скоростью "+this.getMaxSpeed()+" км/ч, проедет "
                +range+" км. и израсходует "+this.fuelAmountCount(range)+" литра(-ов) топлива");
    }
    private double fuelAmountCount(int range){
        double amount = range*this.getFuelConsRate()/100;
        return amount;
    }

    @Override
    public String toString() {
        return "body Type = " + bodyType +
                ", passenger Number = " + passengerNum +
                super.toString();
    }
}
class Cargo extends GroundTransport{
    private int loadCapacity; //tonne

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public void checkLoadCapacity(int loadWeight){
        if(loadWeight>this.loadCapacity) System.out.println("Вам нужен грузовик побольше");
        else System.out.println("Грузовик загружен");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cargo cargo = (Cargo) o;
        return loadCapacity == cargo.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return "load capacity = " + loadCapacity +
                super.toString();
    }

    @Override
    public double capacityCountKLWatt() {
        double result = getCapacityHP()*0.74;
        return result;
    }
}
