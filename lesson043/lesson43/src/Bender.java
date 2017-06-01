/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 43 - Компоновка (eNum)
 */
public class Bender {
    public static void main(String[] args) {
        for(Fry heroes : Fry.values()){
            System.out.printf("%s - %s и %s\n", heroes, heroes.getDesc1(), heroes.getDesc2());
        }
    }
}
