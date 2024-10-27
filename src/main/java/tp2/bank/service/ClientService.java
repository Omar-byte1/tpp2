package tp2.bank.service;
import tp2.bank.models.Account;

public class ClientService {
    public void deposit(Account account, double amount) {
        account.deposit(amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(Account account, double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayBalance(Account account) {
        System.out.println("Balance: " + account.getBalance());
    }
}
