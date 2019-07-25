package Modul3_3;


import java.util.Random;

public class ListEmployee {

    public static void main(String[] args) {

    Employee person1 = new Employee("Katya ", "Lavanova ", 72245);

    person1.name = "Ivan ";
    person1.surname = "Petrov ";

    //Employee person2 = new Employee();

    System.out.println ("There is an employee: " + person1.print() + person1.getId());

    //System.out.println ("There is an employee: " + person2.setInfo("Petya ", "Ivanov ", 52245) );
    }


}