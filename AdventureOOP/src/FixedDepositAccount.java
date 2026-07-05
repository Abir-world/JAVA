public class FixedDepositAccount extends BankAccount{
    public FixedDepositAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance, interestRate);
    }

    public double calculateInterest(){
        return getBalance() * ((getInterestRate() + 2) / 100);

    }
}
