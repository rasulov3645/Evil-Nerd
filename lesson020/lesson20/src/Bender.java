/**
 * Created by Гамзат on 30.05.2017.
 *
 * Урок 20 - Программа подсчета среднего значения
 */

import java.util.Scanner;

public class Bender {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        // Объявление переменных
        int kolvo;       // Количество учеников
        int ocenka;      // Оченки учащихся
        int counter;     // Кол-во учащихся
        double summa;    // Средное оченка всех учащихся.

        // Инициализация переменных
        counter = 0;
        summa = 0;

        System.out.println("Введи количество учащихся: ");
        kolvo = enter.nextInt();
        // Проверка кол-во указанных пользователем.
        if (kolvo <= 0) {
            System.out.println("Введи корректное количество учащихся!!!");
            kolvo = enter.nextInt();
        }
        // Пока считчик учащихся меньше кол-ву.
        while (counter < kolvo) {
            counter++;
            System.out.println("Введи оценку " + counter + " ученика:");
            ocenka = enter.nextInt();
            if (ocenka <= 5 && ocenka > 0) {
                summa += ocenka;
            }
            else {
                System.out.println("Введи корректную оценку!!!");
                ocenka = enter.nextInt();
            }
        }
        System.out.println("Средний балл класса равен: " + summa / kolvo);




    }
}
