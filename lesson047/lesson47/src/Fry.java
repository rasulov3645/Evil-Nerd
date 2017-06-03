/**
 * Created by Гамзат on 04.06.2017.
 */
public class Fry {
    private int sum;
    private final int num;



    public Fry(int n ) {
        num = n;

    }

    public void add() {
        sum += num;

    }
    public String toString(){
        return String.format("Сумма чисел равна = %s\n", sum);
    }



}
