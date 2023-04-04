import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ownership extends PetList {
    Map<Human, PetList> ownership ;

    public Map<Human, PetList> getOwnership() {
        return ownership;
    }

    public void setOwnership(Map<Human, PetList> ownership) {
        this.ownership = ownership;
    }

    public Ownership() {
        Map<Human, PetList> ownership = new HashMap<>();
    }

    public Ownership(Map<Human, PetList> ownership) {

        this.ownership = ownership;
    }

    public void appEnd(Human h1, Animal pet1) {
        this.getOwnership().get(h1).getPetList().add(pet1);

    }
}
