/**
 * Created by Гамзат on 02.06.2017.
 */
public class Fry {
    private String fname;
    private String lname;
    private static int count = 0;

    public Fry(String fn, String ln){
        fname = fn;
        lname = ln;
        count++;
        System.out.printf("%s %s: в фильме 12 стульев - %d персонаж(а\\ей).\n", fname, lname, count);
    }
}
