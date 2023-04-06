public class Eat  {

public void EatSomthing(int weight , Animal a1 ){
    System.out.print(a1.getSound() + a1.getSound()+a1.getSound()+ " ");
    System.out.println(String.format("%s %s eat and get  %d weight", a1.getClass(), a1.getName(), weight));
    a1.increaseWeight(weight);
}
}
