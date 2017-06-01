/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 35 - Обработка строковых данных (военное время) часть 1
 *
 */
public class Bender {
    public static void main(String[] args) {
        String res_time;
        Try time = new Try();

        res_time = time.toMilitary();
        System.out.println(res_time);

        time.setTime(15, 55, 55);
        res_time = time.toMilitary();
        System.out.println(res_time);

    }
}
