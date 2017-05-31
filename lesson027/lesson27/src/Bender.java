/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 27 - Массивы, создание таблицы
 */
public class Bender {
    public static void main(String[] args) {
        System.out.println("Поля\t\tЗначения");
        String animals[] = {"Еж","Лис","Пес","Уж"};

        for (int i = 0; i < animals.length; i++){
            System.out.println(i + "\t\t\t" + animals[i]);
        }
    }
}
