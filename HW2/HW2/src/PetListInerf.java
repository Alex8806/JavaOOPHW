import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public interface PetListInerf {
    void append(Human h1, Animal a1);
    List<Animal> petlist1 = new ArrayList<>();

    default void print(List petlist1){
        System.out.println(petlist1);
    }

}
