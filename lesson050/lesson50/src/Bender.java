import javax.swing.JFrame;

/**
 * Created by Гамзат on 04.06.2017.
 *
 * Урок 50 - GUI - JFrame и JLabel
 */

public class Bender {
    public static void main(String[] args) {
        Fry wnd = new Fry();
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setSize(400, 200);
        wnd.setVisible(true);

    }
}
