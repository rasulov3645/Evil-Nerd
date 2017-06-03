/**
 * Created by Гамзат on 04.06.2017.
 *
 * Урок 47 - Идентификатор final
 */
public class Bender {
    public static void main(String[] args) {
        Fry finalObject = new Fry(1);

        for (int i = 0; i < 50; i++) {
            finalObject.add();
            System.out.printf("%s", finalObject);
        }

    }
}
