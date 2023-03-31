import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Husband extends Childrens{
    protected Wife wife;

    public Husband(String name, String surname, int YearOfBirth) {
        super(name, surname, YearOfBirth, "male");
        this.wife=wife;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }


    public void goToShop(String s, int n, products prod){

        System.out.println("Husband is going to the shop for " + n + " " + s );
        prod.PlusSetterForAnyProd(s,n);
    }
}
