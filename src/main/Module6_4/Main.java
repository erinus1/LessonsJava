package main.Module6_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        DataBase database = new DataBase();

        database.add(new Passport("EH", 58567), new Citizen("Ivan","Dorov"));
        database.add(new Passport("PH", 48837), new Citizen("Lena","Petrova"));
        database.add(new Passport("EH", 05677), new Citizen("Petr","Kotov"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter serial of passport:");
        String seria = sc.nextLine();

        System.out.println("Enter number of passport:");
        int number = sc.nextInt();

        Citizen requestedCitizen = database.findBy(new Passport(seria, number));

        if (requestedCitizen == null) {
            System.out.println("There is not a requested citizen");
        } else {
            System.out.println("Find at data base " + requestedCitizen.sayYourName());
        }
    }
}
