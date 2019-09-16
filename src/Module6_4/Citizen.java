package Module6_4;
import java.util.HashMap;

public class Citizen {
    HashMap<String, String> person = new HashMap<String, String>();

    public void setPerson(HashMap<String, String> person) {
        person.put("Petr","Petrov");
        person.put("Ivan","Ivanov");
        person.put("Lesya","Kotova");
        person.put("Olga","Frolova");
    }
    public HashMap<String, String> getPerson() {
        return person;
    }
}
