package HomeWorkException;

public class PriceGeneratorException extends Exception{
    int rnd;

    public int getRnd() {
        return rnd;
    }

    public PriceGeneratorException(int randomNum, String message){
        super(message);
        this.rnd = randomNum;
    }
}
