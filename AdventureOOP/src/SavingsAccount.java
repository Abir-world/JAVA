public class  SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance, interestRate);
    }
    public double calculateInterest(){
        return getBalance() * (getInterestRate());

    }


}
