package creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
       Car car = CarFactory.builder(CarType.LUXURY);

       System.out.println(car);
    }
}
