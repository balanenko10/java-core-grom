package lesson8.accounts;

public class ChekingAccount extends Account {
    int limitOfExpenses;

    public ChekingAccount(String bankName, String ownerName, int moneyAmount, int limitOfExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOfExpenses = limitOfExpenses;
    }

    void withdraw(int amount) {
        if (amount > limitOfExpenses)
            return;
        moneyAmount -= amount;
    }
}
