public abstract class Throuwing implements Weapon {
    private int distance;

    public Throuwing(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Throuwing{" + "demage" + demage() +
                "distance=" + distance +
                '}';
    }


}
