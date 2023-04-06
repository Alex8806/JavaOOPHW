public abstract class Animal extends Creature implements Action, AnimalincreaseWeight {
    private final AnimalWEight animalWEight = new AnimalWEight();
    String sound;

    @Override
    public void increaseWeight(int n){
        animalWEight.increaseWeight(n);
    }

    public Animal(String name, int age, int weight, String sound) {
        super(name, age, weight);
        this.sound = sound;
    }
    protected void Eat(String s, int weight){
        System.out.println(String.format("%s %s eat %s and get weight %d", this.getClass(), this.getName() , s , weight) );
        super.setWeight(super.getWeight()+weight);
    }

}
