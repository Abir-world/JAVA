//2024000000272
void main() {
    SavingsAccount savings = new SavingsAccount(" ACCN1", 20000, 8);
    savings.deposit(900);
    savings.withdraw(2000);
    IO.println(savings.getAccountNumber()+" "+savings.getBalance()+" "+savings.getInterestRate()+ " "+savings.calculateInterest());

    DpsAccount dps = new DpsAccount("ACC2", 35000, 12);
    dps.deposit(9000);
    dps.withdraw(1200);
    IO.println(dps.getAccountNumber()+" "+dps.getBalance()+" "+dps.getInterestRate()+" "+ dps.calculateInterest());

    FixedDepositAccount f1 = new FixedDepositAccount("ACC3", 40000, 27);
    f1.deposit(3000);
    f1.withdraw(20000);
    IO.println(f1.getAccountNumber()+" "+f1.getBalance()+ " "+ f1.getInterestRate()+" "+f1.calculateInterest());




}
