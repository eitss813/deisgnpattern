package creational.abstarctfactory1;

public class CarLoan extends Loan{

    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
