package creational.abstarctfactory1;

public class Client {
    public static void main(String[] args) {
        Abstarctfactory bf = FactoryCreater.getFactory("bank");

       Bank bank = bf.getBank(BankType.SBI);

       bank.getBankDetails();

       Abstarctfactory lf =FactoryCreater.getFactory("loan");

     Loan l =  lf.getLoan(LoanType.car);

     l.getInterestRate(10.3);

     l.calculateLoanPayment(500000, 5);

    }
}
