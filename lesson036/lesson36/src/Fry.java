/**
 * Created by Гамзат on 01.06.2017.
 */
public class Fry {
    private int hour;
    private int minunte;
    private int second;

    public void setTime(int h, int m, int s){
        hour = ((h>0 && h<24) ? h:0);
        minunte = ((m>0 && m<60) ? m:0);
        second = ((s>0 && s<60) ? s:0);
    }
    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minunte, second);
    }

    public String toNormal(){
        return String.format("%d:%02d:%02d %s", ((hour == 0||hour==12) ? 12:hour%12), minunte, second, (hour<12?"AM":"PM"));
    }
}
