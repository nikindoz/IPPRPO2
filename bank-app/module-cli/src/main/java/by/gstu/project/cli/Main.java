package by.gstu.project.cli;

// Импортируем модели
import by.gstu.project.core.model.Account;
import by.gstu.project.core.model.Client;
import by.gstu.project.core.model.Transaction;

// ВАЖНО: Импортируем сервис (вот этого не хватало или было неправильно)
import by.gstu.project.core.service.BankService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Теперь Java знает, что такое BankService, благодаря импорту выше
        BankService service = new BankService();

        // Тестовые данные
        Account acc1 = new Account("ACC001", 5000);
        Account acc2 = new Account("ACC002", 15000);

        Client client1 = new Client("Ivan");
        client1.addAccount(acc1);

        Client client2 = new Client("Maria");
        client2.addAccount(acc2);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("ACC001", "ACC002", 100));

        // Демонстрация
        System.out.println("--- WEALTHY CLIENTS ---");

        // Вызываем метод сервиса
        List<Client> rich = service.filterClientsByBalance(clients, 10000);

        // Выводим результат
        if (rich.isEmpty()) {
            System.out.println("Никого не найдено :(");
        } else {
            rich.forEach(c -> System.out.println("Клиент: " + c.getName() + " | Баланс: " + c.getTotalBalance()));
        }
    }
}