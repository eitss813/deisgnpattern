package creational.abstractfactory;

public class IndiaCarFactory {
    public static Car getCar(CarType type){

        switch (type){
            case MICRO: return new MicroCar(Location.INDIA);
            case MINI: return  new MinCar(Location.INDIA);
            case LUXURY: return new LuxuryCar(Location.INDIA);
            default: return null;

        }
    }
}
