public class Products {

    private int egg;
    private int potato;
    private int carrot;
    private int onion;
    private  int beet;
    private int meat;
    private int bosch;
    private int scrambleEgg;

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public int getPotato() {
        return potato;
    }

    public void setPotato(int potato) {
        this.potato = potato;
    }

    public int getCarrot() {
        return carrot;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    public int getOnion() {
        return onion;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public int getBeet() {
        return beet;
    }

    public void setBeet(int beet) {
        this.beet = beet;
    }

    public int getBosch() {
        return bosch;
    }

    public void setBosch(int bosch) {
        this.bosch = bosch;
    }

    public int getScrambleEgg() {
        return scrambleEgg;
    }

    public void setScrambleEgg(int scrambleEgg) {
        this.scrambleEgg = scrambleEgg;
    }

    public void PlusSetterForAnyProd (String s , int n){
        if(s.toLowerCase().equals("potato")){this.potato = this.getPotato() + n;}
        else if (s.toLowerCase().equals("egg")){this.egg = this.getEgg() + n;}
        else if (s.toLowerCase().equals("carrot")){this.carrot = this.getCarrot() + n;}
        else if (s.toLowerCase().equals("onion")){this.onion = this.getOnion() + n;}
        else if (s.toLowerCase().equals("beet")){this.beet = this.getBeet() + n;}
        else if (s.toLowerCase().equals("bosch")){this.bosch = this.getBosch() + n;}
        else if (s.toLowerCase().equals("meat")){this.meat = this.getMeat() + n;}
        else if (s.toLowerCase().equals("scrambleEgg")){this.scrambleEgg = this.getScrambleEgg() + n;}
        else {
            System.out.println("No such product");}}

    public Products(){
        this.beet=0;
        this.bosch=0;
        this.carrot=0;
        this.egg=0;
        this.onion=0;
        this.potato=0;
        this.scrambleEgg=0;
    }

    @Override
    public String toString() {
        return "products at home{" +
                "egg=" + egg +
                ", potato=" + potato +
                ", carrot=" + carrot +
                ", onion=" + onion +
                ", beet=" + beet +
                ", bosch=" + bosch +
                ", scrambleEgg=" + scrambleEgg +
                '}';
    }


}
