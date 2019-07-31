package Modul3_3;

import java.util.Random;

public class Information extends Employee {
    String name;
    String surname;
    String status;
    int id;
    Random random = new Random();

    void setID(int id){
        id = 10;
    }

    int getID(){
        return id;
    }

    void setIDRandom(int id){
        id = random.nextInt(100);
    }

    int getIDRandom() {
        id +=1;
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


