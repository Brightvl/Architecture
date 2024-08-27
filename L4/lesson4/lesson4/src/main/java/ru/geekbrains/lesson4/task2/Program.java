package ru.geekbrains.lesson4.task2;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());

        // Покупка билета
        if (mobileApp.buyTicket("1000000000000099")) {
            System.out.println("Билет успешно куплен!");
        }

        // Поиск билетов
        mobileApp.searchTicket(new Date());

        // Проверка билета на автобусной станции
        if (busStation.checkTicket("QR123")) {
            System.out.println("Билет действителен.");
        } else {
            System.out.println("Билет недействителен.");
        }
    }
}
