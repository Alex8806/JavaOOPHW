import java.util.List;

public class Food {
    protected String name;
    protected int n;

    public Food(String name, int n) {
        this.name = name;
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public int getN() {
        return n;
    }
}
