package main.java.com.company;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//@Data
//@Getter
//@Setter
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;


    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.balance = balance;
        this.id = id;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate/1200);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }


}
