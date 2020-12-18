package HomeWorkSerialize;

import java.io.File;

public class SerializeRun {
    public static void main(String[] args) {
        Car car = new Car("BMW",200,23000,1568486255);
        System.out.println(car.toString());
        SerializeMethod.objectToByte(car);
        File file = new File("C:\\Programming\\teachMeSkills\\SerializedObjects.ser");
        System.out.println(SerializeMethod.deSerializeObj(file).toString());
    }
}
