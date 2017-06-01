/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 34 - Методы с переменным количеством аргументов
 */
public class Bender {
    public static void main(String[] args) {
        System.out.println(av(12,2,34,23,22,45,66,90,50));
    }

    // Метод возврашаеть средное значение произвольных аргументов.
    public static int av(int...num){
        int sum = 0;

        for (int i:num){
            sum+=i;
        }
        return sum/num.length;
    }

}
