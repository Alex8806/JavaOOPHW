public class CalculateComplex extends ComplexNumbers implements Calculating<ComplexNumbers> {
    public CalculateComplex(double x, double y) {
        super(x, y);
    }

    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((x + w), (y + z));
    }

    @Override
    public ComplexNumbers diff() {
        return new ComplexNumbers(x - w, y - z);
    }

    @Override
    public ComplexNumbers multip() {
        return new ComplexNumbers(x, y);
    }

    @Override
    public ComplexNumbers div() {
        return new ComplexNumbers(x, y);
    }

    @Override
    public String toString() {
        return "CalculateComplex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
