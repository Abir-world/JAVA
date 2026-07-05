public class DpsAccount extends BankAccount {
    public DpsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance, interestRate);
    }
    public double calculateInterest(){
        return getBalance() * (getInterestRate() / 100) + 200;
    }

}
