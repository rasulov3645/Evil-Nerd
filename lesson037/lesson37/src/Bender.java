/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 37 - public, private, this
 */
public class Bender {
    public static void main(String[] args) {
        Fry time = new Fry();
        System.out.println(time.toNormal());

        time.setTime(5,55, 68);
        System.out.println(time.toNormal());


    }
}
