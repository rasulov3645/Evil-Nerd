/**
 * Created by Гамзат on 04.06.2017.
 *
 * Урок 46 - Статичные переменные (static). Часть 2
 */
public class Bender {
    public static void main(String[] args) {
        Fry pers1 = new Fry("Остап", "Бендер");
        Fry pers2 = new Fry("Киса", "Воробьянинов");
        Fry pers3 = new Fry("Отец", "Федор");

        System.out.println();


        // Вывод
        System.out.println("----------------");

        System.out.println(pers1.getFname());
        System.out.println(pers1.getLname());
        System.out.println(pers1.getCount());

        System.out.println("----------------");

        System.out.println(pers2.getFname());
        System.out.println(pers2.getLname());
        System.out.println(pers2.getCount());

        System.out.println("----------------");

        System.out.println(pers3.getFname());
        System.out.println(pers3.getLname());
        System.out.println(pers3.getCount());

        System.out.println("----------------");

        System.out.println(Fry.getCount());

    }
}
