import java.util.Random;

public abstract class Warrior<T extends Weapon, C extends StartWithNoShield> extends Person {
    protected static Random rand = new Random();
    protected T weapon;
    protected C shield;


    public Warrior(String name, int hp, T weapon, C shieldOrNoShield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shieldOrNoShield;
    }

    public int harm() {
        boolean ishHit = rand.nextBoolean();
        int demage = 0;
        if (ishHit) {
            demage = rand.nextInt(this.weapon.demage() + 1);
        }
        return demage;
    }

    @Override
    public String toString() {
        return "Warrior{ " + super.getName() + " hp- " + super.getHp() +
                " weapon- " + weapon +
                '}';
    }
}
