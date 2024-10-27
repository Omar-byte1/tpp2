package tp2.bank.service;
import tp2.bank.models.Account;
import tp2.bank.models.Client;
public class BankService {
    public void createAccount(Client client, String accountNumber) {
        Account account = new Account(accountNumber, client);
        System.out.println("Account created for " + client.getName());
    }

}

