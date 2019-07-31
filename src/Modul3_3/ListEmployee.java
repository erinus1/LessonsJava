package Modul3_3;

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

        Employee person1 = new Information();
        Employee person2 = new Employee("Ivan", "Ivanov", "single");

        System.out.println("Name is ");
        System.out.println("Surname is ");
        System.out.println("Status is ");
        System.out.println("ID is ");


    }
}