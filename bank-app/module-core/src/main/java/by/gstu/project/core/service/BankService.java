package by.gstu.project.core.service;
import by.gstu.project.core.model.Client;
import by.gstu.project.core.model.Transaction;
import java.util.List;
import java.util.stream.Collectors;

public class BankService {

    // Операция 1: Поиск транзакций по счету
    public List<Transaction> findTransactionsByAccount(List<Transaction> allTransactions, String accountId) {
        return allTransactions.stream()
                .filter(t -> t.getFromAccountId().equals(accountId))
                .collect(Collectors.toList());
    }

    // Операция 2: Фильтрация клиентов по сумме средств (больше чем minAmount)
    public List<Client> filterClientsByBalance(List<Client> clients, double minAmount) {
        return clients.stream()
                .filter(c -> c.getTotalBalance() >= minAmount)
                .collect(Collectors.toList());
    }
}