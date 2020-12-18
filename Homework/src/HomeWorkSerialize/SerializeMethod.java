package HomeWorkSerialize;

import java.io.*;

public class SerializeMethod {
    public static void objectToByte(Car car){
        try(FileOutputStream fileOut = new FileOutputStream("C:\\Programming\\SerializedObjects.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);){
            out.writeObject(car);
        }
        catch  (IOException e) {
            e.printStackTrace();
        }
    }
    public static Car deSerializeObj(File file){
        Car car = null;
        try(FileInputStream fileIn = new FileInputStream("C:\\Programming\\SerializedObjects.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);){
            car = (Car)in.readObject();
        }
        catch  (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }
}
