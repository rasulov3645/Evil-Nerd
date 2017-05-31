import java.util.Random;

/**
 * Created by Гамзат on 31.05.2017.
 *
 * Урок 25 - Генератор случайных чисел. (Random)
 */
public class Bender {
    public static void main(String[] args) {
        Random roulette = new Random();

        for (int i = 1; i < 11; i++){
            System.out.println(roulette.nextInt(32) + 1);
        }
    }
}
