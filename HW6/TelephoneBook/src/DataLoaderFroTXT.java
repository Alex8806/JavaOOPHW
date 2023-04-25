import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DataLoaderFroTXT extends DataLoader  {

    public boolean load(Model m) {
        try {
            File file = new File(path);
            FileReader fr = new
                    FileReader(file);
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
                m.phonebook.add(new Contact(name, surname, numbers, email,
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
}
