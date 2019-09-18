package Module6_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataBase database = new DataBase();
        Scanner sc = new Scanner(System.in);

        Passport passport = new Passport("EH", 0567);
        Citizen citizen = new Citizen("Petr","Petrov");

        Passport passport1 = new Passport("EH", 8567);
        Citizen citizen1 = new Citizen("Ivan","Petrov");


        Passport passport2 = new Passport("EH", 7567);
        Citizen citizen2 = new Citizen("Lena","Petrova");

        database.add(passport, citizen);

        System.out.println("Enter serial number:");
        int seria = sc.nextInt();

        //System.out.println("Find at data base " + database.findBy(passport));
        System.out.println(passport.equals(passport1));
        System.out.println(passport.hashCode());
        System.out.println(passport1.hashCode());
    }
}
