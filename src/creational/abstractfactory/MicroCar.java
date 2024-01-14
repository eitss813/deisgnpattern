package creational.abstractfactory;

public class MicroCar extends Car{
    public MicroCar(Location location) {
        super(CarType.MINI, location);
        createCar();
    }

    @Override
    public void createCar() {
        System.out.println(this.model + " car is creating");
    }
}
