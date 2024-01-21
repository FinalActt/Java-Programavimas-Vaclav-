import java.util.HashMap;
import java.util.Map;

class Bank {
    private Map<String, Client> clients;

    public Bank() {
        this.clients = new HashMap<>();
    }

    public void createClient(String name, String type) {
        Client client;
        if ("fizinis".equals(type)) {
            client = new IndividualClient(name);
        } else if ("juridinis".equals(type)) {
            client = new LegalClient(name);
        } else {
            throw new IllegalArgumentException("Invalid client type");
        }

        clients.put(name, client);
    }

    public void openAccount(String clientName, String currency, String accountType) {
        Client client = clients.get(clientName);
        if (client != null) {
            client.openAccount(currency, accountType);
        } else {
            throw new IllegalArgumentException("Client not found");
        }
    }

    public void transferMoney(String senderName, String receiverName, String currency, double amount) {
        Client sender = clients.get(senderName);
        Client receiver = clients.get(receiverName);

        if (sender != null && receiver != null) {
            sender.transferMoney(receiver, currency, amount);
        } else {
            throw new IllegalArgumentException("Invalid client names");
        }
    }

    public void printClientInfo(String clientName) {
        Client client = clients.get(clientName);
        if (client != null) {
            System.out.println(client.toString());
        } else {
            throw new IllegalArgumentException("Client not found");
        }
    }
}

abstract class Client {
    protected String name;
    protected Map<String, Account> accounts;

    public Client(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public abstract void openAccount(String currency, String accountType);

    public void transferMoney(Client receiver, String currency, double amount) {
        System.out.println(name + " transferred " + amount + " " + currency + " to " + receiver.name);
    }

    @Override
    public String toString() {
        return "Client{name='" + name + "', accounts=" + accounts + '}';
    }
}

class IndividualClient extends Client {
    public IndividualClient(String name) {
        super(name);
    }

    @Override
    public void openAccount(String currency, String accountType) {
        if ("debit".equals(accountType)) {
            accounts.put(currency, new DebitAccount(currency));
        } else {
            throw new IllegalArgumentException("Individual clients can only open debit accounts");
        }
    }
}

class LegalClient extends Client {
    public LegalClient(String name) {
        super(name);
    }

    @Override
    public void openAccount(String currency, String accountType) {
        if ("debit".equals(accountType) || "credit".equals(accountType)) {
            accounts.put(currency, "debit".equals(accountType) ? new DebitAccount(currency) : new CreditAccount(currency));
        } else {
            throw new IllegalArgumentException("Legal clients can open debit or credit accounts");
        }
    }
}

abstract class Account {
    protected String currency;
    protected double balance;

    public Account(String currency) {
        this.currency = currency;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Account{currency='" + currency + "', balance=" + balance + '}';
    }
}

class DebitAccount extends Account {
    public DebitAccount(String currency) {
        super(currency);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

class CreditAccount extends Account {
    public CreditAccount(String currency) {
        super(currency);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

public class uzd3 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createClient("John Doe", "fizinis");
        bank.openAccount("John Doe", "EUR", "debit");
        bank.createClient("XYZ Corp", "juridinis");
        bank.openAccount("XYZ Corp", "USD", "debit");
        bank.transferMoney("John Doe", "XYZ Corp", "EUR", 1000.0);
        bank.printClientInfo("John Doe");
        bank.printClientInfo("XYZ Corp");
    }
}