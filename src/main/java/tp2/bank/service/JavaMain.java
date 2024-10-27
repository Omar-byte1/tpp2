package tp2.bank.service;
import tp2.bank.models.Bank;
import tp2.bank.models.Client;
import tp2.bank.models.Account;
import tp2.bank.service.BankService;
import tp2.bank.service.ClientService;

import java.util.Scanner;
public class JavaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank("MyBank");
        BankService bankService = new BankService();
        ClientService clientService = new ClientService();

        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        System.out.print("Enter client email: ");
        String email = scanner.nextLine();
        Client client = new Client(name, email);
        bank.addClient(client);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = new Account(accountNumber, client);

        bankService.createAccount(client, accountNumber);

        System.out.print("Enter deposit amount: ");
        double deposit = scanner.nextDouble();
        clientService.deposit(account, deposit);

        clientService.displayBalance(account);

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = scanner.nextDouble();
        clientService.withdraw(account, withdrawal);

        clientService.displayBalance(account);

        scanner.close();
    }
}
