import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;

    public boolean checkerYesNo() {
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

    public ConsoleView() {
        this.in = new Scanner(System.in);
    }

    @Override
    public String getFirstname() {
        System.out.printf("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String name) {
        System.out.printf("FirstName: %s\n", name);
    }

    @Override
    public String getLastName() {
        System.out.printf("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String surname) {
        System.out.printf("LastName: %s\n", surname);
    }

    @Override
    public List<Integer> getNumbers() {
        List<Integer> numners = new ArrayList<Integer>();
        System.out.println("Type number to add or q to finish");
        String s = in.nextLine();
        while (!s.toLowerCase().equals("q")) {
            try {
                int n = Integer.parseInt(s);
                if (n >= 0) {
                    numners.add(n);
                } else {
                    System.out.println("without minus!");
                }
            } catch (NumberFormatException e) {
                System.out.println("not number");
            }
            s = in.nextLine();
        }
        return numners;
    }

    @Override
    public void setNumbers(List<Integer> numbers) {
        System.out.println("Numbers" + numbers);
    }

    @Override
    public String getEmail() {
        System.out.printf("Email: ");
        if (this.checkerYesNo()) {
            return in.nextLine();
        } else {
            return "N/A";
        }
    }

    @Override
    public void setEmail(String email) {
        System.out.printf("LastName: %s\n", email);
    }

    @Override
    public DOB getDOB() {
        System.out.println("Day of birthday:");
        if (this.checkerYesNo()) {
            int day;
            int month;
            int year;
            System.out.println(" Day ");
            day = in.nextInt();
            while (day <= 0 || day > 31) {
                System.out.println("wrong day! type new");
                day = in.nextInt();
            }
            System.out.println("Month");
            month = in.nextInt();
            while (month <= 0 || month > 12) {
                System.out.println("wrong month! type new");
                month = in.nextInt();
            }
            System.out.println("Year: ");
            year = in.nextInt();
            while (year <= 0) {
                System.out.println("wrong year! type new");
                year = in.nextInt();
            }
            return new DOB(day, month, year);
        } else {
            return new DOB();
        }
    }

    @Override
    public void setDOB(DOB dob) {
        System.out.println("DOB: " + dob);
    }

    public int getIndex(List<Contact> contactList) {
        System.out.println("Type index");
        int index = in.nextInt();
        while (index < 0 || index >= contactList.size()) {
            System.out.println("Wrong index. type again");
            index = in.nextInt();
        }
        return index;
    }


}
