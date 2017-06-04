/* Импортирования библиотик */
import java.awt.FlowLayout;   /* Дла расположение элементов в окне */
import javax.swing.JFrame;    /* Само окно */
import javax.swing.JLabel;    /* И элемент или текс */

/**
 * Created by Гамзат on 04.06.2017.
 */
public class Fry extends JFrame{
    private JLabel text1;

    public Fry() {
        super("Это заголовок окна");
        setLayout(new FlowLayout());
        text1 = new JLabel("Не корми енота в туалете!!!");
        text1.setToolTipText("Это не шутка");
        add(text1);
    }

}
