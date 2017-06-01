import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by Гамзат on 01.06.2017.
 */
public class Data {
    public static void main(String[] args) {
        SimpleDateFormat DateYear = new SimpleDateFormat("YYYY");
        SimpleDateFormat DateMonth = new SimpleDateFormat("MM");
        SimpleDateFormat DateDay = new SimpleDateFormat("DD");

        int y = Integer.parseInt(DateYear.format(new Date()));
        int m = Integer.parseInt(DateMonth.format(new Date()));
        int d = Integer.parseInt(DateDay.format(new Date()));

    }
}
