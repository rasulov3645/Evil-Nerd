/**
 * Created by Гамзат on 01.06.2017.
 *
 * Урок 33 - Введение в многомерные массивы(часть 2) - Таблицы
 *
 *
 */
public class Bender {
    public static void main(String[] args) {
        // Массив 1
        int massiv1[][] = {{46,4,12}, {1,55,90,21}};
        // Массив 2
        int massiv2[][] = {{12,23}, {1}, {34, 56, 7, 12, 67}};
        // Массив 3
        int massiv3[][][] = { {{1},{2}, {3}, {4, 5, 6, 7, 8, 9, 10}},
                              {{2}, {11, 12, 13}, {3, 2, 1}},
                              {{3}, {2, 3, 4, 5, 6}, {1, 2, 10, 4}, {2, 3, 4, 5}}
                            };

        //System.out.println(massiv2[2][2]);

        System.out.println("-------------------");
        // Вызоваем метод с первым массивом.
        System.out.println("Это первый масив:");
        massivtwo(massiv1);

        System.out.println("-------------------");

        // Вызываем метод с вторым массивом.
        System.out.println("Это второй массив:");
        massivtwo(massiv2);
        System.out.println("-------------------");

        // Вызываем метод с вторым массивом.
        System.out.println("Этот трехмерный массив: ");
        System.out.println("-----------------------------");
        massivthree(massiv3);
        System.out.println("------------------------------");



    }

    // Метод выводить двумерный массив
    public static void massivtwo (int m[][]) {
        for (int i = 0; i < m.length; i++){
            for (int y = 0; y < m[i].length; y++){
                System.out.print(m[i][y] + "\t");
            }
            System.out.println(); // Переход на новую строку.
        }
    }

    // Метод выводить тримерный массив.
    public static void massivthree(int m[][][]){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                for(int k = 0; k < m[i][j].length; k++){
                    System.out.print(m[i][j][k] + "\t");
                }
                System.out.println();  // Переход на новую строку.
            }
            System.out.println();  // Переход на новую строку.
        }
    }


}
