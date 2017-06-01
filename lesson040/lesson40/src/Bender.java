/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 40 - Программа - таблица умножения
 *
 */
public class Bender {
    public static void main(String[] args) {

        int [][] TabUm = new int [10][10];

        for (int i = 0; i < TabUm.length; i++ ) {
            for (int j = 0; j < TabUm[i].length; j++){
                TabUm[i][j] = (i+1) * (j+ 1);
                System.out.printf("%4d", TabUm[i][j]);
            }
            System.out.println();
        }
    }
}
