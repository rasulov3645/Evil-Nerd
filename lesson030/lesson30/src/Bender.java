/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 30 - Расширенный цикл For (enhanced for loop)
 *
 * Данная Программа это бармен который считаеть
 * сколько кружек пиво была выпита.
 *
 */
public class Bender {
    public static void main(String[] args) {

        int beer[] = {1, 2, 3, 5, 8};
        int sum = 0;

        for (int i : beer){
            sum += i;
        }
        System.out.println("Было выпито " + sum + " кружек пива.");

    }
}
