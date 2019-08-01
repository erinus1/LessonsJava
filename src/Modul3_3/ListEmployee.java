package src.Modul3_3;
import java.util.Scanner;

public class ListEmployee {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name:  ");
        String name = in.nextLine();


        System.out.println("Enter your surname:  ");
        String surname = in.nextLine();

        System.out.println("Enter your status:  ");
        String status = in.nextLine();


        Information person1 = new Information(name , surname, status);
        Information employeeID = new Information();


        System.out.println("Name is " + person1.getName());
        System.out.println("Surname is " + person1.getSurname());
        System.out.println("Status is " + person1.getStatus());
        System.out.println("ID is " + person1.getID() + " Next ID is " + person1.getIDRandom() );


    }
}