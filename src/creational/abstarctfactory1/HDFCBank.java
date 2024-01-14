package creational.abstarctfactory1;

public class HDFCBank extends Bank {
    public HDFCBank() {
        super("HDFC", "HDFC001");
    }

    @Override
    public void getBankDetails() {
        System.out.println("Name: "+ this.getName());
        System.out.println("Ifsc Code: "+ this.getName());
    }
}
