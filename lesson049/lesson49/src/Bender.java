/**
 * Created by Гамзат on 04.06.2017.
 *
 * Урок 49 - GUI (Графический интерфейс)
 */

import  javax.swing.JOptionPane;

public class Bender {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Введи первое число:");
        String sn = JOptionPane.showInputDialog("Введи второе число:");

        // Переводим строку в числу.
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);

        // Вычисляем сумму
        int sum = num1 + num2;

        // Вывод результата
        JOptionPane.showMessageDialog(null,
                "Сумма равна: " + sum,
                "Типа калькулятор!!!",
                JOptionPane.PLAIN_MESSAGE);

    }
}
