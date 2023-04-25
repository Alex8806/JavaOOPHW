import java.util.Scanner;

public interface CheckerYesNo  {
    default boolean checkerYesNo(Scanner in) {
        System.out.println("Wish to type yes/no");
        while (true) {
            switch (in.next().toLowerCase()) {
                case "yes":
                    return true;
                case "no":
                    return false;
                default:
                    System.out.println(" YES OR NO! WHAT CAN YOU NOT UNDERSTAND?");
            }
        }
    }

}
