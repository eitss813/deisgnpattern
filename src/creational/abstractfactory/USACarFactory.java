package creational.abstractfactory;

public class USACarFactory {
    public static Car getCar(CarType type){
        switch (type){
            case MICRO: return new MicroCar(Location.USA);
            case MINI: return  new MinCar(Location.USA);
            case LUXURY: return new LuxuryCar(Location.USA);
            default: return null;

        }
    }
}
