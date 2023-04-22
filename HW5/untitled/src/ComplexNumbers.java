public class ComplexNumbers extends ValuesNumbers {
    public ComplexNumbers(double x, double y) {
        super.x=x;
        super.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ComplexNumbers ob = (ComplexNumbers) obj;
        return super.x == ob.x && super.y == ob.y;
    }

    @Override
    public String toString() {
        return "ComplexNumbers{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", z=" + z +
                '}';
    }
}
