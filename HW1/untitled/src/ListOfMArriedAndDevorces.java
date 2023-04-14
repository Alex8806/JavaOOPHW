import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMArriedAndDevorces implements RaltionsInterface {
    private static List<Node> currentRelations = new ArrayList<>();
    private static int idOfDevorce = 1;
    private static Map<Integer, List<Node>> mapOfDevorces = new HashMap<>();
    @Override
    public String toString() {
        return "ListOfMArriedAndDevorces{" +
                "currentRelations=" + currentRelations +
                ", mapOfDevorces=" + mapOfDevorces +
                '}';
    }




    @Override
    public void getMarried(Husband hus, Wife wife) {
        if ((hus.getNode() == null || hus.getNode().getStatus().toLowerCase() != "married") && (wife.getNode() == null || wife.getNode().getStatus().toLowerCase() != "married")) {
            Node node = new Node(hus, wife);
            hus.setNode(node);
            wife.setNode(node);
            currentRelations.add(node);
        }
        else {
            System.out.println(String.format("Error in %s and %s marriage ", hus.getName(), wife.getName()));
        }
    }

    @Override
    public void getDevorced(Husband hus, Wife wife) {
        if ((hus.getNode() != null && hus.getNode().getStatus().toLowerCase() == "married") && (wife.getNode() != null || wife.getNode().getStatus().toLowerCase() == "married")) {

    }
}}

