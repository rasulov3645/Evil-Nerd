import java.awt.FlowLayout;              /*   */
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
        pole1 = new JTextField("Number: ",10);
        add(pole1);
        pole2 = new JTextField("Vvedi tut svoi text!!!");
        add(pole2);
        pole3 = new JTextField("Neredaktiruemoe pole!!!", 30);
        pole3.setEditable(false);
        add(pole3);
        pass = new JPasswordField("Moi parol!!!");
        add(pass);
        Obrabotchik obrabotchik = new Obrabotchik();
        pole1.addActionListener(obrabotchik);
        pole2.addActionListener(obrabotchik);
        pole3.addActionListener(obrabotchik);
        pass.addActionListener(obrabotchik);
    }


    private class Obrabotchik implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = "";
            if (event.getSource() == pole1){
                string = String.format("Pole 1: %s", event.getActionCommand());
            }
            else if (event.getSource() == pole2) {
                string = String.format("Pole 2: %s", event.getActionCommand());
            }
            else if (event.getSource() == pole3) {
                string = String.format("Pole 3: %s", event.getActionCommand());
            }
            else if (event.getSource() == pass) {
                string = String.format("Pole s parolem :) %s", event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, string);

        }
    }


}
