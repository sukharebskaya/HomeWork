package SpacePortHW.Objects;

public class PreLaunchCheckException extends Exception{
    int generatedNumber;
    boolean checkResult;

    public int getGeneratedNumber() {
        return generatedNumber;
    }
    public PreLaunchCheckException(int number, String message){
        super(message);
        this.generatedNumber = number;
    }
    public PreLaunchCheckException(boolean checkResult, String message){
        super(message);
        this.checkResult= checkResult;
    }
}
