package lesson8.accounts;

public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SomeBank","Denis", 1000, 50);
        savingAccount.depositMoney(100);

        System.out.println(savingAccount.moneyAmount);

        savingAccount.changeOwnerName("Oleg");

        System.out.println(savingAccount.ownerName);

        ChekingAccount chekingAccount = new ChekingAccount("SomeBank","Denis", 1000, 500);

        chekingAccount.changeOwnerName("Oleg");

        System.out.println(chekingAccount.ownerName);
    }
}
