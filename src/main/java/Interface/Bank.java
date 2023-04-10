package Interface;

public class Bank implements RBI, USBank{

    //RBI Interface
    @Override
    public void educationLoan() {
        System.out.println("education loan processing");
    }

    @Override
    public void homeLoan() {
        System.out.println("home loan processing");
    }

    @Override
    public void carLoan() {
        System.out.println("car loan processing");
    }

    //USBank Interface

    @Override
    public void debit() {
        System.out.println("debit card processing");
    }

    @Override
    public void credit() {
        System.out.println("credit card processing");
    }

    @Override
    public void transferMoney() {
        System.out.println("money transefer processing");
    }

    public void trading(){
        System.out.println("trading");
    }
}
