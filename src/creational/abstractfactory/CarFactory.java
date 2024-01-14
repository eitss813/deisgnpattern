package creational.abstractfactory;

public class CarFactory {
    public static Car builder(CarType type){
        Car car = null;
        Location location = Location.USA;
        switch (location){
            case INDIA: car = IndiaCarFactory.getCar(type);
            break;
            case USA: car = USACarFactory.getCar(type);
            break;
            case UK: car = UKCarFactory.getCar(type);
            break;
            default:
                break;
        }
        return car;
    }
}
