
import java.text.MessageFormat;

class Singleton {
    private static Singleton s;
    int newId;
    private Singleton(int id){ newId = id; };
    public static Singleton getInstance(){
        if (s == null) {
            s = new Singleton((int)((Math.random()*5)+1));
        }

        return s;
    }
}

public class Singleton_class {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance();

        System.out.println(MessageFormat.format(
            " ID of A: {0},\n ID of B: {1},\n ID of C: {2}",
            a.newId,b.newId,c.newId
        ));

        System.out.println("Thus,All objects refer to the same instance and only one instance is allowed.");
    }
}
