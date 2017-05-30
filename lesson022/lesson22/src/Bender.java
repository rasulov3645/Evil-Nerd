/**
 * Created by Гамзат on 30.05.2017.
 */
public class Bender {
    public static void main(String[] args) {
        double vklad = 1000;
        double procent = 1;

        for (int year = 1; year <=50; year++) {
            vklad += vklad * procent;
            System.out.println("За " + year + " год, на вашем счету появилась " + vklad + " долларов!!!");
        }
    }
}
