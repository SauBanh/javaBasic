package account;

public abstract class CheckingAccount extends Account {

    public int rewardPoints;

    public int getRewardPoints() {
        return this.rewardPoints;
    }

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost) {
        if (cost > balance) {
            return false;
        }
        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public abstract int calculateRewardPoints(double cost);

    @Override
    public void status() {
        System.out.println("Checking Account.");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tReward Points: %d\n", rewardPoints);
        System.out.println();
    }
}
