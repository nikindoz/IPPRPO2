package by.gstu.project.core.model;

public class Transaction {
    private String fromAccountId;
    private String toAccountId;
    private double amount;

    public Transaction(String fromAccountId, String toAccountId, double amount) {
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
    }

    public String getFromAccountId() {
        return fromAccountId;
    }

    public String toString() {
        return "Trans: " + fromAccountId + " -> " + toAccountId + " : " + amount;
    }
}