package HomeWorkException;

public class CarRunMain {

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 200, 25000);

        //запускаем и останавливаем машину
        int i=0;
        while(i<5){
        try {
            car1.startCar();
            car1.stopCar();

            }   catch (CarStartException e) {
                System.out.println(e.getNumber()+" "+e.getMessage());
            }
                catch (CarStopException e){
                    System.out.println(e.getGeneratedNumber()+" "+e.getMessage());
                    break;
                }
        finally{
            System.out.println("The program is going on");
        }
            i++;
        }

        //генерируем бренд
        try {
            GeneratorUtil.brandGenerator();
        } catch (BrandGeneratorException e) {
            System.out.println(e.getBrandIndex()+e.getMessage());
        }

        //генерируем стоимость
        try {
            GeneratorUtil.priceGenerator();
        } catch (PriceGeneratorException e) {
            System.out.println(e.getRnd()+e.getMessage());
        }

        //генерируем скорость
        try {
            GeneratorUtil.speedGenerator();
        } catch (SpeedGeneratorException e) {
            System.out.println(e.getRandomNumber()+e.getMessage());
        }
    }
}
