package account;

public abstract class Account {

    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n", balance);
    }

}
