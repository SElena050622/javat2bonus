public class Main {
    public static void main(String[] args) {
        // начальная сумма у клиента
        int have = 100;
        // пополнение счета
        int geld = 1100;
        // количество рублей за полных 100 руб. при пополнении счета свыше 1000 руб.
        int prbonus = 1;
        // итоговая сумма после пополнения с учетом бонусов
        int allcheck;
        int bonus;
        boolean geldcheck = true;

        if (geld >= 1000) {
            geldcheck = true;
            allcheck = have + geld + ((geld / 100) * prbonus);
            bonus = (geld / 100) * prbonus;

        } else {
            geldcheck = false;
            allcheck = have + geld;
            bonus = 0;

        }

        System.out.println("Ваш остаток составляет:" + have);
        System.out.println("Вы пополнили счет на:" + geld);
        System.out.println("Ваш бонус составляет:" + bonus);
        System.out.println("Текущая сумма счета составляет:" + allcheck);
    }
}

