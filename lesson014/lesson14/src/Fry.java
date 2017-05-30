/**
 * Created by Гамзат on 30.05.2017.
 */
public class Fry {
    private String movieName;

    public void setName (String name) {
        movieName = name;
    }
    public String getName(){
        return movieName;
    }
    
    public void output() {
        System.out.printf("Твой любимый фильм - %s", getName());
    }
}
