public class Presenter {
    private Model model;
    private View view;

    public Presenter(String pathDB, View view) {

        this.view = view;
        this.model = new Model(pathDB);
    }

    public void LoadFromFile() {
        if (!model.load()) {
            model.phonebook = new Phonebook();
            System.out.println("Try to load phone book from " + Config.path + " but failed. Empty phone book created.");
        }
    }

    public void add() {
        this.model.phonebook.add(new Contact(view.getFirstname(), view.getLastName(), view.getNumbers(), view.getEmail(), view.getDOB()));
    }

    public void saveToFile() {
        model.save();
    }

    public void print() {
        for (int i = 0; i < model.phonebook.contactList.size() ; i++) {
            System.out.println(i + " " + model.phonebook.getContact(i));
        }
    }

    public void remove() {
        if (model.phonebook.contactList.size() > 0) {
            model.phonebook.contactList.remove(view.getIndex(model.phonebook.contactList));
        } else {
            System.out.println("No any records yet");
        }
    }
}
