public class BankAccount {
    private String accountNumber;
    private double balance;
    private double interestRate;

    //consturctor
    public BankAccount(String accountNumber, double balance, double interestRate){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    //getter methods;
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public double getInterestRate(){
        return interestRate;
    }
    //setter
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setInteresrRate(double interestRate){
        this.interestRate = interestRate;
    }

    //deposit
    public void deposit(double amount){
        balance += amount;
        IO.println("Deposited: "+ amount + " | Current Balance: " + balance);
    }

    //withdraw
    public void withdraw(double amount){
        if(amount <= balance){
            balance -=amount;
            IO.println("Withdraw: " +amount + "| Current balance: " + balance);
        } else{
            IO.println("insufficient Balance");
        }
    }

    public double calculateInterest(){
        return balance * (interestRate / 100);
    }

}
