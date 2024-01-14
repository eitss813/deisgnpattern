package creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        Vehicle twowheeler = VehicleFactory.getVehicle(VehicleType.two);

        twowheeler.getInfo();

        Vehicle threewheeler = VehicleFactory.getVehicle(VehicleType.three);

        if(threewheeler != null)
            threewheeler.getInfo();
        else{
            System.out.println("This vehicle is currently not available");
        }
    }
}
