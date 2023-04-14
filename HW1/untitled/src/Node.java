public class Node {
    private int id = 0;
    private Husband has;
    private Wife wife;

    @Override
    public String toString() {
        return "Node{" +
                "has=" + has +
                ", wife=" + wife +
                ", status='" + status + '\'' +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public int getId() {
        return id;
    }

    public Husband getHas() {
        return has;
    }

    public Wife getWife() {
        return wife;
    }

    public String getStatus() {
        return status;
    }

    public Node(Husband has, Wife wife) {
        this.has = has;
        this.wife = wife;
        this.status = "married";
        id++;
    }

}
