public class ComplexNumber extends Numbers {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return  String.format("%f +%f*i",this.a,this.b);
    }
}
