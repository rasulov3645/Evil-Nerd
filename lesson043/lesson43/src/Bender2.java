/**
 * Created by Гамзат on 01.06.2017.
 */
public class Bender2 {
    public static void main(String[] args) {
        for(Fry2 heroes : Fry2.values()){
            System.out.printf("%s - %s и %s\n", heroes, heroes.getDesc1(), heroes.getDesc2());
        }
    }
}
