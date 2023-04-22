public class Main {
    public static void main(String[] args)  {
        var Ivan = new Human("Иван", 35, 85);
        Cat Barsik = new Cat("Барсик", 5, 4);
        Dog Tuzik = new Dog("Тузик", 7, 12);
        Human Irina = new Human("Ирина", 21, 50);
        Ivan.increaseWeight(5);
        System.out.println(Ivan +" "+ Barsik.toString());
        Ivan.takePet(Barsik);
        System.out.println(Ivan.petList);
        Ivan.takePet(Tuzik);
        System.out.println(Ivan.petList + " " + Tuzik.getOwner()) ;
        Ivan.takePet(Barsik);
        System.out.println(Ivan.petList);
        System.out.println(Irina.petList);
        System.out.println(Tuzik);
        Actioner action = new Actioner();
        for (int i = 0; i < 4; i++) {
            action.animalIsMakeAction(Tuzik);
        }
        System.out.println(Tuzik);
        System.out.println(Barsik);
        for (int i = 0; i < 4; i++) {
            action.animalIsMakeAction(Barsik);
        }
        System.out.println(Barsik);
    
    }
}