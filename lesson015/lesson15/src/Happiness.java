import java.util.Random;
import java.util.Scanner;

/**
 * Created by Гамзат on 30.05.2017.
 */
public class Happiness {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner enter = new Scanner(System.in);

        // Объявление переменных
        int Happiness;          // Счастья
        int Luck;               // Удача
        int Wealth;             // Благосостоянья
        int Health;             // Здоровья
        int Intelligence;       // Интеллект
        int Age;

        // Инициализация переменных
        Happiness = 0;
        Luck = 0;
        Wealth = 0;
        Health = 0;
        Intelligence = 0;


        System.out.println("Введите свой возрасть: ");
        Age = enter.nextInt();
        while (Age < 100){
            Happiness += random.nextInt(100);
            Luck += random.nextInt(100);
            Wealth += random.nextInt(100);
            Health += random.nextInt(100);
            Intelligence += random.nextInt(100);
            Age++;
        }

        System.out.println("В ваши " + Age + " лет, Вы довольно продвинутый перец!");
        System.out.println("Уровень счастья равен " + Happiness + "!!!");
        System.out.println("Уровень удачи равен " +  Luck + "!!!");
        System.out.println("Уровень счастья равен " + Wealth + "!!!");
        System.out.println("Уровень счастья равен " + Health + "!!!");
        System.out.println("Уровень счастья равен " + Intelligence + "!!!");

    }
}
