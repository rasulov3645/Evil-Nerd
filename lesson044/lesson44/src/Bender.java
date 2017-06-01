/**
 * Created by Гамзат on 02.06.2017.
 *
 * Урок 44 - Компоновка, диапазон (EnumSet)
 */
import java.util.EnumSet;

public class Bender {
    public static void main(String[] args) {

        for(Fry heroes : Fry.values()){
            System.out.printf("%s - %s и %s\n", heroes, heroes.getDesc1(), heroes.getDesc2());
        }

        System.out.println("\nА тут мы видим, как выглядит вывод диапазона перечислений!!!\n");

        for(Fry heroes : EnumSet.range(Fry.Amy, Fry.Bender)){
            System.out.printf("%s - %s и %s\n", heroes, heroes.getDesc1(), heroes.getDesc2());
        }
    }
}
