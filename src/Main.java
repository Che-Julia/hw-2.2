public class Main {
    public static void main(String[] args) {
        int x = 200; // начальный счёт
        int y = 2300; // сумма пополнения


        int bonus; // начисленный бонус




        if (y > 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
        }

        int a = x + y + bonus; // итоговый счет

        System.out.println("Итоговый счет: " + a ); }
}

