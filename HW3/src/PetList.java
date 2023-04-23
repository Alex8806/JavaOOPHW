import java.util.ArrayList;
import java.util.List;

public class PetList implements PetListInerf {
    protected List<Pet> petList;


    public PetList() {
        this.petList = new ArrayList<>();
    }

    @Override
    public String toString() {
        if (petList == null) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(" Pets:");
            int n = 1;
            for (Pet p : petList
            ) {
                sb.append(String.format(" %d %s ", n, p.getName()));
                n++;
            }
            return sb.toString();
        }
    }
}


