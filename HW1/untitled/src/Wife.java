import java.util.HashMap;
import java.util.Map;

public class Wife extends Childrens {
    public void setNode(Node node) {
        this.node = node;
    }

    protected Node node;

    public Node getNode() {
        return node;
    }

    public Wife(String name, String surname, int YearOfBirth) {
        super(name, surname, YearOfBirth, "female");
        this.node = null;
    }
//public void callToShop(products prod,String s , int n){
//        Map <String, Method>
//
//}

    public void toMakeBorsch(Products prod, int ammount) {
        System.out.println(this.getName() + " " + this.getSurname() + " start to make " + ammount + " borsch(s)");
        Map<String, Integer> prodWeNeed = new HashMap<>();
        prodWeNeed.put("potato", 3 * ammount);
        prodWeNeed.put("carrot", 1 * ammount);
        prodWeNeed.put("meat", 2 * ammount);
        prodWeNeed.put("onion", 1 * ammount);
        prodWeNeed.put("beet", 2 * ammount);
        Map<String, Integer> prodWeHave = new HashMap<>();
        prodWeHave.put("potato", prod.getPotato());
        prodWeHave.put("carrot", prod.getCarrot());
        prodWeHave.put("meat", prod.getMeat());
        prodWeHave.put("onion", prod.getOnion());
        prodWeHave.put("beet", prod.getBeet());
        boolean flag = true;
        for (var s : prodWeNeed.entrySet()) {
            if (s.getValue() > prodWeHave.get(s.getKey()))
            {flag= false;
                System.out.println("Honey, we don't have " + Math.abs(prodWeHave.get(s.getKey()) - s.getValue()) + " " + s.getKey() + " for " + ammount + " borsches");
                node.getHas().goToShop(s.getKey(), Math.abs(prodWeHave.get(s.getKey()) - s.getValue()), prod);
            }

        }
        if (flag == true) {
            for (var s : prodWeNeed.entrySet()) {
                prod.PlusSetterForAnyProd(s.getKey(), s.getValue()*-1);
            }
            prod.setBosch(prod.getBosch() + ammount );

        }
    }
}