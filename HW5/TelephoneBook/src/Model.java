import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Model {
    Phonebook phonebook;
    String path;

    public Model(String path) {
        phonebook = new Phonebook();
        this.path = path;
    }

    public boolean load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String entry = reader.readLine();
            while (entry != null) {
                String[] split = entry.split("///");
                String name = split[0];
                String surname = split[1];
                List<Integer> numbers = new ArrayList<>();
                String s = split[2];
                if (s != "") {
                    String[] stringNumbers = split[2].split("/");
                    for (String n :
                            stringNumbers) {
                        numbers.add(Integer.parseInt(n));
                    }
                }
                String email = split[3];
                s = split[4];
                String[] stringDOB = s.split("/");
                phonebook.add(new Contact(name, surname, numbers, email,
                        new DOB((Integer.parseInt(stringDOB[0])), (Integer.parseInt(stringDOB[1])), (Integer.parseInt(stringDOB[2])))));
                entry = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (Contact c :
                    this.phonebook.contactList) {
                writer.append(String.format("%s///", c.name));
                writer.append(String.format("%s///", c.surname));
                for (int i :
                        c.numbers) {
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
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}


