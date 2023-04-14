import java.util.*;

public class Childrens extends Person {
    protected List<Person> PerentsList;

    public Childrens(String name, String surname, int YearOfBirth, int YearOfDeath, String sex, ArrayList<Childrens> ChildrenList, List<Person> PerentsList) {
        super(name, surname, YearOfBirth, YearOfDeath, sex, ChildrenList);
        this.PerentsList = PerentsList;
    }

    public Childrens(String name, String surname, int YearOfBirth, int YearOfDeath, String sex) {
        this(name, surname, YearOfBirth, YearOfDeath, sex, new ArrayList<>(), new ArrayList<>());
    }

    public Childrens(String name, String surname, int YearOfBirth, String sex) {
        super(name, surname, YearOfBirth, sex);
        this.PerentsList = new ArrayList<>();
    }


    public List<Person> getPerentsList() {
        return PerentsList;
    }

    @Override
    public String toString() {

        return super.toString() +
                "Parents=" + this.printParentsList() +
                '}';
    }

    public Map<Integer, String> printParentsList() {
        int i = 1;
        Map<Integer, String> s = new HashMap<>();
        for (Person ch : this.getPerentsList()) {
            s.put(i, "name-" + ch.getName() + " surname-" + ch.getSurname() + " YOB-" + ch.getYearOfBirth());
            i++;
        }
        return s;
    }

    public Map<Integer, String> printGrandParentsList() {
        ;
        Map<Integer, String> s = new HashMap<>();
        for (Person ch : this.getPerentsList()
        ) {
            if (ch instanceof Childrens) {
                s.putAll(((Childrens) ch).printParentsList());
            }
        }
        return s;
    }

    public void EatBorsh(Products prod) {
        if (prod.getBosch() > 0) {
            prod.setBosch(prod.getBosch() - 1);
            System.out.println(this.getName() + " " + this.getSurname() + " ate  borsch. Remain - " + prod.getBosch() + " borsch(es)");
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " want to eat bosch. But there is no any!");
        }
    }

    public void EatSrumEgg(Products prod) {
        if (prod.getScrambleEgg() > 0) {
            prod.setScrambleEgg(prod.getScrambleEgg() - 1);
            System.out.println(this.getName() + " " + this.getSurname() + " ate  scrambleEgg . Remain - " + prod.getScrambleEgg() + " scramble Egg(s)");
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " want to eat scramble Egg. But there is no any!");
        }
    }

}
