package creational.abstractfactory;

abstract public class Car {
    public CarType model;
    public long price;
    public Location location;

    public Car(CarType type, Location location){
        this.model = type;
        this.location = location;

        if(type == CarType.MINI){
            this.price = 5000000;
        } else if (type == CarType.MICRO) {
            this.price = 2500000;

        } else if (type == CarType.LUXURY) {
            this.price = 120000000;
        }
    }

    abstract public void createCar();

    @Override
    public String toString(){
        return "Car model: " + this.model + ", Price: " + this.price + " Location: " + this.location;
    }
}
