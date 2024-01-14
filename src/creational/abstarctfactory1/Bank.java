package creational.abstarctfactory1;

import java.util.List;

abstract public class Bank {

    private String name;
    private String ifscCode;
    private List<Loan> loans;

    public String getName() {
        return name;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public Bank(String name, String ifscCode){
        this.name = name;
        this.ifscCode = ifscCode;
    }
    abstract public void getBankDetails();

}
