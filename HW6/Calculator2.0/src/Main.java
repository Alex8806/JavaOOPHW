import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2.0, 5.2);
        ComplexNumber c2 = new ComplexNumber(1.2, 4.2);
        RationalNumber r1 = new RationalNumber(5, 4);
        RationalNumber r2 = new RationalNumber(3, 4);
        View v1 = new View(c1, c2);
        Calculator<ComplexNumber> calc1 = new ComplexCalculatingModel();
        Presenter p1 = new Presenter<>(calc1, v1);
        p1.sum();
        p1.diff();
        p1.div();
        p1.multip();
        View v2 = new View(r1,r2);
        Calculator<RationalNumber> calc2 = new RationalNumberCalculatingModel();
        p1.calc = calc2;
        p1.view = v2;
        p1.sum();
        p1.diff();
        p1.div();
        p1.multip();

    }
}