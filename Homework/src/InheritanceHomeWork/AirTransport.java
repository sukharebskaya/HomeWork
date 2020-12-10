package InheritanceHomeWork;

import java.util.Objects;

public abstract class AirTransport extends Transport{
   private int wingSpan; //metre
   private int minAirStripLength;

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getMinAirStripLength() {
        return minAirStripLength;
    }

    public void setMinAirStripLength(int minAirStripLength) {
        this.minAirStripLength = minAirStripLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AirTransport that = (AirTransport) o;
        return wingSpan == that.wingSpan && minAirStripLength == that.minAirStripLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wingSpan, minAirStripLength);
    }

    @Override
    public String toString() {
        return " wing Span = " + wingSpan +
                ", minimum Air Strip Length = " + minAirStripLength +
                super.toString();
    }
}
class CivilAirTr extends AirTransport{
   private int passengerNum;
   private boolean business;

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }
    public void checkPassCapacity(int passNum){
        if(passNum>this.passengerNum) System.out.println("Вам нужен самолёт побольше");
        else System.out.println("Самолет загружен");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CivilAirTr that = (CivilAirTr) o;
        return passengerNum == that.passengerNum && business == that.business;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerNum, business);
    }

    @Override
    public String toString() {
        return "passenger number=" + passengerNum +
                ", business class=" + business +
                super.toString();
    }

    @Override
    public double capacityCountKLWatt() {
        double result = getCapacityHP()*0.74;
        return result;
    }
}
class MilitaryAirTr extends AirTransport{
   private boolean catapult;
   private int rocketNum;

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getRocketNum() {
        return rocketNum;
    }

    public void setRocketNum(int rocketNum) {
        this.rocketNum = rocketNum;
    }
    public void shoot(){
        if(this.rocketNum==0) System.out.println("Боеприпасы отпутствуют");
        else System.out.println("Ракета пошла");
    }
    public void catapultCheck(){
        if (this.catapult==true) System.out.println("Катапультирование прошло успешно");
        else System.out.println("У вас нет такой системы");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryAirTr that = (MilitaryAirTr) o;
        return catapult == that.catapult && rocketNum == that.rocketNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), catapult, rocketNum);
    }

    @Override
    public String toString() {
        return "catapult =" + catapult +
                ", rocket number =" + rocketNum +
                super.toString();
    }

    @Override
    public double capacityCountKLWatt() {
        double result = getCapacityHP()*0.74;
        return result;
    }
}
