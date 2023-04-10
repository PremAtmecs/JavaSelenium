package Interface;

public class BankProcessing {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.carLoan();
        bank.credit();
        bank.debit();
        System.out.println(USBank.min_bal);

        USBank us=new Bank();//upcasting
        us.credit();
        us.debit();
    }
}
