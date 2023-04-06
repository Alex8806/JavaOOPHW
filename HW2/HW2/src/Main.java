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
        Irina.takePet(Barsik);
        System.out.println(Ivan.petList);
        System.out.println(Irina.petList);



    }
}