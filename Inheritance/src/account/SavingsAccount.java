package account;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;
        // if (amount > balance) {
        //     return false;
        // }

        // balance -= amount;
        // return true;
        return super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        // super.deposit(amount);
    }

    @Override
    public void status() {
        System.out.printf("Saving Account [Balance: %.2f | Interest rate: %.2f]\n", balance, interestRate);
    }
}
