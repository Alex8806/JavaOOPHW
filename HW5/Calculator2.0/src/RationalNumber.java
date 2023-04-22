public class RationalNumber extends Numbers{
    private int m;
    private int n;

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }


    public RationalNumber(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }
}
