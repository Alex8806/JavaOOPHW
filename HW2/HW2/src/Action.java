public interface Action extends incraseWeight {
    default void jump(Animal a1, int looseWeight) {
        if (a1.getWeight() - looseWeight > 1) {
            System.out.println(String.format("%s %s jump and loose %d weight", a1.getClass(), a1.getName(), looseWeight));
            a1.increaseWeight(-looseWeight);

        } else {
            System.out.println(String.format("%s %s try to jump but don't have power", a1.getClass(), a1.getName()));
        }
    }
default void voice (Animal a1, int looseWeight){
    if (a1.getWeight() - looseWeight > 1) {
        System.out.println(String.format("%s %s says %s and loose %d weight", a1.getClass(), a1.getName(),a1.getSound(), looseWeight));
        a1.increaseWeight(-looseWeight);

    } else {
        System.out.println(String.format("%s %s try to %s but don't have power", a1.getClass(), a1.getName(), a1.getSound()));
    }
}

    default void animalIsMakeAction(Animal a1) {
        int n = (int) Math.random()*3;
        switch (n) {
            case 0: jump(a1,3);
            break;
            case 1: voice(a1, 1);
            break;
            case 2: if(a1.getClass()==Cat.class){}

        }
    }
}
