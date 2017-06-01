/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 28 - Суммирование элементов массива.
 */
public class Bender {
    public static void main(String[] args) {
        int Bender[] = {23, 3, 45, 3, 10, 11};

        int summa = 0;

        for (int i = 0; i < Bender.length; i++){
            summa += Bender[i];
        }

        System.out.println("Сумма равно: " + summa);
    }
}
