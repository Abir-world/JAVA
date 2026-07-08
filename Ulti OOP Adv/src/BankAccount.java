public abstract class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            IO.println("Deposit:" + String.format("%.3f", amount));
        }
    }
    abstract void showBalance();

}
