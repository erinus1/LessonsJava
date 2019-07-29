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

        Employee person1 = new Employee();

        System.out.println("There is an employee: " + person1.setInfo(name, surname, status) + ", id is " + person1.getId());
        System.out.println("Next id is " + person1.getId());
    }
}