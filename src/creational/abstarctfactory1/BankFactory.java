package creational.abstarctfactory1;

public class BankFactory implements Abstarctfactory {
//    public static Bank getBank(BankType type){
//
//        switch (type){
//            case SBI: return new SBIBank();
//            case HDFC: return new HDFCBank();
//            case ICICI: return new ICICIBank();
//            default:
//                return null;
//
//        }
//    }

    @Override
    public Bank getBank(BankType type) {
        switch (type){
            case SBI: return new SBIBank();
            case HDFC: return new HDFCBank();
            case ICICI: return new ICICIBank();
            default: return null;
        }
    }

    @Override
    public Loan getLoan(LoanType loan) {
        return null;
    }
}
