public class AnimalWEight implements AnimalincreaseWeight {
    public AnimalWEight() {
    }

    @Override
    public void increaseWeight(int n) {
        super.setWeight(super.getWeight() + n);
    }
}