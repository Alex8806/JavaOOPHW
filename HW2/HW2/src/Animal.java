public abstract class Animal extends Creature {
    String sound;
    public void GetWeight(int n){
        super.setWeight(super.getWeight()+n);
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
