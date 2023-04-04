public abstract class Creature implements GetWeight {
    private String name;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Creature(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return  this.getClass() + String.format(" %s with weight %d, %d years old",this.getName() ,getWeight() , getAge());
    }
}
