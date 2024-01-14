package creational.abstractfactory;

public class MinCar extends Car{

    public MinCar(Location location) {
        super(CarType.MINI, location);
        createCar();
    }

    @Override
    public void createCar() {
        System.out.println(this.model + " car is creating");
    }
}
