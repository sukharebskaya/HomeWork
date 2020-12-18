package HomeWorkSerialize;

import java.io.Serializable;

public class Car implements Serializable {
    String brand;
    int speed;
    int price;
    transient long vinNumber;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String brand, int speed, int price, long vin) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
        this.vinNumber=vin;
    }
    public Car() {}

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", vinNumber=" + vinNumber +
                '}';
    }
}
