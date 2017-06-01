/**
 * Created by Гамзат on 01.06.2017.
 */
public class Fry {
    private int hour = 1;
    private int minute = 2;
    private int second = 3;


    public void setTime(int h, int m, int s){
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    public String toNormal() {
        return String.format("%d:%02d:%02d: %s", ((hour==0||hour==12) ? 12:hour), minute, second, (hour<12 ? "AM":"PM"));
    }






















}
