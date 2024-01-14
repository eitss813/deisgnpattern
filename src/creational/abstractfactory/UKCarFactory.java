package creational.abstractfactory;

public class UKCarFactory {
    public static Car getCar(CarType type){
        switch (type){
            case MICRO: return new MicroCar(Location.UK);
            case MINI: return  new MinCar(Location.UK);
            case LUXURY: return new LuxuryCar(Location.UK);
            default: return null;

        }
    }
}
