package creational.abstarctfactory1;

public class FactoryCreater {
    public static Abstarctfactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("loan")) {
            return  new LoanFactory();
        }

        return null;

    }
}
