import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {
    String name;
    String surname;
    List<Integer> numbers;
    String email;
    DOB dob;

    public Contact(String name, String surname, List<Integer> numbers, String email, DOB dob) {
        this.name = name;
        this.surname = surname;
        this.numbers = numbers;
        this.email = email;
        this.dob = dob;
    }

    public Contact(String name, String surname, List<Integer> numbers, String email) {
        this(name, surname, numbers, email, new DOB());
    }

    public Contact(String name, String surname, List<Integer> numbers) {
        this(name, surname, numbers, "N/A");
    }
    public Contact(String name, String surname,  String email){
        this(name, surname, new ArrayList<>(), email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(surname, contact.surname) && Objects.equals(dob, contact.dob);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numbers=" + numbers +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
