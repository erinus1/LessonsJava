package Modul3_3;
import java.util.Random;

public class Employee {
    String name;
    String surname;
    String status;
    int id;

    int getID(){
        return id;
    }

    void setID(int id) {
        this.id = id;
    }

    public void setIDRandom(){
        Random random = new Random();
        setID(random.nextInt(100));
    }

    int getIDRandom() {
        return id;
    }

    String getName(){
        return name;
    }

    String getSurname(){
        return surname;
    }

    String getStatus(){
        return status;
    }
}