/**
 * Created by Гамзат on 01.06.2017.
 */
public class Fry {
    private String name;
    private Rick bd;

    public Fry(String n, Rick bday) {
        name = n;
        bd = bday;
    }

    public String toString() {
        return String.format("Меня звать %s, я родился - %s!!!", name, bd);
    }
}
