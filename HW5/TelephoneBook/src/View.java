import java.util.List;

public interface View {
    String getFirstname();
    void  setFirstName (String  name);
    String getLastName();
    void setLastName(String surname);
    List<Integer> getNumbers();
    void setNumbers( List<Integer> numbers);
    String getEmail();
    void setEmail(String surname);
    DOB getDOB();

    void setDOB(DOB dob);
    public int getIndex(List<Contact> contactList);



}
