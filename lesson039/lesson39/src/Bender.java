/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 39 - Перегруженные конструкторы, set и get методы (часть 2)
 */
public class Bender {
    public static void main(String[] args) {
        Fry PhillipFry1 = new Fry();
        Fry PhillipFry2 = new Fry(2000);
        Fry PhillipFry3 = new Fry(2005, 20);
        Fry PhillipFry4 = new Fry(2012, 12, 12);

        System.out.printf("%s\n", PhillipFry1.toDisplay());
        System.out.printf("%s\n", PhillipFry2.toDisplay());
        System.out.printf("%s\n", PhillipFry3.toDisplay());
        System.out.printf("%s\n", PhillipFry4.toDisplay());

    }

}
