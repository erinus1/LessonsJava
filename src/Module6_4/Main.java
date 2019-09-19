package Module6_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataBase database = new DataBase();
        Scanner sc = new Scanner(System.in);
        Passport passport = new Passport("EL", 68354);
        Passport passport1 = new Passport("PJ", 78374);
        Citizen citizen = new Citizen("Kolya", "Ivanov");
        database.add(passport,citizen);
        database.add(new Passport("EH", 58567),new Citizen("Ivan","Dorop"));
        database.add(new Passport("PH", 48837),new Citizen("Lena","Petrova"));
        database.add(new Passport("EH", 05677),new Citizen("Petr","Kotov"));
        Citizen first = database.findBy(passport);

        //System.out.println("Enter serial number:");
        //String seria = sc.nextLine();

        //System.out.println("Find at data base "  + first.sayYourName());

        System.out.println(passport.equals(passport1));
        //System.out.println(database.findBy(passport));
    }
}
