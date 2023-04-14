import java.util.*;

public class Person {
    private String name;
    private String surname;
    private int YearOfBirth;
    private int YearOfDeath;
    private String sex;
    private ArrayList<Childrens> ChildrenList;

    public Person(String name, String surname, int YearOfBirth, int YearOfDeath, String sex, ArrayList<Childrens> ChildrenList) {
        this.name = name;
        this.surname = surname;
        this.YearOfBirth = YearOfBirth;
        this.YearOfDeath = YearOfDeath;
        this.sex= sex;
        this.ChildrenList = ChildrenList;
    }

    public Person(String name, String surname, int YearOfBirth, int YearOfDeath, String sex) {
        this(name, surname, YearOfBirth, YearOfDeath, sex, new ArrayList<>());
    }

    public Person(String name, String surname, int YearOfBirth, String sex) {
        this(name, surname, YearOfBirth, 99999, sex, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public int getYearOfDeath() {
        return YearOfDeath;
    }

    public String getSex() {
        return sex;
    }

    public ArrayList<Childrens> getChildrenList() {
        return ChildrenList;
    }


    @Override
    public String toString() {
        String DeathYear;
        if (YearOfDeath >= 99999) {
            DeathYear = "up to now";
        } else {
            DeathYear = Integer.toString(this.YearOfDeath);
        }

        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                ", YearOfDeath=" + DeathYear +
                ", sex='" + sex + '\'' +
              ", Children=" + this.printChildrenList()+
                '}';
    }

    public Map<Integer , String> printChildrenList(){
     int i = 1;
     Map <Integer, String> s = new HashMap<>();
        for (Person ch:this.getChildrenList()) {
            s.put(i, "name-" +ch.getName()+ " surname-" + ch.getSurname() + " YOB-"+ ch.getYearOfBirth());
        }
        return s;
    }

    public boolean checkTomakeChildren (Person parent2,Childrens children ){
        if (this.YearOfDeath < parent2.getYearOfBirth() || this.YearOfBirth > parent2.getYearOfDeath()) {
            System.out.println("Error. One of the parents already DEAD");
            return false;
        }
        if (this.sex.toLowerCase().equals(parent2.getSex().toLowerCase())) {
            System.out.println("Error. Parents have same sex");
            return false;
        }
        if (children.getYearOfBirth() < this.YearOfBirth || children.getYearOfBirth() < parent2.getYearOfBirth()) {
            System.out.println("Error. Children older then one of the parent");
            return false;
        }
        if (children.getPerentsList().isEmpty()==false  ){
            System.out.println("Children " + children.getName()+ " " + children.getSurname() +" already has parents");
            return false;
        }
        return true;
    }
    public void makeChildren(Person parent2, Childrens children) {
        if( this.checkTomakeChildren(parent2,children)==false){return;}
        this.ChildrenList.add(children);
        parent2.ChildrenList.add(children);
        children.PerentsList.add(this);
        children.PerentsList.add(parent2);

    }
}