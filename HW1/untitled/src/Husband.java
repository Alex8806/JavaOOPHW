public class Husband extends Childrens{

    protected Node node;

    public Node getNode() {
        return node;
    }
    public void setNode(Node node) {
        this.node = node;
    }

    public Husband(String name, String surname, int YearOfBirth) {
        super(name, surname, YearOfBirth, "male");
        this.node=null;
    }



    public void goToShop(String s, int n, Products prod){

        System.out.println("Husband is going to the shop for " + n + " " + s );
        prod.PlusSetterForAnyProd(s,n);
    }
}
