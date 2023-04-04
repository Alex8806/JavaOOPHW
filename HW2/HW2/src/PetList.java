import java.util.ArrayList;
import java.util.List;

public abstract class PetList implements PetListInerf {
    private List<Animal> petList;

    public List<Animal> getPetList() {
        return petList;
    }

    public void setPetList(List<Animal> petList) {
        this.petList = petList;
    }

    public PetList(List<Animal> petList) {
        this.petList = petList;
    }

    public PetList() {
        this.petList = petList;
    }


}


