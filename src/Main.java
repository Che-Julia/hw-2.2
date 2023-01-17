public class Main {
    public static void main(String[] args) {
        int balance = 200; // начальный счёт
        int amount = 2300; // сумма пополнения

        int bonus; // начисленный бонус

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = balance + amount + bonus;

        System.out.println("Итоговый счет: " + totalAmount ); }
}

