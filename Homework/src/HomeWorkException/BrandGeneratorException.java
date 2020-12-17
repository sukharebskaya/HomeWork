package HomeWorkException;

public class BrandGeneratorException extends Exception{
    int brandIndex;

    public int getBrandIndex() {
        return brandIndex;
    }

    public BrandGeneratorException(int brandIndex, String message){
        super(message);
        this.brandIndex=brandIndex;
    }
}
