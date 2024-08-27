package ru.geekbrains.lesson4.task2;

import java.util.ArrayList;
import java.util.Collection;

public class Customer {

    private static int counter;
    private final int id;
    private Collection<Ticket> tickets = new ArrayList<>();

    {
        id = ++counter;
    }

    public Customer() {
        // Пустой конструктор без аргументов
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }
}
