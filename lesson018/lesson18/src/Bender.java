/**
 * Created by Гамзат on 30.05.2017.
 */
public class Bender {
    public static void main(String[] args) {
        int Homer;
        Homer = 110;

        if (Homer > 115) {
            System.out.println("Идеальный вес!!!");
        }
        else if (Homer > 111){
            System.out.println("Супер идеальный вес!!!");
        }
        else if (Homer < 118){
            System.out.println("Вес практически идеальный!!!");
        }
        else {
            System.out.println("Иди еще поешь Дистрофик!!!");
        }
    }
}
