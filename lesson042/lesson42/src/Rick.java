/**
 * Created by Гамзат on 01.06.2017.
 */
public class Rick {
    private int day;
    private int month;
    private int year;

    public Rick(int d, int m, int y){
        day = d;
        month = m;
        year = y;
        System.out.printf("День рождения Рика -%s\n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
