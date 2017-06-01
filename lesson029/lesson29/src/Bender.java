import java.util.Random;

/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 29 - Подсчет количества выпадений числа в рулетке (массив)
 */
public class Bender {
    public static void main(String[] args) {
        Random roulette = new Random();

        int num[] = new int[33];
        int sum = 0;

        // Суммирование выпадающих чисел.
        for (int i = 0; i < 1000; i++){
            ++num[roulette.nextInt(33)];
        }

        System.out.println("Номер\tЧисло");

        // Вывод массива.
        for (int i = 0; i < num.length; i++){
            System.out.println(i + "\t\t" + num[i]);
            sum += num[i];
        }

        // Вывод
        System.out.println("--------------------------");
        System.out.println("Проверка");
        System.out.println("Сумма равно: " + sum);
        System.out.println("--------------------------");

    }

}
