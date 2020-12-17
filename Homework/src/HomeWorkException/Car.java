package HomeWorkException;

public class Car {
    private String brand;
    private int speed;
    private int price;


    public Car(){}
    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

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


    public void startCar() throws CarStartException{
        int start = (int) (Math.random() * 21);
        if(start%2==0){throw new CarStartException(start, ": Generated even number for starting"+getBrand());}
        System.out.println("The car has started, driving to work");

    }
    public void stopCar() throws CarStopException{
        int stop = (int) (Math.random() * 11);
        if(stop%2==0){throw new CarStopException(stop, ": Generated even number for stopping "+getBrand());}
        System.out.println("The car has stopped, not going anywhere");

    }

}
