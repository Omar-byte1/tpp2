package tp2.bank.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private double balance;
    private Client owner;
    private List<Log> operations = new ArrayList<>();

    public Account(String accountNumber, Client owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        operations.add(new Log("Deposit: "  + amount));
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            operations.add(new Log("Withdraw: " + amount));
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

}
