public class Dog extends Pet {
    public Dog(String name, int age, int weight) {
        super(name, age, weight, "Bark");
    }
    @Override
    public void specialAction(int n) {
        n =4;
        if (this.getWeight() - n > 1) {
            System.out.println(this.getClass() + " " + this.getName() + " destroy sleepers  and loose " + n);
            this.increaseWeight(-n);
        } else {System.out.println(String.format("%s %s try to destroy sleepers but don't have power", this.getClass(), this.getName()));}
    }
}
