package Modul3_3;
import java.util.Random;


public class Employee {

    String name; //x
    String surname;

    Random random = new Random();
    int id = random.nextInt(5241);

    String setInfo(String name, String surname, int id){
        return name + surname + id;
    }

    Employee(String name, String surname, int id){ //constructor
    }

    Employee(int id){  //constructor 2
    }


    int getId() {
    id +=1;
    return id;
    }



    public String print(){
        return name + surname + id;

    }

    }




