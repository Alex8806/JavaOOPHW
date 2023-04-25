import java.util.Scanner;

public class Start {
    public static void click() {
        View view = new ConsoleView();
        Presenter p = new Presenter(Config.path, view);
        p.LoadFromFile();
        Scanner in = new Scanner(System.in);
        String key;
        Boolean flag =true;
        p.print();
        while (flag) {
            System.out.println("----Commands----\n1-print book\n2-add contact\n3-delete contact\nq-exit\nqs-save and exit");
            key=in.next();
            switch (key) {
                case "1":
                    p.print();
                    continue;
                case "2":
                    p.add();
                    continue;
                case "3":
                    p.remove();
                    continue;
                case "q":
                    flag=false;
                    break;
                case "qs":
                    p.saveToFile();
                    flag=false;
                    break;
                default:
                    System.out.println("wrong command");
            }

        }
    }
}
