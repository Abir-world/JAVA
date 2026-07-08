public class BkashPaymen extends BankAccount implements OnlinePayment{


    public BkashPaymen(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    void showBalance() {
        IO.println("balance for " + accountHolder + ": " + String.format("%.2f", balance));

    }

    @Override
    public void pay(double amount) {
        if(amount > 0 && balance >= amount){
            balance -= amount;
            IO.println("payment done:"+ String.format("%.2f", amount));
        }else{
            IO.println("payment failled: insufficient balance");
        }

    }

    @Override
    public void refund(double amount) {
        if(amount > 0){
            balance += amount;
            IO.println("Refund:"+ String.format("%.2f", amount));
        }

    }
}
