import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Model {
    Phonebook phonebook;

    DataSaver ds = new DataSaverToTxt(this);
    DataLoaderFroTXT dl = new DataLoaderFroTXT();

    public Model(String path) {
        phonebook = new Phonebook();
    }


}


