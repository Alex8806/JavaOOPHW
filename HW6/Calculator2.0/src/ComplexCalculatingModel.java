public class ComplexCalculatingModel extends Calculator<ComplexNumber>  {
    @Override
    public ComplexNumber sum(ComplexNumber n1, ComplexNumber n2) {
        return new ComplexNumber(n1.getA() + n2.getA(), n1.getB() + n2.getB());
    }

    @Override
    public ComplexNumber diff(ComplexNumber n1, ComplexNumber n2) {
        return new ComplexNumber(n1.getA() - n2.getA(), n1.getB() - n2.getB());
    }

    @Override
    public ComplexNumber multip(ComplexNumber n1, ComplexNumber n2) {
        return new ComplexNumber(n1.getA()*n2.getA() - n1.getB()* n2.getB() , n1.getB()*n2.getA() - n1.getA()*n2.getB());
    }

    @Override
    public ComplexNumber div(ComplexNumber n1, ComplexNumber n2) {
        return new ComplexNumber((n1.getA()*n2.getA() - n1.getB()* n2.getB())/(n2.getA()*n2.getA()+n2.getB()*n2.getB())
                , (n1.getB()*n2.getA() - n1.getA()*n2.getB())/(n2.getA()*n2.getA()+n2.getB()*n2.getB()));
    }
}
