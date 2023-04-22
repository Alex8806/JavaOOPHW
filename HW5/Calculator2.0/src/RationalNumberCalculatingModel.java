public class RationalNumberCalculatingModel extends Calculator<RationalNumber> implements CalculatingModel<RationalNumber>{

    @Override
    public RationalNumber sum(RationalNumber n1, RationalNumber n2) {
        return new RationalNumber (n1.getN()*n2.getM()+n1.getN()*n2.getM(),n1.getN()* n2.getN());
    }

    @Override
    public RationalNumber diff(RationalNumber n1, RationalNumber n2) {
        return new RationalNumber (n2.getN()*n1.getM()-n1.getN()*n2.getM(),n1.getN()* n2.getN());
    }

    @Override
    public RationalNumber multip(RationalNumber n1, RationalNumber n2) {
        return new RationalNumber(n1.getM()* n2.getM(), n1.getN()* n2.getN());

    }

    @Override
    public RationalNumber div(RationalNumber n1, RationalNumber n2) {
        return new RationalNumber(n1.getM()* n2.getN(), n1.getN()*n2.getM() );
    }
}
