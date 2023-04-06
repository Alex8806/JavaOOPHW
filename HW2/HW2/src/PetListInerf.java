import java.util.ArrayList;

public interface PetListInerf {
    default void takePet(Human h1, Pet p1) {
        if(p1.getOwner()!= null){
            System.out.println(String.format("Previous owner of %s %s, just lost his pet",p1.getName(), p1.owner.getName()));
            p1.owner.petList.petList.remove(p1);
        }
        if (h1.petList == null) {
            h1.petList = new PetList();
        }
        h1.petList.petList.add(p1);
        p1.owner = h1;
    }



}

