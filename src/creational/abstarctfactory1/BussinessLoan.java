package creational.abstarctfactory1;

public class BussinessLoan extends Loan {

    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
