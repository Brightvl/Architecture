package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {




    public BankAccount() {
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
