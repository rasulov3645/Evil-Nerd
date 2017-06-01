/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 36 - Обработка строковых данных (обычное время) часть 2
 */
public class Bender {
    public static void main(String[] args) {

        Fry time = new Fry();
        System.out.println(time.toMilitary());

        time.setTime(15, 55, 68);
        System.out.println(time.toMilitary());

        time.setTime(18, 55, 33);
        System.out.println(time.toNormal());
    }

}
