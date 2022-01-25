package main.java.com.company;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterest());
        System.out.println(account.getDateCreated());
    }
}
