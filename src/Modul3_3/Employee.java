package Modul3_3;
import java.util.Random;

public class Employee {

    String in;

    Random random = new Random();
    int id;
    String info;

    String setInfo(String name, String surname, String status){ //method info

        info = name + " " + surname + " - " + status;

        return info;
    }

    String getInfo(){
        return info;
    }

    Employee(){ //constructor
        id = random.nextInt(100);
    }
    int setId(){
        id = id;
        return id;
    }

    int getId() {
        id +=1;
        return id;
    }
}