public class Presenter<T extends Calculator> {
    Calculator calc;
    View view;

    public Presenter(Calculator calc, View view) {
        this.calc = calc;
        this.view = view;
    }


    public void sum() {
        view.print(calc.sum(view.n1, view.n2));

    }


    public void diff() {
        view.print(calc.diff(view.n1, view.n2));
    }


    public void multip() {
        view.print(calc.multip(view.n1, view.n2));
    }


    public void div() {
        view.print(calc.div(view.n1, view.n2));
    }
}
