package creational.abstractfactory;

public class LuxuryCar extends Car {
    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        createCar();
    }

    @Override
    public void createCar() {
        System.out.println(this.model + " car is creating");
    }
}
