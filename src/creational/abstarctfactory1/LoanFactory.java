package creational.abstarctfactory1;

public class LoanFactory implements Abstarctfactory{
    @Override
    public Bank getBank(BankType type) {
        return null;
    }

    @Override
    public Loan getLoan(LoanType loan) {
        switch (loan){
            case car: return new CarLoan();
            case buss: return new BussinessLoan();
            default:return null;
        }

    }
}
