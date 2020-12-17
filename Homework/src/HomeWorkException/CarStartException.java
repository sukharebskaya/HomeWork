package HomeWorkException;

public class CarStartException extends Exception{
    int number;

    public int getNumber() {
        return number;
    }

    public CarStartException(int generatedNumber, String message){
        super(message);
        this.number = generatedNumber;

    }
}
