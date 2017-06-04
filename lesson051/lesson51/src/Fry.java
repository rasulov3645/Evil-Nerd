import java.awt.FlowLayout;
import java.awt.event.ActionListener;    /* Прослушиваеть события */
import java.awt.event.ActionEvent;       /* Геагирует на эти события */
import javax.swing.JFrame;               /* Само окно */
import javax.swing.JTextField;           /* Текствое поля для ввода данных */
import javax.swing.JPasswordField;       /* Поля с паролем */
import javax.swing.JOptionPane;          /* Всплываюшая окошка */


/**
 * Created by Гамзат on 04.06.2017.
 */
public class Fry extends JFrame {
    private JTextField pole1;
    private JTextField pole2;
    private JTextField pole3;
    private JPasswordField pass;

    public Fry() {
        super("Nazvanie okna");
        setLayout(new FlowLayout());
        pole1 = new JTextField(10);
        add(pole1);
        pole2 = new JTextField("Vvedi tut svoi text!!!");
        add(pole2);
        pole3 = new JTextField("Neredaktiruemoe pole!!!", 30);
        pole3.setEditable(false);
        add(pole3);
        pass = new JPasswordField("Moi parol!!!");
        add(pass);

    }

}
