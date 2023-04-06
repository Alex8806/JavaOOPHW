public class Cat extends Pet {

    public Cat(String name, int age, int weight) {
        super(name, age, weight, "Meow");
    }

    @Override
    public void specialAction(int n) {
        if (this.getWeight() - n > 1) {
            System.out.println(this.getClass() + " " + this.getName() + " walk on key board and loose " + n);
            this.increaseWeight(-n);
        } else {System.out.println(String.format("%s %s try to  walk on key board but don't have power", this.getClass(), this.getName()));}
    }
}

