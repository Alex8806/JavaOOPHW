import java.io.FileWriter;
import java.io.IOException;

public class DataSaverToTxt extends DataSaver{
    Model m;

    public DataSaverToTxt(Model m) {
        this.m = m;
    }

    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (Contact c : m.phonebook.contactList) {
                writer.append(String.format("%s///", c.name));
                writer.append(String.format("%s///", c.surname));
                for (int i : c.numbers) {
                    writer.append(String.format("%d/", i));
                }
                writer.append(String.format("///"));
                writer.append(String.format("%s///", c.email));
                writer.append((c.dob.toString()));
                writer.append("\n");
            }
            writer.flush();
            writer.close();
            System.out.println("done");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
