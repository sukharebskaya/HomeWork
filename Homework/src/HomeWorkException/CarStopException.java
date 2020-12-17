package HomeWorkException;

public class CarStopException extends Exception{
    int number;

    public int getGeneratedNumber() {
        return number;
    }

    public CarStopException(int number, String message){
        super(message);
        this.number = number;
    }
}
