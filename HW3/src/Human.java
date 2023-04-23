public class Human extends Creature implements PetListInerf {
    protected PetList petList;

    public void takePet(Pet p1) {
        this.takePet(this, p1);
    }


    public Human(String name, int age, int weight) {
        super(name, age, weight);
        this.petList = null;
    }

    @Override
    public String toString() {
        return super.toString()+" " + this.petList;
    }
}