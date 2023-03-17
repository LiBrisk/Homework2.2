public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int addAmount = 1100;
        int bonus = 0;
        int minAddAmount = 1000;

        if (addAmount > minAddAmount) {
            bonus = addAmount / 100;
        }
        System.out.println("Итоговый счет = " + (initialBalance + addAmount + bonus) + "руб");
        System.out.println("Количество бонусых рублей = " + bonus + "руб");


    }
}