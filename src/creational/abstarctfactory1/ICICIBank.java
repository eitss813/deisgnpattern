package creational.abstarctfactory1;

public class ICICIBank extends Bank{
    public ICICIBank() {
        super("ICICI", "ICICI001");
    }
    @Override
    public void getBankDetails() {
        System.out.println("Name: "+ this.getName());
        System.out.println("Ifsc Code: "+ this.getName());
    }
}
