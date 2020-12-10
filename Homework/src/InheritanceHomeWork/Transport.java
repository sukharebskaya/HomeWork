package InheritanceHomeWork;

import java.util.Objects;

public abstract class Transport {
    private int capacityHP; //horse power
    private int maxSpeed; //km per hour
    private int weight; //kg
    private String brand;

    public int getCapacityHP() {
        return capacityHP;
    }

    public void setCapacityHP(int capacityHP) {
        this.capacityHP = capacityHP;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return capacityHP == transport.capacityHP && maxSpeed == transport.maxSpeed && weight == transport.weight && Objects.equals(brand, transport.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacityHP, maxSpeed, weight, brand);
    }

    @Override
    public String toString() {
        return " capacity/horse power = " + capacityHP +
                ", maxSpeed = " + maxSpeed +
                ", weight = " + weight +
                ", brand = " + brand;
    }
    public abstract double capacityCountKLWatt();
}
