package creational.abstarctfactory1;

public class SBIBank extends Bank {

    public SBIBank() {
        super("SBI", "SBI001");
    }


    @Override
    public void getBankDetails() {
        System.out.println("Name: "+ this.getName());
        System.out.println("Ifsc Code: "+ this.getName());
    }
}
