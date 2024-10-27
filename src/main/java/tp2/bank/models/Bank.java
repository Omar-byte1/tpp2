package tp2.bank.models;

import java.util.ArrayList;
import java.util.List;
public class Bank {

    private final String name;
    private List<Client> clients = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
