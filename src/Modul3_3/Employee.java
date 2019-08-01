package src.Modul3_3;
import java.util.Random;

public class Employee {

    String name;
    String surname;
    String status;
    int id;

    Random random = new Random();

    public void setID(){
        id = 1;
    }

    int getID(){
        return id;
    }

    public void setIDRandom(){
        id = random.nextInt(1);
    }

    int getIDRandom() {
        id +=1;
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    String getSurname(){
        return surname;
    }

    String getStatus(){
        return status;
    }

}


