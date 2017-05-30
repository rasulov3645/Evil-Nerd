import java.util.Scanner;

/**
 * Created by Гамзат on 30.05.2017.
 */
public class Bender {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        Fry PhillipFry = new Fry();

        System.out.println("Введи назнание своего любимого фильма: ");
        String movie = enter.nextLine();

        PhillipFry.setName(movie);
        PhillipFry.output();

    }
}
