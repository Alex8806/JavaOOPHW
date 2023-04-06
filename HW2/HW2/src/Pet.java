public class Pet extends Animal implements PetListInerf, SpecialAction{

 protected Human owner;

    public Human getOwner() {
        return this.owner;
    }

    public void setOwner(Human h1) {
        this.owner = h1;
        this.takePet(h1,this);
    }

    public Pet(String name, int age, int weight, String sound) {
        super(name, age, weight, sound);
    }


    @Override
    public void specialAction(int looseweight) {

    }
}
