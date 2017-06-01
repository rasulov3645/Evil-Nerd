/**
 * Created by Гамзат on 01.06.2017.
 *
 * рок 31 - Массивы в методах
 *
 * 
 */
public class Bender {
    public static void main(String[] args) {

        String heroes[] = {"Эми","Мегги","Лила","Луис"};

        // Вызов метода
        title(heroes);



        for (String i: heroes) {
            System.out.println(i);
        }
    }


    public static void title (String t[]){
        for (int i = 0; i < t.length; i++) {
            t[i] += " - та еще штучка!";
        }
    }

}
