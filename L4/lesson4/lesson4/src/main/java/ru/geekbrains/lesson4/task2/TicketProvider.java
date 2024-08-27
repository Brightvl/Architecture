package ru.geekbrains.lesson4.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TicketProvider {

    private final Database database;
    private final PaymentProvider paymentProvider;

    public TicketProvider(Database database, PaymentProvider paymentProvider) {
        this.database = database;
        this.paymentProvider = paymentProvider;
    }

    public Collection<Ticket> searchTicket(int clientId, Date date) {
        // Предусловие
        if (clientId <= 0) {
            throw new IllegalArgumentException("Client ID должен быть положительным");
        }

        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : database.getTickets()) {
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date)) {
                tickets.add(ticket);
            }
        }

        // Постусловие
        if (tickets.isEmpty()) {
            System.out.println("Не найдено билетов для данного клиента и даты");
        }

        return tickets;
    }

    public boolean buyTicket(int clientId, String cardNo) {
        // Предусловие
        if (clientId <= 0 || cardNo == null || cardNo.isEmpty()) {
            throw new IllegalArgumentException("Неверные данные для покупки билета");
        }

        int orderId = database.createTicketOrder(clientId);
        double amount = database.getTicketAmount();

        boolean result = paymentProvider.buyTicket(orderId, cardNo, amount);

        // Постусловие
        if (!result) {
            System.out.println("Покупка билета не удалась");
        }

        return result;
    }

    public boolean checkTicket(String qrcode) {
        // Предусловие
        if (qrcode == null || qrcode.isEmpty()) {
            throw new IllegalArgumentException("QR-код не может быть пустым");
        }

        for (Ticket ticket : database.getTickets()) {
            if (ticket.getQrcode().equals(qrcode)) {
                ticket.setEnable(false);
                return true;
            }
        }

        // Постусловие
        System.out.println("Билет не найден или уже использован");
        return false;
    }
}
