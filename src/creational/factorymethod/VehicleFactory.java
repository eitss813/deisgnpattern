package creational.factorymethod;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType type){
        switch (type){
            case two : return new TwoWheeler();
            case four: return new FourWheeler();
            default: return null;
        }
    }
}
