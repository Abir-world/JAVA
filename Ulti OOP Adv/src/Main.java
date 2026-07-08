//2024000000272
void main() {
    BankAccount bkash = new BkashPaymen("Abir", 1000.0);
    BankAccount nagad = new NagadPayment("sakib", 800.0);
    BankAccount rocket = new RocketPayment("Shuvo", 1200);

    IO.println("BKASH:");
    bkash.deposit(500);
    ((OnlinePayment) bkash).pay(300);
    ((OnlinePayment) bkash).refund(100);
    bkash.showBalance();

    IO.println("NAGAD:");
    nagad.deposit(200);
    ((OnlinePayment) nagad).pay(400);
    ((OnlinePayment) nagad).refund(50);
    nagad.showBalance();

    IO.println("ROCKET:");
    rocket.deposit(300);
    ((OnlinePayment) rocket).pay(200);
    ((OnlinePayment)rocket).refund(300);
    rocket.showBalance();



}

