package ru.geekbrains.lesson4.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Database {

    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Database() {
        // Создаем билеты
        Ticket ticket1 = new Ticket(1, 1, new Date(), "QR123");
        Ticket ticket2 = new Ticket(2, 1, new Date(), "QR124");
        Ticket ticket3 = new Ticket(3, 2, new Date(), "QR125");
        Ticket ticket4 = new Ticket(4, 3, new Date(), "QR126");

        // Добавляем билеты в базу
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);

        // Создаем клиентов
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        // Привязываем билеты к клиентам
        customer1.getTickets().add(ticket1);
        customer1.getTickets().add(ticket2);
        customer2.getTickets().add(ticket3);
        customer3.getTickets().add(ticket4);

        // Добавляем клиентов в базу
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public double getTicketAmount() {
        return 55;
    }

    public int createTicketOrder(int clientId) {
        return ++counter;
    }
}
