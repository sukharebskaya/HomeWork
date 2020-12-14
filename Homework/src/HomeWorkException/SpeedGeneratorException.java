package HomeWorkException;

public class SpeedGeneratorException extends Exception{
    int randomNumber;
    public int getRandomNumber(){return randomNumber;}
    public SpeedGeneratorException(int random, String message){
        super(message);
        this.randomNumber = random;
    }
}
