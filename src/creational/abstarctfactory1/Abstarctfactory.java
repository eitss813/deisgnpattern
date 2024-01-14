package creational.abstarctfactory1;

public interface Abstarctfactory {
    public Loan getLoan(LoanType loan);
    public Bank getBank(BankType type);
}
