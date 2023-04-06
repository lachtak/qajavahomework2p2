public class Main {
    public static void main(String[] args) {
        int userBalance = 24;
        int topUpBalance = 1991;

        int bonus;
        if (topUpBalance > 1000) {
            bonus = topUpBalance / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Вы пополнили счёт. Ваш баланс: " + ((userBalance) + (topUpBalance) + (bonus)));
    }
}