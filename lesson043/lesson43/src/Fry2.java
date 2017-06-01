/**
 * Created by Гамзат on 01.06.2017.
 */
public enum Fry2 {
    Amy("китаянка", "секси"),
    Fry("тупой", "ленивый"),
    Rick("алкоголик", "гений"),
    Car("BMW", "Белая"),
    Man("Расул", "18 лет");

    private final String desc1;
    private final String desc2;

    Fry2(String d1, String d2){
        desc1 = d1;
        desc2 = d2;

    }
    public String getDesc1(){
        return desc1;
    }
    public String getDesc2() {
        return desc2;
    }
}
